package com.cycfc.borrow.exception;

import com.cycfc.borrow.response.BusinessErrorCodeEnum;
import lombok.Data;

/**
 * @program: borrow-front
 * @description: 业务自定义异常
 * @author: wwt
 * @create: 2020-02-17 10:33
 **/
@Data
public class BusinessException extends RuntimeException {
    private String code;
    private String msg;

    public BusinessException(BusinessErrorCodeEnum errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMessage();
    }

    public BusinessException(BusinessErrorCodeEnum errorCode, Throwable cause) {
        super(errorCode.getMessage() , cause);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(String code,String message) {
        super(message);
        this.code = code;
    }

}