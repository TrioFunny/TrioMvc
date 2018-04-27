package com.fun.body.all.dao;

import java.util.List;

import com.fun.body.all.model.User;


public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectBySql(String Sql);

    List<User> selectUser(String sql);
}