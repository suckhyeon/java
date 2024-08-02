package test240802.object1;

import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
		public void client() {
		int port = 3000;
		String serverIP;
		
		Socket socket = null;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			socket = new Socket(serverIP, port);
			}		
		}
}
