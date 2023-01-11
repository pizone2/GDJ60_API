package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		int [] ar = new int [6];
		int i;
		boolean check = true;
		ArrayList<Integer> ar2= new ArrayList<>(6);
		//1000원 로또 구매 1~45 6개
		
		//2. Set
		
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size() < 6) {
			hs.add(random.nextInt(45)+1);
		}
		
		System.out.println(hs);
		
		
//		while(ar2.size()<6) {
//			
//			int n = random.nextInt(45)+1;
//			
//			for( i = 0; i < ar2.size(); i++) {
//				if(n != ar2.get(i)) {
//					check = false;
//					break;
//				}
//			}
//			
//			if(check) {
//				ar2.add(n);
//			}
//			
//			for(int j = 0; j < ar2.size(); j++) {
//				System.out.println(ar2.get(j));
//			}
//		}
		
		
		
		
		//1.배열
		
		for(i =0; i < 6 ; i++) {
		ar [i] = random.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(ar[i] == ar[j]) {
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
