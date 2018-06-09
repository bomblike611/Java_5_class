package com.iu.animal;

public class Dog {
	String kind;
	int size;
	
	public void bark(int count) {
		//사이즈가 60이상이면 대형견
		//30이상이면 중형견
		//30미만이면 소형견
		for(int i=0;i<count;i++) {
		if(size>60) {
			System.out.println("월월");
		}else if(size>30) {
			System.out.println("왈왈");
		}else {
			System.out.println("멍멍");
		}
	}
	}
}
