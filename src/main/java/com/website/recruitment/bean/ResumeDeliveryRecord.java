package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("个人简历投递表")
public class ResumeDeliveryRecord {
    private Integer id;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("简历id")
    private Integer resumeId;
    @ApiModelProperty("招聘职位id")
    private Integer recruitmentPositionId;
    @ApiModelProperty("招聘者id")
    private Integer managerId;
    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;

}