package com.fun.body.all.controller;

import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fun.body.all.model.User;
import com.fun.body.all.service.IUserService;
import com.fun.util.contstant.ResultContant;
import com.fun.util.msg.ResultMsg;
import com.fun.util.mybatisUtil.SqlUtil;
import com.fun.util.mybatisUtil.SqlUtil.SpliceType;

@Controller()
@RequestMapping("/login")
public class LoginController {

	@Resource
	private IUserService userService;
<<<<<<< HEAD

	@RequestMapping(value = "/login")
	@ResponseBody
	public ResultMsg login(HttpServletRequest request, String userName, String password) {
		ResultMsg resultMsg = new ResultMsg();
		if (userName.equals("") || password.equals("")) {
			resultMsg.error(ResultContant.RESULT_MSG_FAIL_NO_PARA, ResultContant.RESULT_CODE_FAIL_NO_PARA);
			return resultMsg;
		}
		User uesr = userService.selectByPrimaryKey(userName);
		if (uesr != null) {
			resultMsg.success(uesr);
		} else {
			resultMsg.error(ResultContant.RESULT_MSG_USERNAME_ERROR, ResultContant.RESULT_CODE_USERNAME_ERROR);
		}

=======
	
    @RequestMapping(value="/login")
    @ResponseBody
	public ResultMsg login(HttpServletRequest request,String userName,String password) {
    	ResultMsg resultMsg=new ResultMsg();
    	if(userName.equals("")||password.equals("")) {
    		resultMsg.error(ResultContant.RESULT_MSG_FAIL_NO_PARA,ResultContant.RESULT_CODE_FAIL_NO_PARA);
    		return resultMsg;
    	}
    	User uesr=userService.selectByPrimaryKey(userName);
    	if(uesr!=null) {
    		resultMsg.success(uesr);
    	}else {
    		resultMsg.error(ResultContant.RESULT_MSG_USERNAME_ERROR, ResultContant.RESULT_CODE_USERNAME_ERROR);
    	}
>>>>>>> 289219c77349e33e9a2bbc993dbdf5f45ea9f705
		return resultMsg;
	}

	@RequestMapping(value = "/regist")
	@ResponseBody
	public ResultMsg regist(String userName) {
		ResultMsg resultMsg = new ResultMsg();
		if (StringUtils.isEmpty(userName)) {
			resultMsg.error(ResultContant.RESULT_MSG_USERNAME_NULL, ResultContant.RESULT_CODE_USERNAME_NUll);
			return resultMsg;
		} else {
			String sql = SqlUtil.spliceSpl(SpliceType.EqualTo, "userName", userName);
			List<User> uesrList = userService.selectUser(sql);
			if (uesrList.size() != 0) {
				resultMsg.error(ResultContant.RESULT_MSG_USERNAME_REPEAT, ResultContant.RESULT_CODE_USERNAME_REPEAT);
				return resultMsg;
			} else {
				String msg = "用户名使用成功";
				resultMsg.success(msg);
				return resultMsg;
			}
		}
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public ResultMsg register(HttpServletRequest request, String userName, String password) {
		ResultMsg resultMsg = new ResultMsg();
		if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
			resultMsg.error(ResultContant.RESULT_MSG_FAIL_NO_PARA, ResultContant.RESULT_CODE_FAIL_NO_PARA);
			return resultMsg;
		}
		// 用户名不重复
		String sql = SqlUtil.spliceSpl(SpliceType.EqualTo, "userName", userName);
		List<User> uesrList = userService.selectUser(sql);
		if (uesrList.size() == 0) {
			// 可以注册
			User user = new User();
			String uuid = UUID.randomUUID().toString().replaceAll("-", "");
			user.setId(uuid);
			user.setUsername(userName);
			user.setPassword(password);
			if (userService.insertSelective(user) > 0) {
				resultMsg.success(null);
				return resultMsg;
			}
			resultMsg.error(ResultContant.RESULT_MSG_REGISTER_FAIL, ResultContant.RESULT_CODE_REGISTER_FAIL);
		} else {
			resultMsg.error(ResultContant.RESULT_MSG_USERNAME_REPEAT, ResultContant.RESULT_CODE_USERNAME_REPEAT);
		}

		return resultMsg;
	}

	@RequestMapping(value = "/userInfo")
	@ResponseBody
	public ResultMsg getUserInfo(HttpServletRequest request, String userName) {
		ResultMsg resultMsg = new ResultMsg();
		if (userName.equals("")) {
			resultMsg.error(ResultContant.RESULT_MSG_FAIL_NO_PARA, ResultContant.RESULT_CODE_FAIL_NO_PARA);
			return resultMsg;
		}
		// 用户名不重复
		String sql = SqlUtil.spliceSpl(SpliceType.EqualTo, "userName", userName);
		List<User> user = userService.selectUser(sql);

		return resultMsg;
	}
}
