package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("招聘职位")
public class RecruitmentPosition {
    private Integer id;
    @ApiModelProperty("招聘manager人")
    private Integer managerId;
    @ApiModelProperty("职位名称")
    private String positionTitle;
    @ApiModelProperty("年龄范围")
    private String ageRange;
    @ApiModelProperty("学历要求")
    private Integer education;
    @ApiModelProperty("招聘人数")
    private Integer recruitNum;
    @ApiModelProperty("性别限制 0 无性别限制 1有性别限制")
    private Integer sexEnable;
    @ApiModelProperty("招聘女性数量")
    private Integer recruitNumFemale;
    @ApiModelProperty("招聘男性数量")
    private Integer recruitNumMale;
    @ApiModelProperty("工作地址")
    private String workAddress;
    @ApiModelProperty("薪资起始")
    private Integer salaryStart;
    @ApiModelProperty("薪资截止")
    private Integer salaryEnd;
    @ApiModelProperty("工作周期")
    private Integer scheduleCode;
    @ApiModelProperty("自定义工作周期时 需要辅助的字段")
    private String scheduleInfo;
    @ApiModelProperty("工作福利")
    private Integer workWelfare;
    @ApiModelProperty("其他福利")
    private String otherWelfare;
    @ApiModelProperty("岗位职责")
    private String postDuty;
    @ApiModelProperty("任职要求")
    private String jobRequirement;
    @ApiModelProperty("工作时间要求")
    private String workTime;
    @ApiModelProperty("权重值")
    private Long weight;
    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;
}