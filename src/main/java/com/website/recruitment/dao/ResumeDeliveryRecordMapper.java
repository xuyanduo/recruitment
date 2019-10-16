package com.website.recruitment.dao;


import com.website.recruitment.bean.ResumeDeliveryRecord;

public interface ResumeDeliveryRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeDeliveryRecord record);

    int insertSelective(ResumeDeliveryRecord record);

    ResumeDeliveryRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeDeliveryRecord record);

    int updateByPrimaryKey(ResumeDeliveryRecord record);
}