package com.iu.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japan,도쿄";
		
		
		StringTokenizer st = new StringTokenizer(nations,",");
		
		while(st.hasMoreTokens()) {
			String t1 = st.nextToken();
			System.out.println(t1);
		}
		
		
		
		
		
	}

}
