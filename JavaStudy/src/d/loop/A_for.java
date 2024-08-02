package d.loop;

import java.util.Scanner;

public class A_for {
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나, 어떤 실행코드를 반복적으로 수행시켜준다.
	 * 
	 * 크게 두 종류라 나뉨(for / while(do-while));
	 * 
	 * <for문>
	 * for(초기식; 조건식; 증감식){  //반복횟수를 지정하기 위해서 제시하는 것들  갯수 정해지면 
	 * 		반복적으로 실행시키고자하는 코드더미
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 처음에 단 한번만 실행하는 구문
	 * 			(반복문 안에서 사용 될 변수를 선언 및 초기화하는 작업)
	 * 
	 * - 조건식 : 반복문이 수행될 조건을 작성하는 구문
	 * 			(조건식이 true일 경우 해당 반복을 실행하고 조건익이 false가 되는 순간 반복문을 탈출)
	 * 			(초기식에서 제시된 변수를 가지고 조건식을 정한다.)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감을 시킨다.)
	 * tip => for문 안에 초기식, 조건식, 증감식 각각 생략 가능하다(단, 생략해서 쓰는 경우가 없다 -> while문 사용이 효과적)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//10번 반복하는 반복문
		//for(int i=0; i < 10; i++) {
			//System.out.println("안녕하세요");''
		//}
		
		// i = 0 < 10 -> true -> System.out.println("안녕하세요");
		// i = 1~9 < 10 -> true -> System.out.println("안녕하세요");
		// i = 10 < 10 -> false -> 반복문 탈출
		
		//for(int i=0; i < 10; i++) {
			//System.out.println("안녕하세요");
		//}
	
		/*
		 * 1~5까지 순차적으로 출력하세요(1 2 3 4 5)
		 */
		
		/*
	 	for(int i=1; i <=5; i++) {
			System.out.println(i);
		}
		*/
	
		/*
		 * 5~1까지 순차적으로 출력하세요(5 4 3 2 1)
		 */
		
		/*for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
		*/
		
		/*
		 * 정수 n을 입력받아 1부터 n까지 1씩 증가시키면서 출력해라.
		 * 정수입력 : 6
		 * 1 2 3 4 5 6  		 
		 */
		
		/*int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		*/
		
		/*
		 * 1~10 숫자 중 홀수만 출력 1 3 5 7 9
		 */
		
		/*for(int i = 1; i <=10; i++) {
			if(i % 2 ==1) {
			System.out.println(i);
		}
	}
		*/
		
		/*
		 * 1부터 100까지의 총 합을 구해라
		 */
		
		/*
		int sum = 0;
		
		
		for(int i = 1; i <= 100; i++) {
			sum += i;		
		}
		
		System.out.println("1~100까지의 합 : " + sum);
		 */
		
		/*
		 * 정수n을 입력받아 1부터 n까지의 1씩 증가하며 모든 수를 출력해라
		 * 
		 * 정수입력 : 5
		 * 1부터 5까지의 합 : 15
		 */
		/*
		int num;
		int sum = 0;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++ ) {
			sum += i;
		}
		
		System.out.println("1부터 num까지의 합 : " + sum);
		*/
		
		/*
		 * Math.random(); => 호출시 -> 0.0 ~ 0.999999999999999999사이의 랜덤값을 반환
		 * 													0 <= ~ < 1.0
		 * java.lang.Math 클래스에서 제공하는 random()메소드 호출하면 매번 다른 랜덤값을 받을 수 있다. 
		 * 
		 * int num = Math.random(); // double형이라서 int로 랜덤값을 받을 수 없다.
		 * int num = (int)(Math.random() * 10); -> 0 ~ 9사이의 랜덤값을 반환
		 * int num = (int)(Math.random() * 10) + 1; -> 1~10사이의 랜던값을 반환
		 * int num = (int)(Math.random() * 랜덤으로 가져오고싶은 숫자) + 시작하고싶은 숫자;
		 * int num = (int)(Math.random() * (최대값(최대값은 포함 안됨) - 최소값) + 최소값
		 * int num = (int)(Math.random() * ((최대값 +1) - 최소값)) + 최소값
		 */
		
		/*int num = Math.random();
		System.out.println(Math.random());
		*/
		
		/*
		 * random(1~10)한 숫자 n을 생성해서 1부터 n까지 모두 더한 값을 출력하세요
		 * 
		 * random 수 : @
		 * 1~@까지의 합 : @
		 */
	
		/*
		int n;
		int sum = 0;
		n = (int)(Math.random() * 10) + 1;
		
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합 : " + sum);
		*/
		
		/*
		 * random(5~50)한 숫자 n을 생성해서 1부터 n까지의 숫자중 짝수만 출력해라 (50포함)
		 * random 수 : 10
		 * 2 4 6 8 
		 */
		
		/*
		int n;
		int sum = 0;
		n = (int)(Math.random() * 46) + 5;
	
		if(n % 2 == 0)
		{
		for(int i = 0; i <= n; i++) {
			sum += i;
			}
		}
		System.out.println("5부터" + n + "까지의 합 : " + sum);
		*/
		
		/*
		int n;
		
		n = (int)(Math.random() * 46) + 5;
		
		System.out.println("random 수 : " + n);
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
			System.out.print(i + " ");
			}
		}
		*/
		
		/*
		 * 각 인덱스별 문자 출력
		 * H -> str.charAt(0);
		 * e -> str.charAt(1);
		 * l -> str.charAt(2);
		 * l -> str.charAt(3);
		 * o -> str.charAt(4);
		 * 
		 * 문자열,length() : 문자열의 길이를 구하는 방법
		 */
		
		/*String str = "Hello";
		System.out.println(str.length());
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		*/
		
		/*
		 * 사용자에게 문자열을 입력받아 해당 문자열의 짝수자리 글자만 출력
		 * 문자열 입력 : hello
		 * el 출력
		 */
		
		/*
		String str;
		System.out.println("문자열 입력 : ");
		str = sc.next();
		
		System.out.println(str.length()); 
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		*/
		
		/*
		String str;
		System.out.print("문자열 입력 : ");
		str = sc.next();
		
		// 각 인덱스별 문자를 뽑아서 출력
		// "hi" -> 2 0,1이 나옴
		// apple 길이 : 5
		// apple -> index => 01234
		// strawberry 길이 : 10
		// index => 0123456789  짝수 뽑으려면 인덱스는 홀수
		
		for(int i = 0; i < str.length(); i++){
			if(i % 2 == 1) {
			System.out.println(str.charAt(i));
			}
		}
		*/
		
		/*
		 * 구구단 2단을 출력해보기
		 * 2 * 1 = 2
		 * 2 * 9 = 18
		 */
	
		/*
		int n = 2;
		int gob ;
		for(i = 1; i <= 9; i++) {
			gob = n * i;
		}
		System.out.println("n * i =  " + gob);
		*/
		
		/*
		int dan = 2;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		*/
		
		/*
		 * 2~9단 짜보기
		 */

		/*
		for(int dan1 = 2; dan1 <= 9; dan1++) {
				for(int i = 1; i <= 9; i++) {
			System.out.println(dan1 + " * " + i + " = " + (dan1 * i));
				}
		}
		*/
		
		/*
		int n;
		//int dan =2;
		System.out.print("원하는 단의 구구단 :");
		n = sc.nextInt();
			for(int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
			
		}
		*/
		
		/*
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * ...
		 * 2 * 9 = 18
		 * 
		 * 3 * 1 = 3
		 * ...
		 * 3 * 9 = 27
		 */
		
		for(int j = 2; j <= 9; j++) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(j + " * " + i + " = " + (j * i));
			}
			System.out.println(" ");
		}
		
		
		
		sc.close();
 	}

}
