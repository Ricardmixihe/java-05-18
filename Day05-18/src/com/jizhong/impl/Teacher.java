package com.jizhong.impl;

import com.jizhong.pojo.Welcome;

public class Teacher implements Welcome{

	@Override
	public void sayHello() {
		System.out.println("学生好~~~");
	}

}
