package com.fun.body.all.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fun.body.all.model.User;
import com.fun.body.all.service.IUserService;
import com.fun.util.contstant.ResultContant;
import com.fun.util.msg.ResultMsg;


@Controller()
@RequestMapping("/user")
public class UserController {

	@Resource 
	private IUserService userService;
	
	
    @RequestMapping(value="/getUser")
    @ResponseBody
	public ResultMsg getUser(HttpServletRequest request,String userId) {
    	ResultMsg resultMsg=new ResultMsg();
    	if(userId==null) {
    		resultMsg.error(ResultContant.RESULT_MSG_FAIL_NO_PARA,ResultContant.RESULT_CODE_FAIL_NO_PARA);
    		return resultMsg;
    	}
    	User uesr=userService.selectByPrimaryKey(userId);
    	if(uesr!=null) {
    		resultMsg.success(uesr);
    	}
		return resultMsg;
	}
}
