package com.cycfc.borrow.exception;

import com.alibaba.druid.util.StringUtils;
import com.cycfc.borrow.format.DefaultResponse;
import com.cycfc.borrow.format.ResponseCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: cycfc-borrow-front
 * @description: 全局异常处理
 * @author: wwt
 * @create: 2020-02-17 10:38
 **/
@Slf4j
//@ControllerAdvice
@Deprecated
public class BorrowGlobalException {
    /**
     * catch所有controller异常，响应json
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public DefaultResponse handleException(Exception e){
        log.error("controller advice,", e);
        return DefaultResponse.builder()
                .glue(ResponseCodeEnum.UNKNOWN)
                .data(e.getMessage())
                .build();
    }

    /**
     * valid注解校验异常
     */
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public DefaultResponse handleValidException(BindException e){
        log.error("controller advice,", e);
        String names = "";
        for(FieldError fieldError : e.getFieldErrors()){
            if(!StringUtils.isEmpty(names)){
                names += ", ";
            }
            names += fieldError.getField();
        }
        return DefaultResponse.builder()
                .code(ResponseCodeEnum.UNKNOWN.getCode())
                .msg("参数错误")
                .data(names)
                .build();
    }

    /**
     * 业务异常
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public DefaultResponse handleBusException(BusinessException e){
        Throwable root = e;
        while (null != root.getCause()) {
            root = root.getCause();
        }
        log.error("controller advice,", root);
        return DefaultResponse.builder()
                .code(e.getCode())
                .msg(e.getMsg())
                .build();
    }


}    