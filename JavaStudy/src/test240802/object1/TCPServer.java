package test240802.object1;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public void server() {
		int port = 3000;
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
		
			Socket client = server.accept();

		}

	}
}
//
//TCP 소켓을 사용하여 클라이언트에서 서버로 연결처리하는 
//네트워크 프로그램을 구동하였으나 서버와 연결이 되지 않았다.
//문제점이 있는 코드를 찾아 [원인](30점)에 파악된 문제점을
//기술하고, 해결 방안을 구상하여 [조치내용](30점)에 해결방법을
//작성하여 보고서를 완성하시오. (총 60점)