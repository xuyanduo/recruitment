package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("简历项目经验表")
public class ResumeProjectExperience {
    private Integer id;
    @ApiModelProperty("简历id")
    private Integer resumeId;
    @ApiModelProperty("公司名称")
    private String companyName;
    @ApiModelProperty("项目名称")
    private String projectName;
    @ApiModelProperty("项目开始时间")
    private Date projectStartDate;
    @ApiModelProperty("项目结束时间")
    private Date projectEndDate;
    @ApiModelProperty("项目描述")
    private String projectDescribe;
    @ApiModelProperty("0未删除 1已删除")
    private Integer deleteStatus;

    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;

}