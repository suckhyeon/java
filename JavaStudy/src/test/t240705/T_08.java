package test.t240705;

import java.util.Scanner;

public class T_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		final str1 = exit;
		
		while(true) {
		System.out.print("연산자(+, -, *, /, %) : ");
		String str = sc.next();
		
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		String total = (num1 + str + num2);
		
		System.out.println(num1 + str + num2 + " = " + total);
		

		if(str.equals(%) && num2 < 1){
			System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
		} else if() {
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");
		} else if(str.equals(exit)) {
			System.out.println("프로그램을 종료합니다.");
		}
		break;
		}
		*/
		
		String operator;
		
		while(true) {
		System.out.print("연산자(+, -, *, /, %) : ");
		operator = sc.next();
		
		if(operator.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		switch(operator.charAt(0)) {
		case '+' :
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-' :
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*' :
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/' :
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				break;
			}
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		case '%' :
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
			break;
		default :
			System.out.println("없는 연산자입니다. 다시 입력해주세요.");

			}
		}	
	}
}
