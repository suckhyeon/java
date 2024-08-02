package b.operater;
import java.util.Scanner;

public class Operater4 {
	/*
	 * 비교연산자 / 관계연산자
	 * 두값을 비교하는 연산자
	 * 비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)를 반환
	 * 즉, 비교연산의 결과는 논리값
	 * 
	 * 대소비교연산 : < > <= >=
	 * 동등비교연산 : == !=
	 * 
	 * 원시타입 일반변수 => 동등비교를 == !=로 진행하면 된다.
	 * 
	 * String(문자열)은 단순하게 ==로 동등비교할 수 없다.
	 * 이유는 참조변수(객채를 담는 변수)이기 때문이다.
	 * 
	 * String 비교시에는 문자열.equals(문자열); 사용 
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//특이케이스(문자와 숫자간의 대소비교 가능!!)
		
		System.out.println('a' + 0);
		System.out.println('A' > 70);
		System.out.println((char)65);
		System.out.println((char)66);
		System.out.println((char)67);
		
		// 두수를 입력받아 어떤 숫자가 더 큰지를 출력하는 프로그램 만들기.
					// 첫번째 정수 :
					// 두번째 정수 :
					// 첫번째가 두번째보다 큽니다 : (true / false)
					// 첫번째 정수는 짝수입니다 : (true / false)
		/*int num1, num2;
		
		System.out.print("첫번째 정수 : ");
		num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("첫번째 정수가 두번째 정수보다 큽니다 : " + (num1 > num2));
		System.out.println("첫번째 정수는 짝수입니다 : " + (num1 % 2 == 0));
		*/
		
		/*int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a != b : " + (a != b));
		
		// 산술연산 + 비교연산
		System.out.println((a * 2) > ( b / 5));
		
		System.out.println("a가 짝수인가? : " + (a % 2 == 0));
		System.out.println("a가 홀수인가? : " + (a % 2 != 0));
		*/
	
	}

}
