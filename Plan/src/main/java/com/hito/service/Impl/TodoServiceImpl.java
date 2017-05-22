package com.hito.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hito.dao.TodoDao;
import com.hito.dao.UserDao;
import com.hito.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	private TodoDao todoDao;

	
	@Override
	public List<Object> getEventsByName(String user_name) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("user_name", user_name);
		List<Object> eventsList = new ArrayList<Object>();
		eventsList = todoDao.getEventsByName(params);
		return eventsList;

	}


	@Override
	public int insert(Map<String, String> parameter) {
		return todoDao.insertEvent(parameter);
	}


	@Override
	public void updateEvent(Map<String, String> params) {
		todoDao.updateEvent(params);
	}

}
