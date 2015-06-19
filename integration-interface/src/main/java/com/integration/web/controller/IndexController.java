package com.integration.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.integration.application.service.SysUserService;


@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired 
	private SysUserService sysUserService;
	
	@RequestMapping("/userlist")
	public String getUserList(Model model){
		model.addAttribute("userList", sysUserService.findAll());
		return "user_list";
	}
}
