package com.hito.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.hito.domain.Constans;
import com.hito.domain.User;
import com.hito.service.UserService;
import com.hito.utils.FastJsonUtils;

@Controller
public class UserController {

	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@Resource
	private UserService userService;

	@RequestMapping("/server/index")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@RequestMapping("/server/login")
	@ResponseBody
	public String login(String name, String password) {
		Map<String, Object> data = new HashMap<String, Object>();
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			result = userService.selectUserByName(name);
			data.put(Constans.EXIST, Constans.YES);
			data.put(Constans.SAME, Constans.YES);
			data.put(Constans.RESULT, Constans.ERROR);
			if (result == null) {
				data.put(Constans.EXIST, Constans.NO);
			}
			if (!result.get(Constans.USER_PASSWORD).equals(password)) {
				data.put(Constans.SAME, Constans.NO);
			} else {
				data.put(Constans.RESULT, Constans.SUCCESS);
			}
		} catch (Exception e) {
			e.printStackTrace();
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);

	}

	@RequestMapping("/server/register")
	@ResponseBody
	public String register(String name, String password, String repsw) {
		Map<String, String> data = new HashMap<String, String>();
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("name", name);
		parameter.put("password", password);
		try {
			result = userService.selectUserByName(name);
			data.put(Constans.RESULT, Constans.ERROR);
			if (result != null) {
				data.put(Constans.EXIST, Constans.YES);
			}
			data.put(Constans.EXIST, Constans.NO);
			if (password.equals(repsw)) {
				data.put(Constans.SAME, Constans.YES);
				int i = userService.insert(parameter);
				logger.info("........插入成功......" + i);
				data.put(Constans.RESULT, Constans.SUCCESS);
			} else {
				data.put(Constans.SAME, Constans.NO);
			}
		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
			e.printStackTrace();
		}
		return FastJsonUtils.toJSONString(data);
	}
}