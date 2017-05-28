package com.hito.dao;

import java.util.List;
import java.util.Map;

import com.hito.domain.UserVo;

public interface UserDao {
	public UserVo selectUserById(String userId);

	public Map<String, Object> selectUserByName(String name);

	public int insert(Map<String, String> parameter);

	public List<Map<String, Object>> getPlan(String userName);

	public List<Map<String, Object>> getFriends(String user_name);

	public List<Map<String, Object>> getTeams(String user_name);

	public List<Map<String, Object>> getTeamsCreateByYourSelf(String user_name);
}
