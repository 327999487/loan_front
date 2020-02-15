package com.cycfc.borrow.service.impl;

import com.cycfc.borrow.dao.UserInfoMapper;
import com.cycfc.borrow.entity.UserInfo;
import com.cycfc.borrow.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: cycfc-borrow-front
 * @description: 用户测试业务逻辑实现类
 * @author: wwt
 * @create: 2020-02-15 17:41
 **/
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUSerInfoById(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
}