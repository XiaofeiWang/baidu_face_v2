package com.baidu.ai;

import com.baidu.ai.aip.auth.AuthService;

public class Action {

	public static void main(String[] args) {
		AuthService as = new AuthService();
		System.out.println(as.getAuth());
	}
}
