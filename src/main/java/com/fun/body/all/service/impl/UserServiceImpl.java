package com.fun.body.all.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.fun.body.all.dao.UserMapper;
import com.fun.body.all.model.User;
import com.fun.body.all.service.IUserService;


@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	
	@Override
	public int deleteByPrimaryKey(String id) {
		return 0;
	}

	@Override
	public int insert(User record) {
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		return 0;
	}

	@Override
	public User selectByPrimaryKey(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return 0;
	}

}
