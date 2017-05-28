package com.hito.service;

import java.util.List;
import java.util.Map;

public interface TodoService {
	public List<Object> getEventsByName(String user_name);
	public int insert(Map<String, String> parameter);
	public void updateEvent(Map<String, String> params);
	public void delEvent(Map<String, String> params);
}
