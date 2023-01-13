package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClientMain {

	public static void main(String[] args) {
		Socket sk = null;
		OutputStreamWriter ow =null;
		OutputStream os = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		Scanner sc = new Scanner(System.in);
		String msg = new String();
		String readmsg = new String();
		
		StudentDAO studentDAO;
		String ar = new String();
		ArrayList<StudentDTO> al = new ArrayList<>();

		
	
		try {
///////////////////////////보내는곳///////////////////////////////		
			sk = new Socket("192.168.1.31", 8282);
//			sk = new Socket("127.0.0.1", 8282);
			System.out.println("Sever 접속 성공");
			
			os = sk.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			is = sk.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			
			
			
			
for(int k = 0; k < 1000 ; k++) {	
			
			System.out.println("1.전체학생정보출력");
			System.out.println("2.학생정보검색출력");
			System.out.println("3.학생정보추가");
			System.out.println("4.학생정보삭제");
			System.out.println("5.종료");
			
			int cho = sc.nextInt();
			
			if(cho == 1) {
				
				msg = "1" ;
				
			}else if (cho == 2) {
				
				msg = "2" ;
				
			}else if (cho == 3) {
				
				msg = "3";
				
			}else if (cho == 4) {
				
				msg = "4";
				
			}else {
				System.out.println("종료");
				msg = "5";
			}
			
			bw.write(msg+"\r\n");
			bw.flush();
			if(cho == 5) {
				k = 10000;
			}
			
			
////////////////////////////받는곳///////////////////////////////	
			readmsg  = br.readLine();
			System.out.println("받은것"+readmsg );
////////////////////////2,3,4 다시 보내기/////////////////////////
			
			if(cho == 1) {
				//전체학생정보 출력
				StringTokenizer st = new StringTokenizer(readmsg,"-");
				////////////////////////////파싱
				while(st.hasMoreTokens()) {
					StudentDTO studentDTO = new StudentDTO();
					studentDTO.setName(st.nextToken());
					studentDTO.setNum(Integer.parseInt(st.nextToken()));
					studentDTO.setKor(Integer.parseInt(st.nextToken()));
					studentDTO.setEng(Integer.parseInt(st.nextToken()));
					studentDTO.setMath(Integer.parseInt(st.nextToken()));
					studentDTO.setTotal(Integer.parseInt(st.nextToken()) );
					studentDTO.setAvg(Double.parseDouble(st.nextToken()));
//					studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath() );
//					studentDTO.setAvg((double)studentDTO.getTotal()/3.0);
					
					al.add(studentDTO);
					
				}
				///////////////////////////출력
				for(int i = 0; i < al.size(); i++) {
					System.out.println(al.get(i).getName());
					System.out.println(al.get(i).getNum());
					System.out.println(al.get(i).getKor());
					System.out.println(al.get(i).getEng());
					System.out.println(al.get(i).getMath());
					System.out.println(al.get(i).getTotal());
					System.out.println(al.get(i).getAvg());
				}
				
				
			}else if (cho == 2) {
				
				System.out.println("검색할 학생의 이름를 입력하세요.");
				String name = sc.next();
				
				msg = name;
				
			}else if (cho == 3) {
				studentDAO= new StudentDAO();
				studentDAO.addStudent(ar);
				
				msg = ar;
				
			}else if (cho == 4) {
				
				System.out.println("삭제할 학생의 이름를 입력하세요.");
				String name = sc.next();
				
				msg = name;
				
			}else {
				System.out.println("종료");
				msg = "5";
			}
			
			bw.write(msg+"\r\n");
			bw.flush();
			if(cho == 5) {
				k = 10000;
			}
//////////////////////////받는곳///////////////////////////////	
			readmsg  = br.readLine();
			System.out.println("받은것"+readmsg );
/////////////////////////출력////////////////////////////////
			String read = new  String();
			if(read.equals(read)) {
				continue;
			}
			
			if(cho == 2) {
				
				StringTokenizer st = new StringTokenizer(readmsg,"-");
				////////////////////////////파싱
				while(st.hasMoreTokens()) {
					StudentDTO studentDTO = new StudentDTO();
					studentDTO.setName(st.nextToken());
					studentDTO.setNum(Integer.parseInt(st.nextToken()));
					studentDTO.setKor(Integer.parseInt(st.nextToken()));
					studentDTO.setEng(Integer.parseInt(st.nextToken()));
					studentDTO.setMath(Integer.parseInt(st.nextToken()));
					studentDTO.setTotal(Integer.parseInt(st.nextToken()) );
					studentDTO.setAvg(Double.parseDouble(st.nextToken()));
					al.add(studentDTO);
					
				}
				///////////////////////////출력
				for(int i = 0; i < al.size(); i++) {
					System.out.println(al.get(i).getName());
					System.out.println(al.get(i).getNum());
					System.out.println(al.get(i).getKor());
					System.out.println(al.get(i).getEng());
					System.out.println(al.get(i).getMath());
					System.out.println(al.get(i).getTotal());
					System.out.println(al.get(i).getAvg());
				}
				
				
			}if (cho == 3) {
				
				StringTokenizer st = new StringTokenizer(readmsg,"-");
				////////////////////////////파싱
				while(st.hasMoreTokens()) {
					StudentDTO studentDTO = new StudentDTO();
					studentDTO.setName(st.nextToken());
					studentDTO.setNum(Integer.parseInt(st.nextToken()));
					studentDTO.setKor(Integer.parseInt(st.nextToken()));
					studentDTO.setEng(Integer.parseInt(st.nextToken()));
					studentDTO.setMath(Integer.parseInt(st.nextToken()));
					studentDTO.setTotal(Integer.parseInt(st.nextToken()) );
					studentDTO.setAvg(Double.parseDouble(st.nextToken()));
					
					al.add(studentDTO);
					
				}
				///////////////////////////출력
				for(int i = 0; i < al.size(); i++) {
					System.out.println(al.get(i).getName());
					System.out.println(al.get(i).getNum());
					System.out.println(al.get(i).getKor());
					System.out.println(al.get(i).getEng());
					System.out.println(al.get(i).getMath());
					System.out.println(al.get(i).getTotal());
					System.out.println(al.get(i).getAvg());
				}
				
				
			}if (cho == 4) {
				
				StringTokenizer st = new StringTokenizer(readmsg,"-");
				////////////////////////////파싱
				while(st.hasMoreTokens()) {
					StudentDTO studentDTO = new StudentDTO();
					studentDTO.setName(st.nextToken());
					studentDTO.setNum(Integer.parseInt(st.nextToken()));
					studentDTO.setKor(Integer.parseInt(st.nextToken()));
					studentDTO.setEng(Integer.parseInt(st.nextToken()));
					studentDTO.setMath(Integer.parseInt(st.nextToken()));
					studentDTO.setTotal(Integer.parseInt(st.nextToken()) );
					studentDTO.setAvg(Double.parseDouble(st.nextToken()));
					
					al.add(studentDTO);
					
				}
				///////////////////////////출력
				for(int i = 0; i < al.size(); i++) {
					System.out.println(al.get(i).getName());
					System.out.println(al.get(i).getNum());
					System.out.println(al.get(i).getKor());
					System.out.println(al.get(i).getEng());
					System.out.println(al.get(i).getMath());
					System.out.println(al.get(i).getTotal());
					System.out.println(al.get(i).getAvg());
				}
				
				
			}else if (cho == 5) {
				System.out.println("종료");
				k = 10000;
			}
			
			
			
			
			
		
}			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
				ir.close();  
				is.close();
				bw.close();
				os.close();
				ow.close();
				sk.close();
			}
			catch (Exception e) {
			}
			
		 }

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
