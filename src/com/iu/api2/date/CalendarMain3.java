package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain3 {

	public static void main(String[] args) {
		//현재시간
		Calendar ca =Calendar.getInstance(); 
		ca.set(Calendar.DATE, 30);
		
		//3일후 (배송)
		Calendar ca2 =Calendar.getInstance();
		
//		ca2.set(Calendar.DATE, ca.get(Calendar.DATE)+3);
//		ca2.add(Calendar.DATE, 3);
		ca2.roll(Calendar.DATE,3);
		
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
		
	
	
	
	
	
	}

}
