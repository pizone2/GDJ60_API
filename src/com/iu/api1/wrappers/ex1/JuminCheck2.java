package com.iu.api1.wrappers.ex1;

public class JuminCheck2 {

	
	
		//check
		//주민번호를 받아서
		//991224-1234567
		//맨끝자리는 체크용 번호로 뻄
		//  9  8  0  7  2  4 - 1  2  3  4  5  6  
		//  2  3  4  5  6  7   8  9  2  3  4  5
        // 18  24 0  35 12 28  8  18 6 12  20 30	
		// 합이 122, 합을 11로 나누어서 나머지를 구함
		// 122/ 11 = 몫 : 11 , 나머지는 1
		// 나머지값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인
		// 11-1 = 10
		// 11로 뺀 결과값이 두자리면
		// 11로 뺸 결과값을 다시 10의 나눈 나머지를 체크용 번호랑 같은지 확인
		// 10/10 몫 : 1 , 나머지 :0 0==7?
		
	public void check(String jumin) {
		int [] jumins = new int[12];
		int j = 2;
			
		for(int i=0; i < jumins.length; i++) {
				if(jumin.substring(i,i+1)== "-" ) {
					++i;
					continue;
				}else{
					jumins[i] = Integer.parseInt(jumin.substring(i,i+1)); //charAt 해결방안 charAt+"",String.valueof 사용
				}
			}
		//jumins ={9,8,0,7,2,4,1,2,3,4,5,6}
		for(int i=0; i < jumins.length-1; i++) {
			if(j == 10) {
				j = 2;
				jumins [i] = jumins [i]*j;
				++j;
			}else {
				jumins [i] = jumins [i]*j;
				++j;
			}
		}
		//주민번호에 곱한값 완료
		int hap = 0;
		for(int i=0; i<jumins.length; i++) {
			hap += jumins[i];
		}
		
		int result = 11 - hap%11;
		
		
		if(result>=10) {
			// 11로 뺸 결과값을 다시 10의 나눈 나머지를 체크용 번호랑 같은지 확인
			result = result % 10;
		}
		
		if (Integer.parseInt(  jumin.substring(13) )==result) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
