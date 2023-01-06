package com.iu.api1.strings;

public class StringStudy5 {

	public static void main(String[] args) {
		String str = "apple@ Apple, aPPle# appLe";  //전처리작업 / 데이터를 이쁘게 하는것
		
		//replace(a,b) = old text 를 new text로 바꾸는것↓
		str = str.replace(",", "#");
		
		//공백을 제거하는것 / 값사이에 있는 공백도 제거됨. ↓
//		str = str.replace(" ", "");
		
		//split(a) = a기준으로 데이터 분할↓
		String [] result = str.split("#"); 	
		
		//하나의 문자열을 여러개의 문자열로 나누는 작업을 파싱(parsing)이라고 한다.
		
		
		
		//trim은 앞,뒤 공백제거 /값사이에 있는 공백은 제거가 되지 않는다.
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i].trim().toUpperCase());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
