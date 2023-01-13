package com.iu.api4.network.ex.clients;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {

	private Scanner sc = new Scanner(System.in);
	
	//학생정보추가
		public String addStudent(String ar) {
			StudentDTO studentDTO = new StudentDTO();
			System.out.println("이름을 입력");
			studentDTO.setName(sc.next());
			System.out.println("번호를 입력");
			studentDTO.setNum(sc.nextInt());
			System.out.println("국어점수를 입력");
			studentDTO.setKor(sc.nextInt());
			System.out.println("영어점수를 입력");
			studentDTO.setEng(sc.nextInt());
			System.out.println("수학점수를 입력");
			studentDTO.setMath(sc.nextInt());
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath() );
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			
			ar  = studentDTO.getName() + "-"
				+ studentDTO.getNum() + "-"
				+ studentDTO.getKor() + "-"
				+ studentDTO.getEng() + "-"
				+ studentDTO.getMath() + "-"
				+ studentDTO.getTotal() + "-"
				+ studentDTO.getAvg();
			
		
			
			return ar;
			
	

		}
	
	
	//학생정보추가에 "-" 구분자 넣어주기
		public void add() {
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
