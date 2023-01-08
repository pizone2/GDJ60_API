package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		
		
		
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next(); //abc.jpg
		
//		//확장자 분리 작업
//		int idx = fileName.lastIndexOf(".");
////		System.out.println(idx);
//		String result = fileName.substring(idx+1);
////		System.out.println(result);
//		//확장자가 이미지인지 검증
//		boolean flag = true;
//
//		for(int i=0; i<names.length; i++) {
//			if(result.equals(names[i])) {
//				System.out.println("정상 파일이다");
//				flag = false;
//				break;
//			}
//				
//		}
//		
//		if(flag) {
//			System.out.println("비정상 파일이다");
//		}
//		
			
		

		
		
		
		
		
		
		//		String result = fileName.subString(0);
		
		
		//이미지파일이면 정상출력 아니면 출력 실패
		int i=0;
		for( i=0; i<names.length; i++) {
			if(names[i].equals(  fileName.substring(fileName.indexOf(".")+1) )) {
				System.out.println(fileName);
				break;
			}
		}	
		if(i==names.length+1) {
		 System.out.println("파일명의 확장자를 확인해주세요.");
		}
	
	
	
	
	
	
		System.out.println("finish");
	
	}

}
