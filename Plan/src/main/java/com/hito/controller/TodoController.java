package com.hito.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSON;
import com.hito.domain.UserVo;
import com.hito.service.TodoService;
import com.hito.service.UserService;
import com.hito.utils.DateUtils;
import com.hito.utils.FastJsonUtils;

@Controller
@SessionAttributes("userVo")
@RequestMapping("/todo")
public class TodoController {
	private static final String END = "end";
	private static final String START = "start";
	private static final String TITLE = "title";
	private Logger logger = LoggerFactory.getLogger(TodoController.class);

	@ModelAttribute("userVo")
	public UserVo initUserVo() {
		return new UserVo();
	}

	@Resource
	private TodoService todoService;

	// getEvents
	@RequestMapping("/getEvents.do")
	@ResponseBody
	public String getEvents(@ModelAttribute("userVo") UserVo userVo,
			ModelMap model) {
		String user_name = userVo.getUserName();
		List<Object> eventList = todoService.getEventsByName(user_name);
		logger.info(eventList.toString());
		return FastJsonUtils.toJSONString(eventList);
	}

}
