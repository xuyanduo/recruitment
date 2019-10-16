package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("用户操作记录表")
public class UserOperationRecord {
    private Integer id;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("招聘职位id")
    private Integer recruitmentPositionId;
    @ApiModelProperty("操作类型")
    private String operate;

    private Date createTime;

    private Integer createUser;
}