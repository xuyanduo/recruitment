package com.website.recruitment.dao;


import com.website.recruitment.bean.UserOperationRecord;

public interface UserOperationRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserOperationRecord record);

    int insertSelective(UserOperationRecord record);

    UserOperationRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserOperationRecord record);

    int updateByPrimaryKey(UserOperationRecord record);
}