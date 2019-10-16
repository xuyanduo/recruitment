package com.website.recruitment.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("求职意向表")
public class CareerObjective {

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("职位名称")
    private String jobTitle;
    @ApiModelProperty("工作性质")
    private Integer workNature;
    @ApiModelProperty("职位类别")
    private Integer jobCategory;
    @ApiModelProperty("工作时长")
    private Integer workLength;
    @ApiModelProperty("删除状态")
    private Integer deleteStatus;
    @ApiModelProperty("工作城市")
    private String workCity;
    @ApiModelProperty("期望薪资开始")
    private Integer expectSalaryStart;
    @ApiModelProperty("期望薪资截止")
    private Integer expectSalaryEnd;
    @ApiModelProperty("目前状态")
    private Integer state;
    @ApiModelProperty("到岗时间类型")
    private Integer dutyTimeType;
    @ApiModelProperty("自我评价")
    private String selfEvaluation;

    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;
}