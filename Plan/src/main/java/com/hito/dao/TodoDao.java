package com.hito.dao;

import java.util.List;
import java.util.Map;

public interface TodoDao {

	public List<Object> getEventsByName(Map<String, String> params);

	public int insertEvent(Map<String, String> parameter);

	public void updateEvent(Map<String, String> params);

	public void delEvent(Map<String, String> params);

}
