package com.iu.api2.util;

import java.util.ArrayList;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		int [] ar = new int [6];
		int i;
		int j;
		//1000원 로또 구매 1~45 6개
		
		for(i =0; i < 6 ; i++) {
		ar [i] = random.nextInt(45)+1;
			for(j = 0; j < i; j++) {
				if(ar[i] == ar[i-1]) {
					--i;
					System.out.println("중복");
					;
				}
			}
		}
		
		for(int c = 0; c < 6 ; c++) {
			System.out.print(ar[c]+" ");
		}
			
			
			
			

			
			
			
//			if(ar[i] == ar[i-1]) {
//				--i;
//			}
//			else{
//				ar [i] = random.nextInt(45)+1;
//			}
		
		
	}

}
