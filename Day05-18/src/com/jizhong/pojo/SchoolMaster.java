package com.jizhong.pojo;

import com.jizhong.impl.Student;

public class SchoolMaster {
	
	//校长检查打招呼
	public void checkWelcome(Welcome wel){//t
		wel.sayHello();
		
		//强制类型转换
		if (wel instanceof Student) {
			Student student = (Student)wel;//new Teacher
			student.play();
		}
		
		
//		Welcome welcome = new Student();
//		Student s = (Student)welcome;
//		s.play();
	}

}
