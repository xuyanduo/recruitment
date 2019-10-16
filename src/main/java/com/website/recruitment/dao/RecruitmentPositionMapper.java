package com.website.recruitment.dao;


import com.website.recruitment.bean.RecruitmentPosition;

public interface RecruitmentPositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RecruitmentPosition record);

    int insertSelective(RecruitmentPosition record);

    RecruitmentPosition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RecruitmentPosition record);

    int updateByPrimaryKey(RecruitmentPosition record);
}