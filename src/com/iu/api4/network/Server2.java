package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) {
		//Client 접속 대기
		//1. 점심메뉴중에서 하나를 랜덤하게 골라서 전송
		//2. 저녁메뉴중에서 하나를 핸덤하게 골라서 전송
		//3. 종료
		ServerSocket ss = null;
		Socket sk = null;
		InputStream is = null;
		InputStreamReader ir = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner sc = new Scanner(System.in);
	
		
	
		
			try {
				ss = new ServerSocket(8282);
				System.out.println("Client 접속을 기다리는 중");
				sk = ss.accept();
				System.out.println("Client와 연결 성공");

				
			while(true) {
				is = sk.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				Random rd = new Random();
				String msg2 = new String();
				
				
				String msg = br.readLine();
				System.out.println("Cilent : "+msg);
				if(msg == "1") {
					int lc = rd.nextInt(4)+1;
						if(lc == 1) {
							msg2 = "스시";
						}else if(lc == 2){
							msg2 = "신라면";
						}else {
							msg2 = "닭가슴살";
						}
				}else if(msg == "2") {
					int lc = rd.nextInt(4)+1;
					if(lc == 1) {
						msg2 = "스테이크";
					}else if(lc == 2){
						msg2 = "수원왕갈비통닭";
					}else {
						msg2 = "가장맛있는족발";
					}
				}else {
					break;
				}
			//////////////////////////////////////////////////
				 os = sk.getOutputStream();
				 ow = new OutputStreamWriter(os);
				 bw = new BufferedWriter(ow);
				
				bw.write(msg2+"\r\n");
				bw.flush();
				
				if(msg == "3") {
					break;
						
				}
				
				
				
			}
				
				
				
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					bw.close();
					br.close();
					ow.close();
					os.close();
					ir.close();
					is.close();
					sk.close();
					ss.close();
					}catch (Exception e) {
						// TODO: handle exception
					}
					
				}
			
		
		
		
		
		
		
		
		
	}

}
