package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherController {
	private Scanner sc;
	private WeatherData wd ;
	private WeatherView wv ;
	private WeatherInput wi ;
	private WeatherDTO [] datas ;
	
	
	public WeatherController() {
		this.sc = new Scanner(System.in);
		wd = new WeatherData();
		wv = new WeatherView();
		datas = new  WeatherDTO[4];
	}
	//start
	
	
	public void start() {
//		Scanner sc = new Scanner(System.in);
//		WeatherData wd = new WeatherData();
//		WeatherView wv = new WeatherView();
		WeatherInput wi = new WeatherInput();
//		WeatherDTO [] datas = new WeatherDTO[4];
		
		
		boolean check = true;
		
		while(check) {
			System.out.println("1.날씨정보초기화 2.전국날씨정보 3.지역날씨검색 4.지역날씨추가 5.지역날씨삭제 6.종료");
			int count = sc.nextInt();
			
			if (count == 1) {
				datas = wd.init();
				System.out.println("초기화가 완료 되었습니다.");
			
			}else if(count == 2) {
				wv.view(datas);
			
			}else if(count == 3) {
				WeatherDTO weatherDTO = wi.findCity(datas);
				if(weatherDTO != null ) {
					wv.view1(weatherDTO);
				}else
					System.out.println("해당 도시의 데이터가 존재하지않습니다.");
			
			}else if(count == 4) {
				this.datas= wi.add(datas);
			}else if(count == 5) {
				
			}else {
				check = false;
			}
			
			
		}
		
		
		
		
	}
	//1. 날씨정보초기화 //init호출 후 초기화가 완료 되었습니다.출력
	//2. 전국날씨정보  //WeatherDTO [] 출력 view에 있음
	//3. 지역날씨검색  //input에서 찾아서 있으면 dto 없으면 null을 controller로 리턴을 받음 후 정보를 찍어줌 없으면 "도시정보가 없습니다"출력
	//4. 지역날씨추가   //input으로 가서 add 새로운 도시를 추가해서 배열에 추가  // 추가하고 2번으로 학왼
	//5. 지역날씨삭제   // 배열에서 삭제 input사용
	//6. 종      료

}
