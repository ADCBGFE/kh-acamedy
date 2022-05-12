package exam01.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDTServer {
	
	public static void main(String[] args) {
		 try {
			/*
			 *  1. 네트워크 통신을 위한 IP주소 정보 설정
			 */
			 byte[] ipAddr = new byte[] {(byte)172, (byte)30, 1, 41};
			InetAddress iNet = InetAddress.getByAddress(ipAddr);
			
			DatagramSocket dSock = new DatagramSocket(5100, iNet);
			
			while(true) {
				/*
				 *  3. 클라이언트가 보낸 데이터그램 패킷 메시지를 수신대기함.
				 */
				byte[] buff = new byte[1024];
				DatagramPacket dPack = new DatagramPacket(buff, buff.length);
				System.out.print("수신대기...");
				dSock.receive(dPack);
				
				SimpleDateFormat sFormat = new SimpleDateFormat("[yyyy.mm.dd a hh:mm:ss.sss]");
				String time = sFormat.format(new Date());
				
				InetAddress clientIP = dPack.getAddress();
				int clientPort = dPack.getPort();
				System.out.printf("%s - %s:%d 에서 접속했습니다.\n", time, clientIP.toString(), clientPort);
				
				/*
				 *  4. 수신한 메시지를 문자열로 변환
				 */
				String rev = new String(dPack.getData(), 0, dPack.getData().length);
				System.out.println("Client 메시지를 수신하였습니다.");
				System.out.println("Client Message -> " + rev);
				
				/*
				 *  5. 응답을 위한 데이터 그램 생성
				 */
				String msg = "수신함.";
				clientIP = dPack.getAddress();
				clientPort = dPack.getPort();
				// InetAddress clientIP = dPack.getAddress();
				// int clientPort = dPack.getPort();
				DatagramPacket respPack = new DatagramPacket(msg.getBytes(), msg.getBytes().length, clientIP, clientPort);
				dSock.send(respPack);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
