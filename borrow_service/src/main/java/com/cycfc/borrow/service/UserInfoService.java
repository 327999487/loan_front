package com.cycfc.borrow.service;

import com.cycfc.borrow.entity.UserInfo;

/**
 * @program: cycfc-borrow-front
 * @description: 用户测试业务逻辑处理
 * @author: wwt
 * @create: 2020-02-15 17:19
 **/
public interface UserInfoService {
    UserInfo getUSerInfoById(String id);
}