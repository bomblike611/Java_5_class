package com.iu.school;

public class Student {

	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	public int total;
	public double avg;
	
	//접근지정자 모른다면 public 
	//그외지정자 모른다면 쓰지말것
	//리턴타입 모른다면 void
	//메소드명 지정
	//매개변수 모른다면 쓰지말것
	
	public void setTotal() {
		total=kor+eng+math;
	}
	public void setAvg() {
		avg=total/3.0;
	}
	public void showInfo() {
		System.out.println("이름 : "+name+" 번호 : "+num+" 국어 : "+kor+" 영어 : "+eng+" 수학 : "+math);
		System.out.println("총점 : "+ total+" 평균 : "+avg);
		System.out.println("==================================================================");
	}
	
	
}
