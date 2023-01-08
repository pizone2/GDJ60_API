package com.iu.api1.strings;

public class StringEx1 {

	public static void main(String[] args) {
		//
		String phone = "010-1234-5678";
	int idx = 0;

	
//	ddd
	
	
	
		boolean check = true;
	
		
	while(check) {
		idx = phone.indexOf('-',idx);
		
		
		
		if(idx != -1) {
			System.out.println(idx);
			idx++;
		}else{
			check=false;
			break;
		}
	}
		
		
		
		
		
		
	}

}
