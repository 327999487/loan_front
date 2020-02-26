package com.cycfc.borrow.format;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @program: loan-front
 * @description: 返回统一数据结构
 * @author: wwt
 * @create: 2020-02-17 12:10
 **/

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResultResponse<T> implements Serializable {

    private static final long serialVersionUID = 4609685743447177937L;

    /**
     * 服务器当前时间戳
     */
    private Long ts = System.currentTimeMillis();

    /**
     * 成功数据
     */
    private T data;

    /**
     * 错误码
     */
    private String code;

    /**
     * 错误描述
     */
    private String msg;

    public static ResultResponse ofSuccess() {
        ResultResponse result = new ResultResponse();
        result.code= "200";
        return result;
    }

    public static ResultResponse ofSuccess(Object data) {
        ResultResponse result = new ResultResponse();
        result.code= "200";
        result.setData(data);
        return result;
    }

    public static ResultResponse ofFail(String code, String msg) {
        ResultResponse result = new ResultResponse();
        result.code= code;
        result.msg = msg;
        return result;
    }

    public static ResultResponse ofFail(String code, String msg, Object data) {
        ResultResponse result = new ResultResponse();
        result.code = code;
        result.msg = msg;
        result.setData(data);
        return result;
    }

    public static ResultResponse ofFail(ResponseCodeEnum resultEnum) {
        ResultResponse result = new ResultResponse();
        result.code = resultEnum.getCode();
        result.msg = resultEnum.getMessage();
        return result;
    }

    /**
     * 获取 json
     */
    public String buildResultJson(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", this.code);
        jsonObject.put("ts", this.ts);
        jsonObject.put("msg", this.msg);
        jsonObject.put("data", this.data);
        return JSON.toJSONString(jsonObject, SerializerFeature.DisableCircularReferenceDetect);
    }

}