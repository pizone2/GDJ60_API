package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	private Scanner sc;
	
	//도시하나의 정보검색
	//search
	//매개변수호 날씨 배열을 받아서 키보드로부터 검색할 도시명을 입력받음 대소문자 상관없이 search가 가능해야함
	//도시명과 같은 DTO를 찾아서 찾은 DTO를 리턴함,없으면 null 리턴;
	public WeatherDTO findCity(WeatherDTO [] weatherDTOs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 도시명을 입력하시오.");
		String fCity = sc.next();
		WeatherDTO city = null;
		for(int i=0; i<weatherDTOs.length ;i++) {
			if(fCity == weatherDTOs[i].getCity()) {
					city = weatherDTOs[i];
			}
		}
		return city;
	}
	//add
	//배열을받고, 키보드로부터 정보들을 입력 받음
	//배열에 추가하고 배열 리턴
	public WeatherDTO [] add(WeatherDTO [] weatherDTOs) {
		this.sc = new Scanner(System.in);
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력하세요");
		weatherDTO.setCity(sc.next());
		System.out.println("기온을 입력하세요");
		weatherDTO.setGion(Integer.parseInt(sc.next()));
		System.out.println("날씨를 입력하세요");
		weatherDTO.setStatus(sc.next());
		System.out.println("미세먼지 입력하세요");
		weatherDTO.setMise(Integer.parseInt(sc.next()));
		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length+1];
		
		for(int i=0; i<weatherDTOs.length; i++) {
			newInfo[i] = weatherDTOs[i];
		}
		
		newInfo[weatherDTOs.length] = weatherDTO;
		
		return newInfo;
	}
	
	
	//remove
	//배열을 받고,키보드로부터 삭제할 도시명을 입력받음
	//배열에서 삭제하고 배열을 리턴
}
