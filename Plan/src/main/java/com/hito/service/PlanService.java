package com.hito.service;

import java.util.Map;


public interface PlanService {

	void updatePlan(Map<String, String> params);

	void newPlan(Map<String, String> params);

	void delPlan(Map<String, String> params);

}
