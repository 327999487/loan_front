package com.cycfc.borrow.handler;

import com.cycfc.borrow.exception.AccessException;
import com.cycfc.borrow.exception.BusinessException;
import com.cycfc.borrow.format.ResponseCodeEnum;
import com.cycfc.borrow.format.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;

/**
 * @program: cycfc-borrow-front
 * @description: 基础全局异常处理
 * @author: wwt
 * @create: 2020-02-17 12:34
 **/
@Slf4j
@RestControllerAdvice
public class GlobalDefaultExceptionHandler {

    /**
     * NoHandlerFoundException 404 异常处理
     */
    @ExceptionHandler(value = NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResultResponse handlerNoHandlerFoundException(NoHandlerFoundException exception) {
        outPutErrorWarn(NoHandlerFoundException.class, ResponseCodeEnum.NOT_FOUND, exception);
        return ResultResponse.ofFail(ResponseCodeEnum.NOT_FOUND);
    }

    /**
     * HttpRequestMethodNotSupportedException 405 异常处理
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResultResponse handlerHttpRequestMethodNotSupportedException(
            HttpRequestMethodNotSupportedException exception) {
        outPutErrorWarn(HttpRequestMethodNotSupportedException.class,
                ResponseCodeEnum.METHOD_NOT_ALLOWED, exception);
        return ResultResponse.ofFail(ResponseCodeEnum.METHOD_NOT_ALLOWED);
    }

    /**
     * HttpMediaTypeNotSupportedException 415 异常处理
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResultResponse handlerHttpMediaTypeNotSupportedException(
            HttpMediaTypeNotSupportedException exception) {
        outPutErrorWarn(HttpMediaTypeNotSupportedException.class,
                ResponseCodeEnum.UNSUPPORTED_MEDIA_TYPE, exception);
        return ResultResponse.ofFail(ResponseCodeEnum.UNSUPPORTED_MEDIA_TYPE);
    }


    /**
     * BusinessException 类捕获
     */
    @ExceptionHandler(value = BusinessException.class)
    public ResultResponse handlerBusinessException(BusinessException e) {
        outPutError(BusinessException.class, ResponseCodeEnum.BUSINESS_ERROR, e);
        return ResultResponse.ofFail(e.getCode(), e.getMsg());
    }

    /**
     * BusinessException 类捕获
     */
    @ExceptionHandler(value = AccessException.class)
    public ResultResponse handlerAccessException(AccessException e) {
        outPutError(AccessException.class, ResponseCodeEnum.BUSINESS_ERROR, e);
        return ResultResponse.ofFail(e.getCode(), e.getMsg());
    }

    /**
     * HttpMessageNotReadableException 参数错误异常
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResultResponse handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        outPutError(HttpMessageNotReadableException.class, ResponseCodeEnum.PARAM_ERROR, e);
        String msg = String.format("%s : 错误详情( %s )", ResponseCodeEnum.PARAM_ERROR.getMessage(),
                e.getRootCause().getMessage());
        return ResultResponse.ofFail(ResponseCodeEnum.PARAM_ERROR.getCode(), msg);
    }

    /**
     * ConstraintViolationException 参数错误异常
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ResultResponse handleConstraintViolationException(ConstraintViolationException ex) {
        String smg = "";
        Set<ConstraintViolation<?>> constraintViolations = ex.getConstraintViolations();
        if (log.isDebugEnabled()) {
            for (ConstraintViolation error : constraintViolations) {
                log.error("{} -> {}", error.getPropertyPath(), error.getMessageTemplate());
                smg = error.getMessageTemplate();
            }
        }

        if (constraintViolations.isEmpty()) {
            log.error("validExceptionHandler error fieldErrors is empty");
            ResultResponse.ofFail(ResponseCodeEnum.BUSINESS_ERROR.getCode(), "");
        }

        return ResultResponse.ofFail(ResponseCodeEnum.PARAM_ERROR.getCode(), smg);
    }

    /**
     * MethodArgumentNotValidException 参数错误异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        return getBindResultDTO(bindingResult);
    }

    /**
     * BindException 参数错误异常
     */
    @ExceptionHandler(BindException.class)
    public ResultResponse handleBindException(BindException e) {
        outPutError(BindException.class, ResponseCodeEnum.PARAM_ERROR, e);
        BindingResult bindingResult = e.getBindingResult();
        return getBindResultDTO(bindingResult);
    }

    private ResultResponse getBindResultDTO(BindingResult bindingResult) {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (log.isDebugEnabled()) {
            for (FieldError error : fieldErrors) {
                log.error("{} -> {}", error.getDefaultMessage(), error.getDefaultMessage());
            }
        }

        if (fieldErrors.isEmpty()) {
            log.error("validExceptionHandler error fieldErrors is empty");
            ResultResponse.ofFail(ResponseCodeEnum.BUSINESS_ERROR.getCode(), "");
        }

        return ResultResponse
                .ofFail(ResponseCodeEnum.PARAM_ERROR.getCode(), fieldErrors.get(0).getDefaultMessage());
    }

    public void outPutError(Class errorType, Enum secondaryErrorType, Throwable throwable) {
        log.error("[{}] {}: {}", errorType.getSimpleName(), secondaryErrorType, throwable.getMessage(),
                throwable);
    }

    public void outPutErrorWarn(Class errorType, Enum secondaryErrorType, Throwable throwable) {
        log.warn("[{}] {}: {}", errorType.getSimpleName(), secondaryErrorType, throwable.getMessage());
    }
}    