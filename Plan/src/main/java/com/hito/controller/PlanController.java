package com.hito.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hito.domain.Constans;
import com.hito.domain.PlanConstans;
import com.hito.domain.UserVo;
import com.hito.service.PlanService;
import com.hito.utils.FastJsonUtils;

@Controller
@SessionAttributes("userVo")
@RequestMapping("/plan")
public class PlanController {
	private Logger logger = LoggerFactory.getLogger(PlanController.class);

	@Resource
	private PlanService planService;

	@ModelAttribute("userVo")
	public UserVo initUserVo() {
		return new UserVo();
	}

	@RequestMapping("/updatePlan.do")
	@ResponseBody
	public String updatePlan(@ModelAttribute("userVo") UserVo userVo,
			String id, String title, String descr, String start, String end) {
		Map<String, String> data = new HashMap<String, String>();
		Map<String, String> params = new HashMap<String, String>();
		String user_name = userVo.getUserName();
		try {
			params.put(PlanConstans.ID, id);
			params.put(PlanConstans.TITLE, title);
			params.put(PlanConstans.DESCR, descr);
			params.put(PlanConstans.START, start);
			params.put(PlanConstans.END, end);
			params.put(PlanConstans.USER_NAME, user_name);
			planService.updatePlan(params);

			data.put(Constans.RESULT, Constans.SUCCESS);

		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);
	}

	@RequestMapping("/newPlan.do")
	@ResponseBody
	public String newPlan(@ModelAttribute("userVo") UserVo userVo,
			String title, String descr, String start, String end,
			String plan_type) {
		Map<String, String> data = new HashMap<String, String>();
		Map<String, String> params = new HashMap<String, String>();
		String user_name = userVo.getUserName();
		try {
			params.put(PlanConstans.TITLE, title);
			params.put(PlanConstans.DESCR, descr);
			params.put(PlanConstans.START, start);
			params.put(PlanConstans.END, end);
			params.put(PlanConstans.PLAN_TYPE, plan_type);
			params.put(PlanConstans.USER_NAME, user_name);

			planService.newPlan(params);

			data.put(Constans.RESULT, Constans.SUCCESS);

		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);
	}
	
	@RequestMapping("/delPlan.do")
	@ResponseBody
	public String delPlan(@ModelAttribute("userVo") UserVo userVo,
			String id) {
		Map<String, String> data = new HashMap<String, String>();
		Map<String, String> params = new HashMap<String, String>();
		String user_name = userVo.getUserName();
		try {
			params.put(PlanConstans.ID, id);
			params.put(PlanConstans.USER_NAME, user_name);

			planService.delPlan(params);

			data.put(Constans.RESULT, Constans.SUCCESS);

		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);
	}

}
