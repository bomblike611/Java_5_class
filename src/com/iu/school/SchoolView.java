package com.iu.school;

public class SchoolView {

	//web
	public void info(Student student) {
		System.out.println("이름 : "+student.name+" 번호 : "+student.num+" 국어 : "+student.kor+" 영어 : "+student.eng+" 수학 : "+student.math);
		System.out.println("총점 : "+ student.total+" 평균 : "+student.avg);
		System.out.println("==================================================================");
	}
}
