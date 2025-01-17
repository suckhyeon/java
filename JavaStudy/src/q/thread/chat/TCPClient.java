package q.thread.chat;

import java.io.IOException;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 3000); //localhost 는 내 주소
			
			if(socket != null) {
				System.out.println("서버와 연결 성공");
			}
			
			//클라이언트로부터 메세지를 받는 쓰레드
			ClientRecive task1 = new ClientRecive(socket);
			task1.start();
//			ClientRecive recive = new ClientRecive(socket);
//			Thread reciveTask = new Thread(recive);
//			reciveTask.start();
			
			//클라이언트로부터 메세지를 보내는 쓰레드
			ClientRecive task2 = new ClientRecive(socket);
			task2.start();
//			ClientRecive send = new ClientRecive(socket);
//			Thread sendTask = new Thread(send);
//			sendTask.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}
