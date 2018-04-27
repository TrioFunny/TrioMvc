package com.fun.body.all.dao;

import com.fun.body.all.model.Sign;

public interface SignMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sign record);

    int insertSelective(Sign record);

    Sign selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sign record);

    int updateByPrimaryKey(Sign record);
}