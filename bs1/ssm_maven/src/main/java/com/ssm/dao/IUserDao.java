package com.ssm.dao;

import java.util.Map;

import com.ssm.entity.User;

public interface IUserDao {


	/**
	 * 登录
	 * 
	 * @param map
	 * @return
	 */
	public User login(Map<String, String> map);

}
