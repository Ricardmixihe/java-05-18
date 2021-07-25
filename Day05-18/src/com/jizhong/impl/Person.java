package com.jizhong.impl;

import com.jizhong.pojo.Actor;

public class Person implements Actor{

	@Override
	public void response() {
		System.out.println("人类惊醒~~~~");
	}

}
