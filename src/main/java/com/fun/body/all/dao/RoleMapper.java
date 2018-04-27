package com.fun.body.all.dao;

import com.fun.body.all.model.Role;
import com.fun.body.all.model.RoleRule;


public interface RoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(RoleRule record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}