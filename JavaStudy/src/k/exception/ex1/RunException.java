package k.exception.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.Scanner;

public class RunException {

	public void metode01() {
Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("a/b...a :");
		int n1 = sc.nextInt();
		
		System.out.print("a/b...b : ");
		int n2 = sc.nextInt();
		
		System.out.printf("%d / %d = %d \n" , n1, n2, n1/n2);
		System.out.println("트라이종료");
		}catch(ArithmeticException e) {
			System.out.println("수학적 에러발생");
		} catch(AnnotationTypeMismatchException e) {
			System.out.println("입력오류");
		} 
		catch(Exception e) {
			System.out.println("예외발생");
		}
		
		System.out.println("goob bye~");
		
	}
	
	public void metode02() {//throws IOException 버퍼 리드라인 사용방법 1
		/*
		 * CheckedException : 반드시 예외처리를 해야되는 예외들
		 * => 조건문을 미리 제시할 수 없음(why? 예측이 불가한 곳에서 문제가 발생하기 때문에 예외처리가 필수)
		 * => 외부 메개체와 입출력이 일어날 때 발생한다.
		 * 
		 * 1. try ~ catch 문 : 여기서 곧바로 예외를 처리하겠다.
		 * 2. throws : 여기서 예외를 처리하지않고 현재 이 메소드를 호출한 곳으로 예외처리를 떠넘기겠다. 
		 */
		
		
		//Scanner 와 같이 키보드로 값을 입력받을 수 있는 객체(단 문자열로 읽어들인다.)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//사용방법 2
		String str = null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입력 : " + str);
	}
	
	public void methodeA() throws IOException {
		methodeB();
	}
	
	public void methodeB() throws IOException {
		methodeC();
	}
	
	public void methodeC() throws IOException {
		throw new IOException();
	}
}
