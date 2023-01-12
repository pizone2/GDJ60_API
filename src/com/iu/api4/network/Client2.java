package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		//1. 서버 접속 시도
		//2. 1. 점심 , 2. 저녁 , 3. 종료 클라이언트에서 print
		//3. 1,2,3, 고르기
		// 1번을 누르면 서버로 1이 가서 점심메뉴중 하나가 오고 출력
		// 2번을 누르면 서버로 2가 가서 저녁메뉴중 하나가 오고 출력
		// 3번 종료
		
		Socket sk = null;
		InputStream is = null;
		InputStreamReader ir = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
		
	
		try {
			sk = new Socket("127.0.0.1", 8282);
			System.out.println("Sever 접속 성공");

			os = sk.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			is = sk.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			while(true) {
				
			System.out.println("1.점 심");
			System.out.println("2.저 녁");
			System.out.println("3.종 료");
			String msg = sc.next();
			
			bw.write(msg+"\r\n");
			bw.flush();
			if(msg == "3") {
				break;
			}
		/////////////////////////////////////////////////////
			String msg2 = br.readLine();
			System.out.println("Cilent : "+msg2);
			if(msg == "3") {
				break;
				
			}
			
		
		}
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				bw.close();
				br.close();
				ow.close();
				os.close();
				ir.close();
				is.close();
				sk.close();
			}
			catch (Exception e) {
			}
			
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
