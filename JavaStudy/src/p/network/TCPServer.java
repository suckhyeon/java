package p.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer { // 서버는 기다리는 것 ip주소는 고정값 포트는 바꿀수있다.
	/*
	 * TCP : 서버, 클라이언트간에 1:1 소켓통신이다. 데이터를 교환하기에 앞서 서버와 클라이언트가 연결 되어야한다.(서버가 먼저 실행되어 클라이언트의 요청을 기다린다.)
	 * 신뢰성있는 데이터를 전달 가능하다.
	 * 
	 * socket : 프로세스간의 통신을 담당한다.
	 * input / output을 가지고있다. (해당 스트림을 이용해서 입출력이 가능하다.)
	 * 
	 * ServerSocket : 포트와 연결되어 외부의 연결요청을 기다린다. -> 요청이 들어오면 수락해준다.
	 * 수락의 의미 : 통신할 수 있는 socket 생성
	 */

	// 서버용 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 1) 포트번호 지정(1000부터 10000까지의 랜덤포트 사용) 서버속에서 몇번 포트로 통로를 열것인가?
		int port = 3000;
		
		try {
			// 2) 서버소켓 객체생성시 포트와 결합(Bind)
			ServerSocket server = new ServerSocket(port);
			
			System.out.println("클라이언트 요청을 기다리고 있습니다.");
			
			// 3) 요청을 기다렸다가 요청이 오면 요청 수락 후 클라이언트와 통신할 수 있는 서버쪽 소켓객체 생성
			Socket socket = server.accept();
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함...");
			
			// 4) 클라이언트와 입출력 기반 스트림 생성(바이트스트림밖에 안된다.)
			// 5) 보조스트림을 활용해서 성능개선
			
			// 입력용 스트림 (클라이언트로부터 전달된 값을 한줄단위로 읽어들이기 위해서 입력용 스트림 사용)
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// BufferedReader : 데이터 입력시 readLine 메소드 이용가능
			
			// 출력용 스트림
			pw = new PrintWriter(socket.getOutputStream());
			//PrintWriter : 데이터 출력시 print(), println(), 메소드를 가지고있는 보조 스트림
			
			while(true) {
				String message = br.readLine();
				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
				
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); // 클라이언트에게 출력
				pw.flush(); // 현재 스트림에 있는 데이터를 강제로 내보내기
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
