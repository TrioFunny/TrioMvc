package com.fun.util.basics.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;




/**
 * 
 * wkf
 * 2018-2-8
 */
@Controller
@RequestMapping("/baseController")
public class baseController {

	/**
	 * 初始化的时候执行一些操作
	 * wkf
	 * 2018-2-8
	 *@param binder
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder){
		//防止XSS攻击
//		binder.registerCustomEditor(String.class, new DefenseXss(true, false));
		
	}
	
	
}
