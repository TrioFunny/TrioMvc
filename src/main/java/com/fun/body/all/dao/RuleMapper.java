package com.fun.body.all.dao;

import com.fun.body.all.model.Rule;

public interface RuleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Rule record);

    int insertSelective(Rule record);

    Rule selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Rule record);

    int updateByPrimaryKey(Rule record);
}