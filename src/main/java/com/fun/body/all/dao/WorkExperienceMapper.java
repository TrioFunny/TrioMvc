package com.fun.body.all.dao;

import com.fun.body.all.model.WorkExperience;

public interface WorkExperienceMapper {
    int deleteByPrimaryKey(String id);

    int insert(WorkExperience record);

    int insertSelective(WorkExperience record);

    WorkExperience selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WorkExperience record);

    int updateByPrimaryKey(WorkExperience record);
}