package com.hito.dao;

import java.util.Map;

public interface PlanDao {

	void updatePlan(Map<String, String> params);

	void newPlan(Map<String, String> params);

	void delPlan(Map<String, String> params);

}
