package com.hito.service.Impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hito.dao.TeamDao;
import com.hito.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamDao teamDao;
	
	@Override
	public Map<String, Object> findUserByName(Map<String, String> params) {
		return teamDao.findUserByName(params);
	}

	@Override
	public void insert(Map<String, String> params) {
		teamDao.insert(params);
	}

	@Override
	public void delFriend(Map<String, String> params) {
		teamDao.delFriend(params);
	}

	@Override
	public void createTeam(Map<String, String> params) {
		teamDao.createTeam(params);
	}

}
