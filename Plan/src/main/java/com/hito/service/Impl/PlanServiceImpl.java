package com.hito.service.Impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hito.dao.PlanDao;
import com.hito.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	private PlanDao planDao;

	@Override
	public void updatePlan(Map<String, String> params) {
		planDao.updatePlan(params);
	}

	@Override
	public void newPlan(Map<String, String> params) {
			planDao.newPlan(params);
	}

	@Override
	public void delPlan(Map<String, String> params) {
		planDao.delPlan(params);
	}

}
