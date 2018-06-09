package com.iu.school;

import java.util.Scanner;

public class SchoolMan {
	public static void main(String[] args) {
		//학생의 수를 입력하세요
		//학생의 수만큼 이름, 번호, 국어, 영어, 수학 차례대로 입력
		//1.학생전체 정보 출력 2.학생검색정보출력 3.학생검색정보수정(국어,영어,수학 수정) 4.옵션/학생검색삭제

		//학생만들기
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 수를 입력하세요 :");
		int count=sc.nextInt();
		Student []ar=new Student[count];

		for(int i=0;i<ar.length;i++) {
			Student s = new Student();
			System.out.println("이름 입력");
			s.name=sc.next();
			System.out.println("번호 입력 ");
			s.num=sc.nextInt();
			System.out.println("국어 점수");
			s.kor=sc.nextInt();
			System.out.println("영어 점수");
			s.eng=sc.nextInt();
			System.out.println("수학 점수");
			s.math=sc.nextInt();
			s.setTotal();
			s.setAvg();
			ar[i]=s;

		}
		System.out.println("=====학생이 모두 입력되었습니다.=====");
		
		
		//선택목록 제작
		while(true) {
			System.out.println("//////실행할 명령을 선택해주세요//////");
			System.out.println("    1.학생 전체 정보 출력");
			System.out.println("    2.학생 검색 정보 출력");
			System.out.println("    3.학생 검색 정보 수정");
			System.out.println("    4.학생 검색 삭제");
			System.out.println("    5.종료");
			System.out.println("/////////////////////////////");
			int select=sc.nextInt();
			
			
			if(select==1) {
				for(int i=0;i<ar.length;i++) {
					ar[i].showInfo();
				}
			}
			else if(select==2) {
				System.out.println("검색할 번호를 입력해주세요");
				select=sc.nextInt();
				boolean check=true;
				for(int i=0;i<ar.length;i++) {
					if(ar[i].num==select) {
						ar[i].showInfo();
						check=!check;
						break;
						}
					}
				if(check) {
					System.out.println("번호가 없습니다.");
				}
			}
			else if(select==3) {
				System.out.println("검색할 번호를 입력해주세요");
				select=sc.nextInt();
				boolean check=true;
				for(int i=0;i<ar.length;i++) {
					if(ar[i].num==select) {
						System.out.println("수정할 국어 점수");
						ar[i].kor=sc.nextInt();
						System.out.println("수정할 영어 점수");
						ar[i].eng=sc.nextInt();
						System.out.println("수정할 수학 점수");
						ar[i].math=sc.nextInt();
						ar[i].setTotal();
						ar[i].setAvg();
						i+=ar.length;
						check=!check;
					}
				}
				if(check) {
					System.out.println("번호가 없습니다.");
				}
			}
			else if(select==4) {
				System.out.println("검색할 번호를 입력해주세요");
				select=sc.nextInt();
				boolean check=true;
				Student [] ar2=new Student[ar.length-1];
				int j=-1;
				for(int i=0;i<ar.length;i++) {
					if(!(ar[i].num==select)) {
						j++;
						if(j>=ar2.length) {
							check=!check;
							break;
						}
						ar2[j]=ar[i];
					}
					
				}//for문이 정상적으로 종료된 경우
				if(!check) {
					System.out.println("번호가 없습니다.");
				}else {
					ar=ar2;
				}
			}
			else {
				System.out.println("종료합니다.");
				break;
			}
				
			}
		}


	}

