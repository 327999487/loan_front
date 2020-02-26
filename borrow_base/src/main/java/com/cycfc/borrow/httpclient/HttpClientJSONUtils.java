package com.cycfc.borrow.httpclient;

import com.alibaba.fastjson.JSONObject;
import com.cycfc.borrow.exception.HttpProcessException;
import com.cycfc.borrow.pojo.HttpClientResult;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Set;

/**
 * @program: borrow-front
 * @description: httpClient工具类，json参数传递
 * @author: wwt
 * @create: 2020-02-17 20:23
 **/
public class HttpClientJSONUtils  {


    // 编码格式。发送编码格式统一用UTF-8
    private static final String ENCODING = "UTF-8";

    // 设置连接超时时间，单位毫秒。
    private static final int CONNECT_TIMEOUT = 6000;

    // 请求获取数据的超时时间(即响应时间)，单位毫秒。
    private static final int SOCKET_TIMEOUT = 6000;

    /**
     * 发送get请求；不带请求头和请求参数
     *
     * @param url 请求地址
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doGet(String url) throws HttpProcessException {
        return doGet(url, null, null);
    }

    /**
     * 发送get请求；带请求参数
     *
     * @param url 请求地址
     * @param params 请求参数集合
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doGet(String url, Map<String, String> params) throws HttpProcessException {
        return doGet(url, null, params);
    }

    /**
     * 发送get请求；带请求头和请求参数
     *
     * @param url 请求地址
     * @param headers 请求头集合
     * @param params 请求参数集合
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doGet(String url, Map<String, String> headers, Map<String, String> params) throws HttpProcessException {

        // 创建httpClient对象
        CloseableHttpClient httpClient = null;
        // 创建httpResponse对象
        CloseableHttpResponse httpResponse = null;
        try {
            // 创建httpClient对象
            httpClient = HttpClients.createDefault();

            // 创建访问的地址
            URIBuilder uriBuilder = new URIBuilder(url);
            if (params != null) {
                Set<Map.Entry<String, String>> entrySet = params.entrySet();
                for (Map.Entry<String, String> entry : entrySet) {
                    uriBuilder.setParameter(entry.getKey(), entry.getValue());
                }
            }

            // 创建http对象
            HttpGet httpGet = new HttpGet(uriBuilder.build());
            /**
             * setConnectTimeout：设置连接超时时间，单位毫秒。
             * setConnectionRequestTimeout：设置从connect Manager(连接池)获取Connection
             * 超时时间，单位毫秒。这个属性是新加的属性，因为目前版本是可以共享连接池的。
             * setSocketTimeout：请求获取数据的超时时间(即响应时间)，单位毫秒。 如果访问一个接口，多少时间内无法返回数据，就直接放弃此次调用。
             */
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
            httpGet.setConfig(requestConfig);

            // 设置请求头
            packageHeader(headers, httpGet);

            // 执行请求并获得响应结果
            return getHttpClientResult(httpResponse, httpClient, httpGet);
        } catch (Exception e){
            throw new HttpProcessException(e);
        }finally {
            // 释放资源
            release(httpResponse, httpClient);
        }
    }

    /**
     * 发送post请求；不带请求头和请求参数
     *
     * @param url 请求地址
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doPost(String url) throws HttpProcessException {
        return doPost(url, null, null);
    }

    /**
     * 发送post请求；带请求参数
     *
     * @param url 请求地址
     * @param jsonParams 参数集合
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doPost(String url, JSONObject jsonParams) throws HttpProcessException {
        return doPost(url, null, jsonParams);
    }

    /**
     * 发送post请求；带请求头和请求参数
     *
     * @param url 请求地址
     * @param headers 请求头集合
     * @param jsonParams 请求参数集合
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doPost(String url, Map<String, String> headers, JSONObject jsonParams) throws HttpProcessException {

        // 创建httpClient对象
        CloseableHttpClient httpClient = null;

        // 创建httpResponse对象
        CloseableHttpResponse httpResponse = null;

        try {
            // 创建httpClient对象
            httpClient = HttpClients.createDefault();

            // 创建http对象
            HttpPost httpPost = new HttpPost(url);
            /**
             * setConnectTimeout：设置连接超时时间，单位毫秒。
             * setConnectionRequestTimeout：设置从connect Manager(连接池)获取Connection
             * 超时时间，单位毫秒。这个属性是新加的属性，因为目前版本是可以共享连接池的。
             * setSocketTimeout：请求获取数据的超时时间(即响应时间)，单位毫秒。 如果访问一个接口，多少时间内无法返回数据，就直接放弃此次调用。
             */
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
            httpPost.setConfig(requestConfig);
            // 设置请求头
			/*httpPost.setHeader("Cookie", "");
			httpPost.setHeader("Connection", "keep-alive");
			httpPost.setHeader("Accept", "application/json");
			httpPost.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
			httpPost.setHeader("Accept-Encoding", "gzip, deflate, br");
			httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36");*/
            packageHeader(headers, httpPost);

            // 封装请求参数
            packageParam(jsonParams, httpPost);

            // 执行请求并获得响应结果
            return getHttpClientResult(httpResponse, httpClient, httpPost);
        } catch (Exception e){
            throw new HttpProcessException(e);
        }finally {
            // 释放资源
            release(httpResponse, httpClient);
        }
    }

    /**
     * 发送put请求；不带请求参数
     *
     * @param url 请求地址
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doPut(String url) throws HttpProcessException {
        return doPut(url);
    }

    /**
     * 发送put请求；带请求参数
     *
     * @param url 请求地址
     * @param jsonParams 参数集合
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doPut(String url, JSONObject jsonParams) throws HttpProcessException {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpPut httpPut = new HttpPut(url);
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
            httpPut.setConfig(requestConfig);

            packageParam(jsonParams, httpPut);

            return getHttpClientResult(httpResponse, httpClient, httpPut);
        } catch (Exception e){
            throw new HttpProcessException(e);
        }finally{
            release(httpResponse, httpClient);
        }
    }

    /**
     * 发送delete请求；不带请求参数
     *
     * @param url 请求地址
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doDelete(String url) throws HttpProcessException {
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        try {
            httpClient = HttpClients.createDefault();
            HttpDelete httpDelete = new HttpDelete(url);
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(CONNECT_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT).build();
            httpDelete.setConfig(requestConfig);
            return getHttpClientResult(httpResponse, httpClient, httpDelete);
        } catch (Exception e){
            throw  new HttpProcessException(e);
        }finally {
            release(httpResponse, httpClient);
        }
    }

    /**
     * 发送delete请求；带请求参数
     *
     * @param url 请求地址
     * @param jsonParams 参数集合
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult doDelete(String url,JSONObject jsonParams) throws HttpProcessException {
        if (jsonParams == null) {
            jsonParams = new JSONObject();
        }

        jsonParams.put("_method", "delete");
        return doPost(url, jsonParams);
    }

    /**
     * Description: 封装请求头
     * @param params
     * @param httpMethod
     */
    public static void packageHeader(Map<String, String> params, HttpRequestBase httpMethod) {
        // 封装请求头
        if (params != null) {
            Set<Map.Entry<String, String>> entrySet = params.entrySet();
            for (Map.Entry<String, String> entry : entrySet) {
                // 设置到请求头到HttpRequestBase对象中
                httpMethod.setHeader(entry.getKey(), entry.getValue());
            }
        }
    }

    /**
     * Description: 封装请求参数
     *
     * @param json
     * @param httpMethod
     * @throws UnsupportedEncodingException
     */
    public static void packageParam(JSONObject json, HttpEntityEnclosingRequestBase httpMethod)
            throws UnsupportedEncodingException {
        // 封装请求参数
        if (json != null) {
            StringEntity s = new StringEntity(json.toString());
            // 设置到请求的http对象中
            httpMethod.setEntity(s);
        }
    }

    /**
     * Description: 获得响应结果
     *
     * @param httpResponse
     * @param httpClient
     * @param httpMethod
     * @return
     * @throws HttpProcessException
     */
    public static HttpClientResult getHttpClientResult(CloseableHttpResponse httpResponse,
                                                       CloseableHttpClient httpClient, HttpRequestBase httpMethod) throws HttpProcessException {
        try {
            // 执行请求
            httpResponse = httpClient.execute(httpMethod);

            // 获取返回结果
            if (httpResponse != null && httpResponse.getStatusLine() != null) {
                String content = "";
                if (httpResponse.getEntity() != null) {
                    content = EntityUtils.toString(httpResponse.getEntity(), ENCODING);
                }
                return new HttpClientResult(httpResponse.getStatusLine().getStatusCode(), content);
            }
        } catch (IOException e) {
            throw  new HttpProcessException(e);
        }
        return new HttpClientResult(HttpStatus.SC_INTERNAL_SERVER_ERROR);
    }

    /**
     * Description: 释放资源
     *
     * @param httpResponse
     * @param httpClient
     * @throws HttpProcessException
     */
    public static void release(CloseableHttpResponse httpResponse, CloseableHttpClient httpClient) throws HttpProcessException {
        try {
            // 释放资源
            if (httpResponse != null) {
                httpResponse.close();
            }
            if (httpClient != null) {
                httpClient.close();
            }
        } catch (IOException e) {
            throw new HttpProcessException(e);
        }
    }
}    