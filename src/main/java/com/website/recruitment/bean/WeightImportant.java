package com.website.recruitment.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("权重要素表")
public class WeightImportant {
    private Integer id;
    @ApiModelProperty("操作类型")
    private String operate;
    @ApiModelProperty("权重值")
    private Integer weight;
}