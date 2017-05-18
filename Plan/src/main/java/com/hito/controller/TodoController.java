package com.hito.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hito.domain.UserVo;

@Controller
@SessionAttributes("userVo")
@RequestMapping("/todo")
public class TodoController {
	private Logger logger = LoggerFactory.getLogger(TodoController.class);

	@ModelAttribute("userVo")
	public UserVo initUserVo() {
		return new UserVo();
	}
}
