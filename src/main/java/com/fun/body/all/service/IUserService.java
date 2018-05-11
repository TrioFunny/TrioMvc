package com.fun.body.all.service;

import java.util.List;

import com.fun.body.all.model.User;

public interface IUserService {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User selectByUserName(String userName);

    List<User> selectUser(String sql);
    
}
