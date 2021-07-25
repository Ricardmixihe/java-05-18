package com.jizhong.pojo;

import com.jizhong.impl.Person;

public class Cat {
	
	private Actor actor = null;//参与者   成员变量
	
	//设置参与者
	public void setActor(Actor actor){
		this.actor = actor;
	}
	
	public void cry(){
		System.out.println("猫咪尖叫~~~");
		//参与者响应~~~
		actor.response();
	}
	
	
	public static void main(String[] args) {
		Cat cat = new Cat();
//		Mouse mouse = new Mouse();
		Person person = new Person();
		cat.setActor(person);
		cat.cry();
		cat.cry();
		cat.cry();
	}
}
