package com.iu.insa;

import java.util.Scanner;

public class MainTest_3 {
	public static void main(String[] args) {
		//학생의 수를 입력//학생의 수만큼
		
		Scanner sc=new Scanner(System.in);
		System.out.println("학생의 수 입력");
		int count = sc.nextInt();
		String [] name=new String [count];
		int []kors=new int[name.length];
		int []engs =new int[name.length];
		
		
		for(int i=0; i<name.length;i++) {
			System.out.println(i+1+"번 이름 입력");
			name[i]=sc.next();
			System.out.println(i+1+"번 국어 점수 입력");
			kors[i]=sc.nextInt();
			System.out.println(i+1+"번 영어 점수 입력");
			engs[i]=sc.nextInt();
		}
		
		for(int i=0;i<name.length;i++) {
			System.out.println(kors[i]);
		}
		
	}
}
