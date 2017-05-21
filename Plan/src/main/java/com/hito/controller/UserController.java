package com.hito.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.hito.domain.Constans;
import com.hito.domain.UserVo;
import com.hito.service.UserService;
import com.hito.utils.FastJsonUtils;

@Controller
@SessionAttributes("userVo")
@RequestMapping("/server")
public class UserController {

	private static final String INDEX = "index";
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@Resource
	private UserService userService;

	@ModelAttribute("userVo")
	public UserVo initUserVo() {
		return new UserVo();
	}

	/**
	 * 首页
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/index.do")
	public String getIndex(@ModelAttribute("userVo") UserVo userVo,
			ModelMap model) {
		if (userVo.getUserName() != null) {
			model.addAttribute("user_name", userVo.getUserName());
		}
		return INDEX;
	}

	/**
	 * 日程
	 * 
	 * @param userVo
	 * @param model
	 * @return
	 */
	@RequestMapping("/todo.do")
	public String todo(@ModelAttribute("userVo") UserVo userVo, ModelMap model) {
		logger.info(userVo.toString());
		if (userVo.getUserName() == null) {
			return INDEX;
		}
		model.addAttribute("user_name", userVo.getUserName());
		return "todo";
	}

	/**
	 * 计划
	 * 
	 * @param userVo
	 * @param model
	 * @return
	 */
	@RequestMapping("/plan.do")
	public String plan(@ModelAttribute("userVo") UserVo userVo, ModelMap model) {

		if (userVo.getUserName() == null) {
			return INDEX;
		}
		model.addAttribute("user_name", userVo.getUserName());
		return "plan";
	}

	/**
	 * 团队
	 * 
	 * @param userVo
	 * @param model
	 * @return
	 */
	@RequestMapping("/team.do")
	public String team(@ModelAttribute("userVo") UserVo userVo, ModelMap model) {
		if (userVo.getUserName() == null) {
			return INDEX;
		}
		model.addAttribute("user_name", userVo.getUserName());
		return "team";
	}

	/**
	 * 测试上传图片
	 * 
	 * @param userVo
	 * @param model
	 * @return
	 */
	@RequestMapping("/file.do")
	public String file(@ModelAttribute("userVo") UserVo userVo, ModelMap model) {
		if (userVo != null) {
			model.addAttribute("user_name", userVo.getUserName());
		}
		return "file";
	}

	/**
	 * 登录
	 * 
	 * @param name
	 * @param password
	 * @param model
	 * @return
	 */
	@RequestMapping("/login.do")
	@ResponseBody
	public String login(String name, String password, ModelMap model) {
		Map<String, Object> data = new HashMap<String, Object>();
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			// 以用户名查询数据库中是否存在
			result = userService.selectUserByName(name);
			data.put(Constans.EXIST, Constans.YES);
			data.put(Constans.SAME, Constans.YES);
			data.put(Constans.RESULT, Constans.ERROR);
			if (result == null) {
				// 该用户不存在
				data.put(Constans.EXIST, Constans.NO);
			} else {
				// 已经存在，判断密码是否正确
				if (!result.get(Constans.USER_PASSWORD).equals(password)) {
					data.put(Constans.SAME, Constans.NO);

				} else {
					data.put(Constans.RESULT, Constans.SUCCESS);
					UserVo userVo = new UserVo();
					userVo.setUserName(result.get(Constans.USER_NAME)
							.toString());
					userVo.setUserEmail((String) result
							.get(Constans.USER_EMAIL));
					userVo.setUserPassword(result.get(Constans.USER_PASSWORD)
							.toString());
					model.addAttribute("userVo", userVo);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);

	}

	/**
	 * 注册
	 * 
	 * @param name
	 * @param password
	 * @param repsw
	 * @return
	 */
	@RequestMapping("/register.do")
	@ResponseBody
	public String register(String name, String password, String repsw,
			ModelMap model) {
		Map<String, String> data = new HashMap<String, String>();
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("name", name);
		parameter.put("password", password);
		try {
			// 以用户名查询数据库中是否存在
			result = userService.selectUserByName(name);
			data.put(Constans.RESULT, Constans.ERROR);
			if (result != null) {
				// 已经存在
				data.put(Constans.EXIST, Constans.YES);
			} else {
				data.put(Constans.EXIST, Constans.NO);
				if (password.equals(repsw)) {
					data.put(Constans.SAME, Constans.YES);
					int i = userService.insert(parameter);
					logger.info(".........插入成功......" + i);
					data.put(Constans.RESULT, Constans.SUCCESS);
					UserVo userVo = new UserVo();
					userVo.setUserName(name);
					// userVo.setUserEmail( );
					userVo.setUserPassword(password);
					model.addAttribute("userVo", userVo);
				} else {
					data.put(Constans.SAME, Constans.NO);
				}
			}
		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
			e.printStackTrace();
		}
		return FastJsonUtils.toJSONString(data);
	}

}