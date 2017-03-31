package com.hito.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hito.dao.UserDao;
import com.hito.domain.User;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User selectUserById(String userId) {
		return userDao.selectUserById(userId);
	}

}
