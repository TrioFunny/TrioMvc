package com.fun.body.user.service.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.fun.body.user.dao.UserMapper;
import com.fun.body.user.model.User;
import com.fun.body.user.service.IUserService;
import com.fun.util.mybatisUtil.SqlUtil;
import com.fun.util.mybatisUtil.SqlUtil.SpliceType;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;

	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	public int insert(User record) {
		return userMapper.insert(record);
	}

	public int insertSelective(User record) {
		return userMapper.insertSelective(record);
	}

	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(User record) {
		return userMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(User record) {
		return userMapper.updateByPrimaryKey(record);
	}

	public User selectByUserId(String userId) {
		return userMapper.selectByUserId(userId);
	}

	@Override
	public User selectUser(String sql) {
		
		sql=SqlUtil.spliceSpl(SpliceType.EqualTo, "userId", sql);
		System.out.println("sql:"+sql);
		User user=userMapper.selectUser(sql);
				
		System.out.println(user.toString());
		return user;
	}

}
