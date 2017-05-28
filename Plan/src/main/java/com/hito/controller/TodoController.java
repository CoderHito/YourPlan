package com.hito.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hito.domain.Constans;
import com.hito.domain.EventsConstants;
import com.hito.domain.UserVo;
import com.hito.service.TodoService;
import com.hito.utils.DateUtils;
import com.hito.utils.FastJsonUtils;

@Controller
@SessionAttributes("userVo")
@RequestMapping("/todo")
public class TodoController {

	private Logger logger = LoggerFactory.getLogger(TodoController.class);

	@ModelAttribute("userVo")
	public UserVo initUserVo() {
		return new UserVo();
	}

	@Resource
	private TodoService todoService;

	@RequestMapping("/getEvents.do")
	@ResponseBody
	public String getEvents(@ModelAttribute("userVo") UserVo userVo,
			ModelMap model) {
		String user_name = userVo.getUserName();
		List<Object> eventList = todoService.getEventsByName(user_name);
		logger.info(eventList.toString());
		return FastJsonUtils.toJSONString(eventList);
	}

	/**
	 * 创建新事件
	 * 
	 * @param userVo
	 * @param title
	 *            事件标题
	 * @param descr
	 *            事件描述
	 * @param start
	 *            事件开始日期
	 * @param end
	 *            事件结束日期
	 * @return 数据记录结果
	 */
	@RequestMapping("/newEvent.do")
	@ResponseBody
	public String newEvent(@ModelAttribute("userVo") UserVo userVo,
			String title, String descr, String start, String end) {
		Map<String, String> data = new HashMap<String, String>();
		try {
			String user_name = userVo.getUserName();
			Date start_date = new Date(new Long(start));
			Date end_date = new Date(new Long(end));

			String start_date_str = DateUtils.date2String(start_date,
					DateUtils.LONG_DATE);
			String end_date_str = DateUtils.date2String(end_date,
					DateUtils.LONG_DATE);

			logger.info("start:  " + start_date_str);
			logger.info("end:  " + end_date_str);
			
			Map<String, String> params = new HashMap<String, String>();
			params.put(EventsConstants.TITLE, title);
			params.put(EventsConstants.DESCR, descr);
			params.put(EventsConstants.START, start_date_str);
			params.put(EventsConstants.END, end_date_str);
			params.put(EventsConstants.USER_NAME, user_name);

			int i = todoService.insert(params);
			data.put(Constans.RESULT, Constans.SUCCESS);

		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);
	}
	
	@RequestMapping("/updateEvent.do")
	@ResponseBody
	public String updateEvent (String title,String descr,String id){
		Map<String, String> data = new HashMap<String, String>();
		Map<String, String> params = new HashMap<String, String>();
		try {
			params.put(EventsConstants.TITLE, title);
			params.put(EventsConstants.DESCR, descr);
			params.put(EventsConstants.ID, id);
			
			todoService.updateEvent(params);
			data.put(Constans.RESULT, Constans.SUCCESS);
			
		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);
	}
	
	@RequestMapping("/delEvent.do")
	@ResponseBody
	public String delEvent (String id){
		Map<String, String> data = new HashMap<String, String>();
		Map<String, String> params = new HashMap<String, String>();
		try {
			params.put(EventsConstants.ID, id);
			
			todoService.delEvent(params);
			data.put(Constans.RESULT, Constans.SUCCESS);
			
		} catch (Exception e) {
			data.put(Constans.RESULT, Constans.ERROR);
		}
		return FastJsonUtils.toJSONString(data);
	}
	
}
