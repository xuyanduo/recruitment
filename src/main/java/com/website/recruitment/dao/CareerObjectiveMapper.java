package com.website.recruitment.dao;


import com.website.recruitment.bean.CareerObjective;

public interface CareerObjectiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CareerObjective record);

    int insertSelective(CareerObjective record);

    CareerObjective selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CareerObjective record);

    int updateByPrimaryKey(CareerObjective record);
}