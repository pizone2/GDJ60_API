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
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStreamWriter ow =null;
		OutputStream os = null;
		BufferedWriter bw = null;
		Scanner scanner = new Scanner(System.in);
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		
	
		
	
		try {
			//객체 생성시 서버 접속 시도
			socket = new Socket("192.168.1.31", 8282);
			System.out.println("Sever 접속 성공");
			
			while(true) {
				//0,1
				 os = socket.getOutputStream();
				//char
				 ow = new OutputStreamWriter(os);
				//Stream
				 bw = new BufferedWriter(ow);
				 
				 System.out.println("서버로 보낼 메세지 입력");
				 String msg = scanner.next();
				
				bw.write(msg+"\r\n");
				bw.flush();
				if(msg.toUpperCase().equals("q")) {
					break;
						
				}
				
			//////////////////////////////////////////////////////
	
				//0,1
				is = socket.getInputStream();
				//char
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				msg = br.readLine();
				System.out.println("Cilent : "+msg);
				if(msg.toUpperCase().equals("q")) {
					break;
					
				}
				
			}
				
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		finally{
			try {
			br.close();
			ir.close();
			is.close();
			bw.close();
			ow.close();
			socket.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
		
	
	}
}

