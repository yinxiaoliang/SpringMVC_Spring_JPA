package com.integration.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.integration.infrastructure.utils.I18nUtils;

@Controller
@RequestMapping("/i18n")
public class I18nController {
	
	@RequestMapping("/example")
	public String i18n(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("国际化测试："+I18nUtils.i18n(request, "i18n"));
		return "i18n";
	}

}
