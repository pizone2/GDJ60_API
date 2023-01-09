package com.iu.api2.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int [] arr = new int [3];
		ArrayList ar =new ArrayList();
		// 다형성
//		Integer num1 = new Integer(1); Auto-Boxing으로 진행
//		int num2 = 3; //Auto-Boxing
		ar.add(1); //Auto-Boxing 1이 Integer로 바뀌었다가 다형성으로
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
		int n1 = (Integer) ar.get(0); // Un-Boxing;
		double n2 = (double) ar.get(1);
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}
