package com.fun.body.all.dao;

import com.fun.body.all.model.Friends;

public interface FriendsMapper {
    int insert(Friends record);

    int insertSelective(Friends record);
}