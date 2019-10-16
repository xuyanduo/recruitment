package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


@Data
@ApiModel("用户表")
public class User {
    private Integer id;
    @ApiModelProperty("电话")
    private String telephone;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("删除状态")
    private Integer deleteStatus;

    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;

}