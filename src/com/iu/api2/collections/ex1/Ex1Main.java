package com.iu.api2.collections.ex1;

import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {
		//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
		//1. 학생정보초기화
		//2. 학생정보전체조히
		//3. 학생정보검색조회(이름)
		//4. 학생정보추가
		//5. 학생정보삭제(이름)
		//6. 프로그램종료
		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> ar = dao.init();

		dao.addStudnet(ar);
//		StudentDTO studentDTO =  dao.findByName(ar);
//		
//		System.out.println(studentDTO.getName());
		
				for(int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i).getName());
		}
		
		//향상된 for
//		for(StudentDTO studentDTO:ar) {
//			
//		}
//		int [] nums = new int [3];
//		for(int n:nums) {
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
