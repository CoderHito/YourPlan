package com.hito.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
		User user = userService.selectUserById("1");
		mav.addObject("user", user);
		return mav;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/server/get")
	public Map<Object, Object> get( String msg ) {
		
		Map<Object, Object> params = FastJsonUtils.stringToMap(msg);
		String idx = (String) params.get("user");
		User user = userService.selectUserById(idx);
		Map<Object, Object> result = new HashMap<Object, Object>();
		result.put("user", user);
		return result;
		// return user.toString();
	}

	// @RequestMapping(value = "/server/get")
	// @ResponseBody
	// public String get2( String msg) {
	// Map<Object,Object> params = FastJsonUtils.stringToMap(msg);
	// // String idx = (String) params.get("user");
	// User user = userService.selectUserById("1");
	// Map<Object, Object> result = new HashMap<Object, Object>();
	// result.put("user", user);
	// // return result;
	// return user.toString();
	// }

}