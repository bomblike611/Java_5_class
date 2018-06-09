package com.iu.ship;

public class Ship {
	int x;//경도
	int y;//위도
	
	//moveUp //경도가 1증가
	//moveDown //경도가 1감소
	//moveRight //위도가 1증가
	//moveLeft //위도가 1감소
	//showInfo //현재 위치를 출력
	
	public void moveUp() {
		x+=1;
	}
	public void moveDown() {
		x-=1;
	}
	public void moveRight() {
		y+=1;
	}
	public void moveLeft() {
		y-=1;
	}
	public void showInfo() {
		System.out.println("경도 : "+x+ " 위도 : "+y);
	}
	

}
