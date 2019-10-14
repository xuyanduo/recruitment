package com.website.recruitment.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @RequiresPermissions("user:list")
    @GetMapping("/show")
    public String showUser() {
        return "这是学生信息";
    }
}

