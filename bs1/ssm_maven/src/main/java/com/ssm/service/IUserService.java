package com.ssm.service;

import java.util.Map;

import com.ssm.entity.User;

public interface IUserService {


	/**
	 * 登录
	 * 
	 * @param map
	 * @return
	 */
	public User login(Map<String, String> map);

}