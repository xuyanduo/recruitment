package com.website.recruitment.dao;


import com.website.recruitment.bean.ResumeAttachment;

public interface ResumeAttachmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeAttachment record);

    int insertSelective(ResumeAttachment record);

    ResumeAttachment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeAttachment record);

    int updateByPrimaryKey(ResumeAttachment record);
}