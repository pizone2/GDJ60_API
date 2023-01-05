package com.iu.api1.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
	
	System.out.println(String.CASE_INSENSITIVE_ORDER);
	
	String str = new String("abc");
	String str2 =  "abc";
	
	System.out.println(str2);
	
	boolean check = str.equals(str2);
	System.out.println(check);
	
	char a = str.charAt(2); // 배열의 인덱스 값을 반환
	System.out.println(a);
	
	Scanner sc = new Scanner(System.in);
//	sd = sc.next().charAt(a);
	
	
	int ido = str.indexOf(str);
	System.out.println(ido);
	
	
	
	
	}

}
