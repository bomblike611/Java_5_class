package com.iu.insa;

import java.util.Scanner;

import com.iu.school.Student;

public class MainTest_2 {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Student student;
		Student [] ar=new Student[3];
		
		
		for(int i=0;i<ar.length;i++) {
			 student= new Student();
			 System.out.println("이름 입력");
			 student.name=sc.next();
			 System.out.println("국어 점수");
			 student.kor=sc.nextInt();
			 System.out.println("영어 점수");
			 student.eng=sc.nextInt();
			 System.out.println("수학 점수");
			 student.math=sc.nextInt();
			 student.setTotal();
			 student.setAvg();
			 System.out.println("이름 : "+student.name);
			 System.out.println("평균 : "+student.avg);
			 ar[i]=student;
		}//for의 끝
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("===================================================");
			System.out.println("이름 : "+ar[i].name);
			System.out.println("총점 : "+ar[i].total);
			System.out.println("평균 : "+ar[i].avg);
		}
		
	}
}
