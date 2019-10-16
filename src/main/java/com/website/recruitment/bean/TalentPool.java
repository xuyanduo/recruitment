package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel("人才库")
public class TalentPool {
    private Integer id;
    @ApiModelProperty("简历id")
    private Integer resumeId;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("岗位id")
    private Integer positionId;
    @ApiModelProperty("匹配关键词")
    private String matchKeyword;
    @ApiModelProperty("绑定状态")
    private Integer bindingStatus;
    @ApiModelProperty("删除状态")
    private Integer deleteStatus;
    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;
}