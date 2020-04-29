package com.ssm.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.IUserDao;
import com.ssm.entity.User;
import com.ssm.service.IUserService;

@Service("UserService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public User login(Map<String, String> map) {
		// TODO Auto-generated method stub
		return userDao.login(map);
	}

}
