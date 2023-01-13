package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class SeverTestMain {

	public static void main(String[] args) {

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

				
				is = sk.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				String msg2 = new String();
				
				msg2 = br.readLine();
				System.out.println("Cilent : "+msg2);
			//////////////////////////////////////////////////
				 os = sk.getOutputStream();
				 ow = new OutputStreamWriter(os);
				 bw = new BufferedWriter(ow);
				
				 String msg = new String();
				 msg = "김진일-1-34-23-42-김진이-1-34-23-42-김진삼-1-34-23-42-";
			
				bw.write(msg+"\r\n");
				bw.flush();
				
				
				
				
				
				
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
