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
import com.hito.domain.TeamConstants;
import com.hito.domain.UserVo;
import com.hito.service.PlanService;
import com.hito.service.TeamService;
import com.hito.utils.FastJsonUtils;
import com.hito.utils.UUIDUtil;

@Controller
@SessionAttributes("userVo")
@RequestMapping("/team")
public class TeamController {
	private Logger logger = LoggerFactory.getLogger(TeamController.class);

	@Resource
	private TeamService teamService;

	@ModelAttribute("userVo")
	public UserVo initUserVo() {
		return new UserVo();
	}

	@RequestMapping("/findUserByName.do")
	@ResponseBody
	public String findUserByName(@ModelAttribute("userVo") UserVo userVo,
			String user_name) {
		Map<String, String> data = new HashMap<String, String>();
		Map<String, String> params = new HashMap<String, String>();
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			data.put(Constans.RESULT, Constans.ERROR);
			params.put(PlanConstans.USER_NAME, user_name);
			result = teamService.findUserByName(params);
			if (result != null) {
				// 该用户存在
				params.put(PlanConstans.USER_NAME, userVo.getUserName());
				params.put(Constans.ID, UUIDUtil.getUUID());
				params.put(Constans.F_NAME, user_name);
				teamService.insert(params);
				data.put(Constans.RESULT, Constans.SUCCESS);
			}
			if (userVo.getUserName().equals(user_name)) {
				data.put(Constans.YOUR_SELF, "yourself");
			}

		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);
	}

	@RequestMapping("/delFriend.do")
	@ResponseBody
	public String delFriend(@ModelAttribute("userVo") UserVo userVo,
			String fname) {
		Map<String, String> data = new HashMap<String, String>();
		Map<String, String> params = new HashMap<String, String>();
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			data.put(Constans.RESULT, Constans.ERROR);
			params.put(PlanConstans.USER_NAME, userVo.getUserName());
			params.put(Constans.F_NAME, fname);
			teamService.delFriend(params);
			data.put(Constans.RESULT, Constans.SUCCESS);
		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);
	}

	@RequestMapping("/newTeam.do")
	@ResponseBody
	public String newTeam(@ModelAttribute("userVo") UserVo userVo,
			String team_title) {
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String> data = new HashMap<String, String>();
		try {
			params.put(TeamConstants.CREATE_P, userVo.getUserName());
			params.put(TeamConstants.TEAM_TITLE, team_title);
			teamService.createTeam(params);
//			teamService.addMember(params);
			data.put(Constans.RESULT, Constans.SUCCESS);
		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return "111";
	}

}
