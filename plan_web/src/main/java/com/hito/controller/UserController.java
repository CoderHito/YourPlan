package com.hito.controller;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hito.utils.FastJsonUtils;
import com.hito.utils.HttpUtil;
import com.hito.domain.*;

@Controller
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@SuppressWarnings("deprecation")
	@RequestMapping("/web/index")
	public ModelAndView getIndex() {
		ModelAndView mav = new ModelAndView("index");
		String url = "http://localhost:8088/Plan/server/get";
		Map<String, Object> requestParams = new HashMap<String, Object>();
		requestParams.put("user", "1");
		Map<String, Object> result = HttpUtil.postMsg(url, requestParams, HTTP.UTF_8);
//		User user = FastJsonUtils.toBean(result.get("msg").toString(), User.class);
		System.out.println(result.get("msg"));
		return mav;
	}
}