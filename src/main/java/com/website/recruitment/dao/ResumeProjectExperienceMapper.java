package com.website.recruitment.dao;


import com.website.recruitment.bean.ResumeProjectExperience;

public interface ResumeProjectExperienceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeProjectExperience record);

    int insertSelective(ResumeProjectExperience record);

    ResumeProjectExperience selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeProjectExperience record);

    int updateByPrimaryKey(ResumeProjectExperience record);
}