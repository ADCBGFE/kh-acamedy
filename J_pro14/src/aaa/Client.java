package aaa;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) {
		int port = 3000;
		String serverIP;
		try {
			
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			
			
			Socket socket = new Socket(serverIP, port);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
