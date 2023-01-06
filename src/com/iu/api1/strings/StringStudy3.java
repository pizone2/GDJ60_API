package com.iu.api1.strings;

import java.util.Scanner;

public class StringStudy3 {

	public static void main(String[] args) {
		Object object = new Object();
		Scanner sc  = new Scanner(System.in);
		//Java.lang 은 import를 안함
		//클래명 변수명 = new 생성자()
		//String 불변
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1==str3);
		
		
		
		
		
		
	}

}
