package com.hito.service;

import java.util.List;
import java.util.Map;

import com.hito.domain.UserVo;

public interface UserService {
	UserVo selectUserById(String idx);

	Map<String, Object> selectUserByName(String name);

	int insert(Map<String, String> parameter);

	public List<Map<String, Object>> getPlan(String userName);

	List<Map<String, Object>> getFriends(String user_name);

	List<Map<String, Object>> getTeams(String userName);

	List<Map<String, Object>> getTeamsCreateByYourSelf(String userName);

}
