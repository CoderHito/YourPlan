package com.hito.dao;

import java.util.Map;

public interface TeamDao {

	Map<String, Object> findUserByName(Map<String, String> params);

	void insert(Map<String, String> params);

	void delFriend(Map<String, String> params);

	void createTeam(Map<String, String> params);


}
