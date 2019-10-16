package com.website.recruitment.dao;


import com.website.recruitment.bean.WeightImportant;

public interface WeightImportantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeightImportant record);

    int insertSelective(WeightImportant record);

    WeightImportant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeightImportant record);

    int updateByPrimaryKey(WeightImportant record);
}