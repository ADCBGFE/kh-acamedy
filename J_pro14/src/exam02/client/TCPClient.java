package exam02.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			/*
			 *  1. 클라이언트용 소켓 생성
			 */
			byte[] addr = new byte[] {(byte)172, (byte)30, 1, 41};
			InetAddress serverIP = InetAddress.getByAddress(addr);
			int serverPort = 50000;
			
			Socket sock = new Socket(serverIP, serverPort);
			
			/*
			 *  2. 통신용 입출력 스트림 생성
			 */
			BufferedReader sockIn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
										// 성능 향상			// 문자 변환 보조			// 바이트 기반
			BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
										//   버퍼		->			문자			->     바이트
			
			while(true) {
				// 서버로부터 수신한 메시지가 있으면 반복 진행.
				while(sockIn.ready()) {
					String line = sockIn.readLine();
					System.out.println(line);
				}
				
				// 서버에 메시지 전송
				System.out.print("client : ");
				String msg = sc.nextLine();
				sockOut.write(msg);
				sockOut.newLine();
				sockOut.flush();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
