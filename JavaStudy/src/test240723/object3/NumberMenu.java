package test240723.object3;

import java.util.Scanner;

import test240723.object2.CharCheckException;

public class NumberMenu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		// nc.checkDouble(num1, num2);
		
		try {
			boolean isDouble = nc.checkDouble(num1, num2);
			System.out.printf("%d 은(는) %d 의 배수인가 ? %b\n" ,num1,num2,isDouble);
		} catch (NumRangeException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
				/*
		try {
			nc.checkDouble(num1, num2);
			System.out.println(num1 + "은(는) " + num2 + "의 배수인가 ? " + true);
		} catch (NumRangeException e) {
			System.out.println("1부터 100 사이의 값이 아닙니다.");
			e.printStackTrace();
		}
		*/
	}

}
