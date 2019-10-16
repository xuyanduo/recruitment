package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("用户详情表")
public class UserDetail {
    private Integer id;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("性别")
    private Integer sex;
    @ApiModelProperty("出生年月")
    private Date birthDate;
    @ApiModelProperty("删除状态")
    private Integer deleteStatus;
    @ApiModelProperty("联系电话")
    private String telephone;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("最高学历")
    private Integer highEducation;
    @ApiModelProperty("居住地址")
    private String address;
    @ApiModelProperty("开始工作时间")
    private Date startWorkDate;
    @ApiModelProperty("有海外经验 0 无  1有")
    private Integer isOverseasExperience;

    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;

}