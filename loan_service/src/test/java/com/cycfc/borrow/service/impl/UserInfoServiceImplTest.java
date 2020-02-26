package com.cycfc.borrow.service.impl;

import com.cycfc.borrow.entity.UserInfo;
import com.cycfc.borrow.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringBootApplication.class})
public class UserInfoServiceImplTest {

    @Resource
    private UserInfoService userInfoService;

    @Test
    public void getUSerInfoById() {
        UserInfo userInfo = userInfoService.getUSerInfoById("10000559");
        System.out.println(userInfo);
    }
}
