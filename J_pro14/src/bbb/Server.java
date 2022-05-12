package bbb;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
	
	public static void main(String[] args) {
		int port = 3000;
		String serverIP;
		ServerSocket server;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			server = new ServerSocket(port);
			
			
			
			while(true) {
				Socket client = server.accept();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
