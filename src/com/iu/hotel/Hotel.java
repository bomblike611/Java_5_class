package com.iu.hotel;

public class Hotel {
	String name;
	int level;
	int price;
	int totalRoom;
	int reservedRoom;
	int emptyRoom;

	public void checkIn() {
		if(emptyRoom==0) {
			System.out.println("예약가능한 방이 없습니다.");
		}else {
			reservedRoom++;
			emptyRoom=totalRoom-reservedRoom;
		}
	}

	public void checkout() {
		if(emptyRoom==totalRoom) {
			System.out.println("잘못된 입력입니다.");
		}else {
			emptyRoom++;
			reservedRoom=totalRoom-emptyRoom;
		}
	}

	public void info() {
		System.out.println("NAME :" +name);
		System.out.println("LEVEL :"+level);
		System.out.println("TOTALROOM :"+totalRoom);
		System.out.println("RESERVEDTOOM : "+reservedRoom);
		System.out.println("EMPTYROOM :"+emptyRoom);
	}

}
