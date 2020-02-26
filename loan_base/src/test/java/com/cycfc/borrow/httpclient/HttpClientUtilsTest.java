package com.cycfc.borrow.httpclient;

import com.cycfc.borrow.pojo.HttpClientResult;

import java.util.HashMap;
import java.util.Map;

public class HttpClientUtilsTest {

    public static void main(String[] args) throws Exception {
        Map<String, String> params = new HashMap<>();
        params.put("userId","18087784933");
        HttpClientResult result = HttpClientUtils.doGet("http://localhost:8095/user/getUserInfo",params);
        System.out.println(result);
    }

}
