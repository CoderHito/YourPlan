package com.hito.dao;

import java.util.List;
import java.util.Map;

public interface TodoDao {

	public List<Object> getEventsByName(Map<String, String> params);

}
