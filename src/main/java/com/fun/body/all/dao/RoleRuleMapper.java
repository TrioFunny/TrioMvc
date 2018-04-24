package com.fun.body.all.dao;

import com.fun.body.all.model.Role;
import com.fun.body.all.model.RoleRule;


public interface RoleRuleMapper {
    int insert(Role record);

    int insertSelective(RoleRule record);
}