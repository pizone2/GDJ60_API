package com.iu.api1.strings;

public class StringStudey2 {

	public static void main(String[] args) {
		String email = "a@bc@123@gmail.com";
		int idx = email.lastIndexOf("@");
		System.out.println(idx);
	
		System.out.println(email.length());
	
		for(int i=0; i<email.length();i++) {
			int cha = email.charAt(i);
			char cha2 = (char) cha;
			System.out.println(cha2);
		}
		
		System.out.println("Before Email"+email);
		email = email.replace("@","_");
		System.out.println("After Email"+email);
	
	}

}
