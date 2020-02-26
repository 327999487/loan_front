package com.cycfc.borrow.format;


import lombok.Data;


/**
 * @Author: wwt
 * @Date: 2019/11/08
 * @Description: 默认返回提示信息
 */
@Data
public class DefaultResponse<T> {
    private String code = "200";
    private String msg = "ok";
    private T data;

    public DefaultResponse(){}
    public DefaultResponse(ResponseBuilder<T> builder){
        this.code = builder.code;
        this.msg = builder.msg;
        this.data = builder.data;
    }

    public static ResponseBuilder builder(){
        return  new ResponseBuilder();
    }

    public static class ResponseBuilder<T>{
        private String code = ResponseCodeEnum.SUCCESS.getCode();
        private String msg = ResponseCodeEnum.SUCCESS.getMessage();
        private T data;

        public ResponseBuilder code(String code){
            this.code = code;
            return this;
        }

        public ResponseBuilder msg(String msg){
            this.msg = msg;
            return this;
        }

        public ResponseBuilder data(T data){
            this.data = data;
            return this;
        }

        public ResponseBuilder glue(ResponseCodeEnum responseCode){
            this.code = responseCode.getCode();
            this.msg = responseCode.getMessage();
            return this;
        }

        public DefaultResponse build(){
            return new DefaultResponse(this);
        }
    }
}
