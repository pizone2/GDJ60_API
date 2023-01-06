package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명을 입력");
		String fileName = sc.next();
		int i=0;
		
		
		//이미지파일이면 정상출력 아니면 출력 실패
		
		for( i=0; i<names.length; i++) {
			if(names[i].equals(  fileName.substring(fileName.indexOf(".")+1) )) {
				System.out.println(fileName);
				break;
			}
		}	
		System.out.println("파일명의 확장자를 확인해주세요.");
	
	
	
	
	
	
	
	
	
	}

}
