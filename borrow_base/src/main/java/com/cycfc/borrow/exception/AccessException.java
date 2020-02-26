package com.cycfc.borrow.exception;

import com.cycfc.borrow.format.MsgEnum;
import lombok.Data;

/**
 * @program: borrow-front
 * @description: API访问受限异常
 * @author: wwt
 * @create: 2020-02-17 15:21
 **/
@Data
public class AccessException extends RuntimeException {


    private static final long serialVersionUID = 4472459951444992683L;

    private String code;
    private String msg;


    /**
     * {"code":401,"msg":"未经过身份认证"}
     */
    public AccessException() {
        super(MsgEnum.AUTH_ERROR.toString());
    }

    /**
     * {"code":401,"msg":"${message}"}
     * @param message
     */
    public AccessException(String message) {
        super(MsgEnum.AUTH_ERROR.msg(message));
    }

    /**
     * HTTP状态码为401的业务异常类，如果需要自定义返回的code和msg，那肯定是通过MsgEnum枚举来定义操作的
     *
     * {"code":${ienum.code},"msg":"${ienum.msg}"}
     * @param ienum
     */
    public AccessException(MsgEnum ienum) {

        super(ienum.toString());
        this.code = String.valueOf(ienum.getCode());
        this.msg = ienum.getMsg();

    }
}