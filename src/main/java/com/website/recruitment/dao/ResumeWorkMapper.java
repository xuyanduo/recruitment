package com.website.recruitment.dao;


import com.website.recruitment.bean.ResumeWork;

public interface ResumeWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeWork record);

    int insertSelective(ResumeWork record);

    ResumeWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeWork record);

    int updateByPrimaryKey(ResumeWork record);
}