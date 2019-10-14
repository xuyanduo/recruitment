package com.website.recruitment.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户接口")
@RequestMapping("/user")
@RestController
public class UserController {

    @ApiOperation("用户信息接口")
    @RequiresPermissions("user:list")
    @GetMapping("/show")
    public String showUser() {
        return "这是学生信息";
    }
}

