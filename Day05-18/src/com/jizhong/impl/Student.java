package com.jizhong.impl;

import com.jizhong.pojo.Welcome;

public class Student implements Welcome{

	@Override
	public void sayHello() {
		System.out.println("给老师打招呼~~");
	}
	
	public void play(){
		System.out.println("打游戏~~~~");
	}
	
}
