package com.cycfc.borrow.exception;

/**
 * @program: cycfc-borrow-front
 * @description: HttpClient异常类
 * @author: wwt
 * @create: 2020-02-17 17:27
 **/
public class HttpProcessException extends RuntimeException {


    private static final long serialVersionUID = -1118711709172180734L;

    public HttpProcessException(Exception e){
        super(e);
    }

    /**
     * @param msg	消息
     */
    public HttpProcessException(String msg) {
        super(msg);
    }

    /**
     * @param message	异常消息
     * @param e			异常
     */
    public HttpProcessException(String message, Exception e) {
        super(message, e);
    }
}