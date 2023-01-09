package com.iu.api1.wrappers.ex1;

import java.util.Scanner;

public class JuminCheck {
	
	
	//check1 메소드
	//주민등록번호를 받아서
	//남자인지 여자인지 출력
	public void check1(String jumin) {
		//991223-1234567
//		jumin.charAt(7);
		String check = jumin.substring(7, 8);
		
//		int c = Integer.parseInt(check);
//		
//		if(c%2==1) {
//			
//		}else {
//			
//		}
		
		
		if(check.equals("1")|| check.equals("3")) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		
		
	}
	
	
	//check2 메소드
	//주민등록번호를 받아서
	//나이를 계산  태어난년도를 뺴면 됨
	//3~5 : 봄
	//6~8 : 여름
	//9~11: 가을
	//12~2: 겨울
	public void check2(String jumin) {
		//991223-1234567
		//1.나이계산
		String y = jumin.substring(0,2);
		String check = jumin.substring(7,8);
		int year = 1900;
		//String year = "19"
		if(check.equals("3")||check.equals("5")) {
			year = 2000;
			//year = "20"
		}
		
		
		year = year + Integer.parseInt(y);
		int age = 2023 -  year;
		System.out.println("Age : "+age);
		
//		2.나이계산
		String m = jumin.substring(2,4); //12
		int month = Integer.parseInt(m);
		if(month >= 3 && month <= 5) {
			System.out.println("봄");
		}else if(month >= 6 && month <=8) {
			System.out.println("여름");
		}else if(month >=9 && month <=11) {
			System.out.println("가을");
		}else
			System.out.println("겨울");
	
	
	}
	
	
	
	
	
}
