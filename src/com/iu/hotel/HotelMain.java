package com.iu.hotel;

import java.util.Scanner;

public class HotelMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		

		Hotel a= new Hotel();
		a.name="A";
		a.level=3;
		a.price=150000;
		a.totalRoom=30;
		a.reservedRoom=29;
		a.emptyRoom=10;
		
		
		while(true) {

			System.out.println("======1.체크인 2.체크아웃 3.정보보기 4.종료======");
			int select=sc.nextInt();
			if(select==1) {
				a.checkIn();
			}else if(select==2) {
				a.checkout();
			}else if(select==3) {
				a.info();
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
