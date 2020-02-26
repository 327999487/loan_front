package com.cycfc.borrow.handler;

import com.cycfc.borrow.annotation.Sign;
import com.cycfc.borrow.common.IpUtils;
import com.cycfc.borrow.common.RequestSignUtils;
import com.cycfc.borrow.config.Constant;
import com.cycfc.borrow.exception.AccessException;
import com.cycfc.borrow.format.MsgEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: borrow-front
 * @description: 请求参数处理, 不处理body传过来的参数
 * @author: wwt
 * @create: 2020-02-17 14:50
 **/
@Slf4j
@Component
public class RequestParamHandler extends HandlerInterceptorAdapter {

    private ThreadLocal<Long> startTime = new ThreadLocal<>();

    /**
     * 在请求处理之前进行调用 - Controller方法调用之前
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        startTime.set(System.currentTimeMillis());

        log.info("开始请求 ==> {} {} {}", request.getMethod(), request.getServletPath(), IpUtils.getIpAddr(request));
        Enumeration<String> headerNames = request.getHeaderNames();
        String paraName;
        while (headerNames.hasMoreElements()) {
            paraName = headerNames.nextElement();
            log.info("请求header参数 ==> {}: {}", paraName, request.getHeader(paraName));
        }
        Enumeration<String> parameterNames = request.getParameterNames();
        Map<String, String> paraMap = new HashMap<>();
        while (parameterNames.hasMoreElements()) {
            paraName = parameterNames.nextElement();
            paraMap.put(paraName, request.getParameter(paraName));
            log.info("请求参数 ==> {}: {}", paraName, request.getParameter(paraName));
        }
//        response.setHeader("Access-Control-Allow-Methods", "*");
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, token");
        response.setCharacterEncoding("UTF-8");
        return validate(request, response, handler, paraMap);
    }

    /**
     * 请求验证
     *
     * @param request
     * @param response
     * @param handler
     * @param paraMap
     *            请求参数转为map后的数据
     * @return
     * @throws Exception
     */
    private boolean validate(HttpServletRequest request, HttpServletResponse response, Object handler,
                             Map<String, String> paraMap) throws Exception {
        // 不是映射到方法的不处理
        if (!(handler instanceof HandlerMethod)) {
            return super.preHandle(request, response, handler);
        }
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        Sign sign = method.getAnnotation(Sign.class);
        boolean existSign = (handlerMethod.getBeanType().getAnnotation(Sign.class) == null && sign == null)
                || (sign != null && !sign.hasSign());

        if (existSign ) {
            // 不需要验证
            return true;
        }
        if (!existSign) {
            // 进行签名验证
            validateSign(request, paraMap, method);
        }
        return true;
    }

    /**
     * 开始签名验证
     *
     * @param request
     * @param paraMap
     * @param method
     * @return
     * @throws AccessException
     */
    private boolean validateSign(HttpServletRequest request, Map<String, String> paraMap, Method method) throws AccessException{
        // 需要签名验证, 进行验证
        log.info("开始进行签名验证...");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        for (Annotation[] annotation1 : parameterAnnotations) {
            for (Annotation annotation2 : annotation1) {
                if (annotation2 instanceof RequestBody) {
                    log.info("转到RequestBodyParamHandler进行签名验证...");
                    return true;
                }
            }
        }
        Boolean validate = RequestSignUtils.validate(request.getHeader(Constant.ACCESS_KEY_ID),
                request.getHeader(Constant.HEADER_SIGN), paraMap);
        if (!validate) {
            throw new AccessException(MsgEnum.CHECK_SECRET);
        }
        return true;
    }


    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行(主要是用于进行资源清理工作)
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e)
            throws Exception {
        long times = System.currentTimeMillis() - startTime.get();
        log.info("结束请求 ==> {} {}s {}", request.getServletPath(), times / 1000, response.getStatus());
        startTime.remove();
    }
}    