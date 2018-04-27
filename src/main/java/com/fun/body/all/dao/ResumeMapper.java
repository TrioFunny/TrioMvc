package com.fun.body.all.dao;

import com.fun.body.all.model.Resume;

public interface ResumeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}