package com.hito.dao;

import java.util.Map;

import com.hito.domain.User;

public interface UserDao {
	public User selectUserById(String userId);

	public Map<String, Object> selectUserByName(String name);

	public int insert(Map<String, String> parameter);
}
