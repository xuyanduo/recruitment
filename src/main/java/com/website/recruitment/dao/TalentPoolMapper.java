package com.website.recruitment.dao;


import com.website.recruitment.bean.TalentPool;

public interface TalentPoolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TalentPool record);

    int insertSelective(TalentPool record);

    TalentPool selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TalentPool record);

    int updateByPrimaryKey(TalentPool record);
}