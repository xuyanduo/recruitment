package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("企业人员表")
public class Manager {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("电话")
    private String telephone;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("部门名称")
    private String deptName;
    @ApiModelProperty("岗位名称")
    private String postName;
    @ApiModelProperty("删除状态")
    private Integer deleteStatus;
    @ApiModelProperty("人员类型 1 管理员 2 普通后台人员")
    private Integer managerType;
    private Date createTime;
    private Integer createUser;
    private Date modifyTime;
    private Integer modifyUser;
}