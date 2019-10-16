package com.website.recruitment.dao;


import com.website.recruitment.bean.EnterpriseCertification;

public interface EnterpriseCertificationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EnterpriseCertification record);

    int insertSelective(EnterpriseCertification record);

    EnterpriseCertification selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EnterpriseCertification record);

    int updateByPrimaryKey(EnterpriseCertification record);
}