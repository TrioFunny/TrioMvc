package com.fun.body.all.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fun.body.all.dto.UserInfoDto;
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

    /**
     * 获取用户信息
     * wkf
     * @param request
     * @param response
     * @param userId 
     * @return
     */
    @RequestMapping(value="/getUserInfo")
    @ResponseBody
	public ResultMsg getUserInfo(HttpServletRequest request,HttpServletResponse response,String userId) {
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
    
    /**
     * 修改用户信息
     * @param request
     * @param response
     * @param userId
     * @return
     */
    @RequestMapping(value="/alterUserInfo")
    @ResponseBody
	public ResultMsg alterUserInfo(UserInfoDto userDto) {
    	ResultMsg resultMsg=new ResultMsg();
    	
    	if(userDto.getId()==null) {
    		resultMsg.error(ResultContant.RESULT_MSG_FAIL_NO_PARA,ResultContant.RESULT_CODE_FAIL_NO_PARA);
    		return resultMsg;
    	}
    	User user=userDto.toUser();
    	int result=userService.updateByPrimaryKeySelective(user);
    	if(result>0) {
    		resultMsg.success(null);
    	}
		return resultMsg;
	}
    
}
