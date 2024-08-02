package k.exception.ex1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
	/*
	 * 에러종류
	 * 1. 시스템에러 : 컴퓨터의 오작동으로 발생하는 에러 -> 소스코드로 해결이 안된다. (매우 심각)
	 * 2. 컴파일에러 : 소스코드 문법상의 오류 -> 애초에 빨간줄로 오류를 알려준다. (개발자의 실수) -> 발견과 해결이 쉽다.
	 * 3. 런타임에러 : 코드 상으로 문제가 없지만 프로그램 실행도중 발생하는 에러 (사용자의 실수 또는 개발자가 미처 처리하지 못한 기능)
	 * 4. 논리에러 : 문법적으로도 문제없고 실행했을 때도 문제는 없지만 프로그램의 의도와 맞지않는 동작이나 결과가 나타나는 에러
	 * 
	 * 예외 : 컴파일에러, 런타임에러, 논리에러와 같은 개발자가 예측가능하며 수정할 수 있는 에러들을 가지고 작업하는 것
	 * 예외처리 : 이러한 예외들이 발생했을 때를 처리하는 방법
	 * 
	 * 예외처리 목적 : 예외처리를 하지않고 그대로 예외가 발생할 경우 프로그램이 비정상적으로 종료될 수 있다.
	 *  
	 * 예외처리방법
	 * 1. try ~ catch 문을 이용
	 * 2. throws 를 이용하는 방법(떠넘기기)
	 * 
	 * 사용한 리소스 반납방법 2가지
	 * 1. finally 에서 반납 => 예외가 발생하건 안하건 try-catch 종료 후 마지막에 실행하는 코드
	 * 2. try-with-resource
	 * try (Scanner sc = new Scanner(System.in);) {
			ex.methodeA();
		} catch (IOException e) {
			System.out.println("main에서 해결");
			e.printStackTrace();
		}
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		RunException ex = new RunException();
		//ex.metode01();
		//ex.metode02();
		
		try {
			ex.methodeA();
		} catch (IOException e) {
			System.out.println("main에서 해결");
			e.printStackTrace();
		}
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("a/b...a :");
		int n1 = sc.nextInt();
		
		System.out.print("a/b...b : ");
		int n2 = sc.nextInt();
		
		System.out.printf("%d / %d = %d \n" , n1, n2, n1/n2);
		System.out.println("트라이종료");
		} catch(Exception e) {
			System.out.println("예외발생");
		}


		catch(ArithmeticException e) {
			System.out.println("수학적 에러발생");
		} catch(InputMismatchException e) {
			System.out.println("입력오류");
		}
		
		
		System.out.println("goob bye~");
		*/
	}

}
