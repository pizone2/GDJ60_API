package com.iu.api2.collection;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다.
		//Generic : Type의 안전성 : <>
		//E : 변수명 : reference 타입만 넣을 수 있음.Object를 상속 받아야하기 떄문
		//E : Integer
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		
		int num = ar.get(0);
		
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Seoul");
		ar2.add(weatherDTO);
		weatherDTO.setCity("Jeju");
		ar2.add(weatherDTO);
		
//		weatherDTO = new WeatherDTO();
//		weatherDTO.setCity("Jeju");
		
//		ar.remove(we);
		
		for(int i = 0; i < ar2.size(); i++) {
			System.out.println(ar2.get(i).getCity()); //DTO타입.getcity
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
