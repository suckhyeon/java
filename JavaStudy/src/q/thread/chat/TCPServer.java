package q.thread.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	
	public static void main(String[] args) {
		int port = 3000;
		
		try {
			ServerSocket soc = new ServerSocket(port);
			System.out.println("서버 연결준비 완료.....");
			
			Socket socket = soc.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "에서 연결함...");
			
			//클라이언트로부터 메세지를 받는 쓰레드
			ServerRecive recive = new ServerRecive(socket);
			Thread reciveTask = new Thread(recive);
			reciveTask.start();
			
			//클라이언트로부터 메세지를 보내는 쓰레드
			ServerRecive send = new ServerRecive(socket);
			Thread sendTask = new Thread(send);
			sendTask.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
