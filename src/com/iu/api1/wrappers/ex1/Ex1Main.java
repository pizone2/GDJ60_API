package com.iu.api1.wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력"); //99123-1234567   9  8  0  7  2  4 - 1  2  3  4  5  6  
		String jumin2 = sc.next() ;
		
		JuminCheck jc = new JuminCheck();
		JuminCheck2 jc2 = new JuminCheck2();	
		
		
		jc2.check(jumin2);
		
		jc.check1(jumin2);
		jc.check2(jumin2);
				
		
		
		
		
		
	}

	

}
