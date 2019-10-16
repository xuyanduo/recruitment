package com.website.recruitment.dao;


import com.website.recruitment.bean.PositionCollectionRecord;

public interface PositionCollectionRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PositionCollectionRecord record);

    int insertSelective(PositionCollectionRecord record);

    PositionCollectionRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PositionCollectionRecord record);

    int updateByPrimaryKey(PositionCollectionRecord record);
}