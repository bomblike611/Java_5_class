package com.iu.ship;

import java.util.Scanner;

public class ShipController {

	public void start() {
		Ship s=new Ship();
		
		Scanner sc=new Scanner(System.in);
		boolean check=true;

		while(check) {
			System.out.println("=====항해를 시작하겠습니다. 선택지를 골라주세요=====");
			System.out.println("1.up 2.down 3.right 4.left 5.info 6.종료");
			System.out.println("=======================================");
			int select=sc.nextInt();
			switch(select) {
			case 1:
				s.moveUp();
				break;
			case 2:
				s.moveDown();
				break;
			case 3:
				s.moveRight();
				break;
			case 4:
				s.moveLeft();
				break;
			case 5:
				s.showInfo();
				break;
			case 6:
				System.out.println("종료합니다.");
				check=!check;
				break;
			}


		}

	}
	
	
}
