package com.iu.insa;

import com.iu.school.Student;

public class MainTest_4 {
	public static void main(String[] args) {
		//변수 선언 공식
		//데이터타입 변수명;
		Student st =new Student();
		st.name="iu";
		st.kor=30;
		Student st2=st;
		st2.name="choa";
		System.out.println(st.name);
		
	}
}
