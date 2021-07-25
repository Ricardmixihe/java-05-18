package com.jizhong.controller;

import com.jizhong.impl.Student;
import com.jizhong.impl.Teacher;
import com.jizhong.pojo.SchoolMaster;

public class TestCheck {
	public static void main(String[] args) {
		//校长
		SchoolMaster xiaozhang = new SchoolMaster();
		Teacher t = new Teacher();
		Student s = new Student();
		xiaozhang.checkWelcome(t);//Welcome
		
		
//		int i = 100;
//		double d = i;//自动类型转换
//		int i2 = (int)d;//强制类型转换
	}
}
