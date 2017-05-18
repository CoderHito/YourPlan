package com.hito.service;

import java.util.Map;

import com.hito.domain.UserVo;

public interface UserService {
	UserVo selectUserById(String idx);

	Map<String, Object> selectUserByName(String name);

	int insert(Map<String, String> parameter);
}
