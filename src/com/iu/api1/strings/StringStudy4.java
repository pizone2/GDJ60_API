package com.iu.api1.strings;

public class StringStudy4 {

	public static void main(String[] args) {
		//String은 불변
		String str = "StarWars";
		
		String result = str.substring(4);
		
		System.out.println(result);
		
		result = str.substring(4,6);
		
		System.out.println(result);
		
		str = "tesdfdft@naver.com";
		
		int idx = str.indexOf("@");
		//indexOf(a) = a 인덱스를 출력 
		
		result = str.substring(idx+1);
		//substring(a,b) =  a 인덱스부터 b 인덱스 범위까지 출력 = 반환값 String
		
		System.out.println(result);
		
		
		
		
		
		
		
	}

}
