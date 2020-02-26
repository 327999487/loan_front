package com.cycfc.borrow.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

/**
 * @author wwt
 */
@Data
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -8233862051446319809L;
    /**
     * 手机号 MOBILE
     */
    private String mobile;

    /**
     * 客户号 CSTNO
     */
    private String cstno;

    /**
     * 客户登录号 LOGONID
     */
    private String logonid;

    /**
     * 客户登录密码 PASSWORD
     */
    private String password;

    /**
     * 客户状态(0正常2临时冻结 3 待激活 4永久冻结5注销) STT
     */
    private String stt;

    /**
     * 注册时间 REGISTTIME
     */
    private String registtime;

    /**
     * 推荐人 INTROSALER
     */
    private String introsaler;

    /**
     * 邮箱 EMAIL
     */
    private String email;

    /**
     * 注册渠道 CHANNEL
     */
    private String channel;

    /**
     * 注销时间 CANCELTIME
     */
    private String canceltime;

    /**
     * 手势密码 GESTURE_PWD
     */
    private String gesturePwd;

    /**
     * 手势密码设置状态 GESTURE_PWD_STATUS
     */
    private String gesturePwdStatus;

    /**
     * 设备IMEI码 MOBLIE_IMEI
     */
    private String moblieImei;

    /**
     * 密码错误次数 PWD_ERRORTIME
     */
    private Short pwdErrortime;

    /**
     * 支付密码 PAY_PWD
     */
    private String payPwd;

    /**
     * 上次登录时间 LASTLOGIN_TIME
     */
    private String lastloginTime;

    /**
     * 推荐码 INVITION_CODE
     */
    private String invitionCode;

}