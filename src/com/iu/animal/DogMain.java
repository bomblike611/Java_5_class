package com.iu.animal;

import java.util.Scanner;

public class DogMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dog d=new Dog();
		d.kind="말티즈";
		d.size=45;
		System.out.println("횟수를 입력하세요.");
		int count=sc.nextInt();
		d.bark(count);
		
		
	}
}
