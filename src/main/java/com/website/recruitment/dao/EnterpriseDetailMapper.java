package com.website.recruitment.dao;


import com.website.recruitment.bean.EnterpriseDetail;

public interface EnterpriseDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EnterpriseDetail record);

    int insertSelective(EnterpriseDetail record);

    EnterpriseDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EnterpriseDetail record);

    int updateByPrimaryKey(EnterpriseDetail record);
}