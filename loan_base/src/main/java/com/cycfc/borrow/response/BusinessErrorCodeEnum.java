package com.cycfc.borrow.response;

import lombok.Getter;

/**
 *
 */
@Getter
public enum BusinessErrorCodeEnum {

    /**
     * 通用业务异常
     */
    BUSINESS_ERROR("BORROW800","业务异常"),
    ;

    private String code;

    private String message;

    BusinessErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
