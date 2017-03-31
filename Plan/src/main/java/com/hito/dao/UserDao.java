package com.hito.dao;

import com.hito.domain.User;

public interface UserDao {
	public User selectUserById(String userId);
}
