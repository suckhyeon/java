package test240723.object5;

import java.util.Scanner;

public class NumberMenu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		
		try {
			boolean result = nc.chackDouble(num1, num2);
			System.out.printf("%d 은(는) %d 의 배수인가 ? %b" ,num1,num2,result);
		} catch (NumRangeException e) {
			System.out.println("오류 발견");
			e.printStackTrace();
		}
	}

}
