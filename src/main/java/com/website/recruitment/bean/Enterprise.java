package com.website.recruitment.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("企业信息")
public class Enterprise {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("企业名称")
    private String name;
    @ApiModelProperty("企业固定电话")
    private String fixedPhone;
    @ApiModelProperty("企业邮箱")
    private String email;
    @ApiModelProperty("公司地址")
    private String address;
    private Date createTime;
    private Integer createUser;
    private Date modifyTime;
    private Integer modifyUser;
}