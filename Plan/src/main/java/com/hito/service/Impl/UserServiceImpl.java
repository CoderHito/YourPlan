package com.hito.service.Impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hito.dao.UserDao;
import com.hito.domain.UserVo;
import com.hito.service.UserService;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserVo selectUserById(String userId) {
		return userDao.selectUserById(userId);
	}
	
	@Override
	public Map<String, Object> selectUserByName(String name) {
		return userDao.selectUserByName(name);
	}

	@Override
	public int insert(Map<String, String> parameter) {
		return userDao.insert(parameter);
	}

}
