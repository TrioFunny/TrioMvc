package com.fun.body.all.dao;

import com.fun.body.all.model.Type;

public interface TypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}