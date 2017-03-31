package com.hito.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hito.utils.HttpUtil;
import com.hito.domain.*;

@Controller
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/web/index")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("index");
		String url = "http://localhost:8088/plan/server/get";
		Map<Object, Object> requestParams = new HashMap<Object, Object>();
		requestParams.put("user", "1");
		Map<Object, Object> result = HttpUtil.httpPost(url, requestParams);
		User user = (User) result.get("user");
		mav.addObject("user", user);
		return mav;
	}
}