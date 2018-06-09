package com.iu.insa;

import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		//객체 생성
		//클래스명 변수명
		//데이터타입 변수명
		//class =데이터타입
		String neme;
		Scanner sc;
		
		HR k1 =new HR();
		HR k2 =new HR();
		//k1, k2-referece,지역변수,참조변수
		//멤버변수 -> 참조변수명.멤버변수명
		//멤버메소드 ->참조변수명.멤버메서드명()
		System.out.println(k1.name);
		System.out.println(k1.sal);
		k1.name="iu";
		k1.job="대리";
		k1.dept="마케팅";
		k1.sal=3000;
		System.out.println(k1.name);
		System.out.println(k1.sal);
		k1.name="iu";
		k1.job="대리";
		k1.dept="마케팅";
		k1.sal=3000;
		
		System.out.println(k1==k2);
				
		
		
		
	}
}
