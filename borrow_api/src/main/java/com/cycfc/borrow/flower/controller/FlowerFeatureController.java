package com.cycfc.borrow.flower.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cycfc-borrow-front
 * @description: 数据准备接口
 * @author: wwt
 * @create: 2020-02-17 20:54
 **/
@Api(tags = "花呗，数据准备接口")
@Slf4j
@Validated
@RestController
@RequestMapping("/featureservice")
public class FlowerFeatureController {

    @ApiOperation(value = "数据准备接口", notes = "根据用户ID获取用户信息成功返回200,资源若不存在则响应404")
    @PostMapping(value = "/init_feature",produces = "application/json;charset=UTF-8")
    public String initFeature(){

        return null;
    }
}    