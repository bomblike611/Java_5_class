package com.iu.school;

import java.util.Scanner;

public class StudentControl {
	Scanner sc=new Scanner(System.in);
	
	public void makeStudent() {
		System.out.println("학생 수를 입력하세요 :");
		int count=sc.nextInt();
		Student []ar=new Student[count];
		Student [] ar2=new Student[ar.length];

		for(int i=0;i<ar.length;i++) {
			Student s = new Student();
			System.out.println("번호 입력 ");
			s.num=sc.nextInt();
			System.out.println("이름 입력");
			s.name=sc.next();
			System.out.println("국어 점수");
			s.kor=sc.nextInt();
			System.out.println("영어 점수");
			s.eng=sc.nextInt();
			System.out.println("수학 점수");
			s.math=sc.nextInt();
			s.setTotal();
			s.setAvg();
			ar[i]=s;

		}
		System.out.println("=====학생이 모두 입력되었습니다.=====");
		

	}

	
	
}
