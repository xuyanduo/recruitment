package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("企业详情")
public class EnterpriseDetail {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("企业id")
    private Integer enterpriseId;
    @ApiModelProperty("从事行业")
    private String industry;
    @ApiModelProperty("企业性质")
    private Integer businessNature;
    @ApiModelProperty("企业规模")
    private String businessScale;
    @ApiModelProperty("企业简介")
    private String enterpriseProfile;
    private Date createTime;
    private Integer createUser;
    private Date modifyTime;
    private Integer modifyUser;
}