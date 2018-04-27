package com.fun.test;

import java.util.UUID;

import com.mysql.jdbc.StringUtils;


public class test {

	public static void main(String[] args) {
		String userName="";
		if(!StringUtils.isNullOrEmpty(userName)) {
			System.out.println("1:"+userName);
		}
		String userName1=null;
		if(!StringUtils.isNullOrEmpty(userName1)) {
			System.out.println("2:"+userName1);
		}
		String userName2="123";
		if(!StringUtils.isNullOrEmpty(userName2)) {
			System.out.println("3:"+userName2);
		}
	}

}
