package com.cycfc.borrow.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: borrow-front
 * @description: 封装httpClient响应结果
 * @author: wwt
 * @create: 2020-02-17 17:22
 **/
@Data
public class HttpClientResult implements Serializable {


    private static final long serialVersionUID = -7357892256421944086L;

    /**
     * 响应状态码
     */
    private int code;

    /**
     * 响应数据
     */
    private String content;

    public HttpClientResult() {
    }

    public HttpClientResult(int code) {
        this.code = code;
    }

    public HttpClientResult(String content) {
        this.content = content;
    }

    public HttpClientResult(int code, String content) {
        this.code = code;
        this.content = content;
    }


    @Override
    public String toString() {
        return "HttpClientResult [code=" + code + ", content=" + content + "]";
    }

}