package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("个人收藏表")
public class PositionCollectionRecord {

    private Integer id;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("招聘职位id")
    private Integer recruitmentPositionId;
    @ApiModelProperty("取消收藏状态 0未删除 1已删除")
    private Integer deleteStatus;

    private Date createTime;

    private Integer createUser;

    private Date modifyTime;

    private Integer modifyUser;
}