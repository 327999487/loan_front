package com.cycfc.borrow.format;

/**
 * @Author: wwt
 * @Date: 2019/11/08
 * @Description: 返回提示信息和返回码
 */
public enum ResponseCode {
    SUCCESS(200, "成功"),
    UNKNOWN(-1, "未知的错误");

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}