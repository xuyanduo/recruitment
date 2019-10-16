package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("个人简历")
public class Resume {
    private Integer id;
    @ApiModelProperty("简历名称")
    private String resumeTitle;
    @ApiModelProperty("简历类型 1填写类型的简历 2 属于附件简历")
    private Integer resumeType;
    @ApiModelProperty("是否默认 0非默认 1默认")
    private Integer isDefault;
    @ApiModelProperty("是否私有 0非私有即为公开 1私有")
    private Integer isPrivate;
    @ApiModelProperty("0未删除 1已删除")
    private Integer deleteStatus;
    @ApiModelProperty("简历顺序")
    private Integer order;

    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;
}