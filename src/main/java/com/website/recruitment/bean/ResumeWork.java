package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("个人工作经验")
public class ResumeWork {
    private Integer id;
    @ApiModelProperty("简历id")
    private Integer resumeId;
    @ApiModelProperty("公司名称")
    private String companyName;
    @ApiModelProperty("行业类别")
    private Integer industryCategory;
    @ApiModelProperty("职位名称")
    private String positionName;
    @ApiModelProperty("职位类别")
    private Integer positionCategory;
    @ApiModelProperty("工作开始时间")
    private Date workDateStart;
    @ApiModelProperty("工作截止时间")
    private Date workDateEnd;
    @ApiModelProperty("职位月薪类型")
    private Integer positionSalaryCode;
    @ApiModelProperty("职位月薪")
    private String positionSalaryMoney;
    @ApiModelProperty("工作内容描述")
    private String workDescribe;
    @ApiModelProperty("0未删除 1已删除")
    private Integer deleteStatus;
    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;

}