package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("简历附件")
public class ResumeAttachment {
    private Integer id;
    @ApiModelProperty("附件地址")
    private String attachmentUrl;
    @ApiModelProperty("简历id")
    private Integer resumeId;
    @ApiModelProperty("删除状态 0未删除 1已删除")
    private Integer deleteStatus;

    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;
}