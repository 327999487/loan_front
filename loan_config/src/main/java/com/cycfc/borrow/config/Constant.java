package com.cycfc.borrow.config;

/**
 * @program: loan-front
 * @description: 常量属性
 * @author: wwt
 * @create: 2020-02-17 15:28
 **/
public class Constant {

    private Constant() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 商户申请的访问KEY
     */
    public static final String ACCESS_KEY_ID = "accessKeyId";

    /**
     * 商户访问签名参数
     */
    public static final String HEADER_SIGN = "sign";

    /**
     * 请求中 ACCESS_TOKEN 标志
     */
    public static final String ACCESS_TOKEN = "token";
}    