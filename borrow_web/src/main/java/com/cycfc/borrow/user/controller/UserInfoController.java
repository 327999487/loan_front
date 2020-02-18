package com.cycfc.borrow.user.controller;

import com.cycfc.borrow.entity.UserInfo;
import com.cycfc.borrow.exception.BusinessException;
import com.cycfc.borrow.response.BusinessErrorCodeEnum;
import com.cycfc.borrow.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @program: cycfc-borrow-front
 * @description: 测试用户信息查询
 * @author: wwt
 * @create: 2020-02-15 19:52
 **/
@Api(tags = "测试用户")
@Slf4j
@Validated
@RestController
@RequestMapping("/user")
public class UserInfoController {


    @Resource
    private UserInfoService userInfoService;

    @ApiOperation(value = "根据用户ID获取用户信息", notes = "根据用户ID获取用户信息成功返回200,资源若不存在则响应404")
    @GetMapping(value = "/getUserInfo",produces = "application/json;charset=UTF-8")
    public UserInfo getUserInfo(@RequestParam String userId){
        return userInfoService.getUSerInfoById(userId);
    }

    @ApiOperation(value = "根据用户ID获取用户信息", notes = "根据用户ID获取用户信息成功返回200,资源若不存在则响应404")
    @GetMapping(value = "/getUserInfos",produces = "application/json;charset=UTF-8")
    public UserInfo getUserInfos(@RequestParam String userId){
        throw new BusinessException(BusinessErrorCodeEnum.BUSINESS_ERROR);
    }

}    