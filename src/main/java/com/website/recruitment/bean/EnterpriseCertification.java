package com.website.recruitment.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel("企业认证资料")
public class EnterpriseCertification {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("企业id")
    private Integer enterpriseId;
    @ApiModelProperty("营业执照")
    private String certificateImg;
    @ApiModelProperty("企业信用代码")
    private String creditCode;
    @ApiModelProperty("公司法人")
    private String corporate;
    @ApiModelProperty("注册地址")
    private String registeredAddress;
    private Date createTime;
    private Integer createUser;
    private Date modifyTime;
    private Integer modifyUser;
}