package test.t240704;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int n1, n2;
		System.out.print("첫 번째 숫자 : ");
		n1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		n2 = sc.nextInt();
		
		if(n1 <= n2 || n1  >= n2) {
			for(i = n1; i <= n2; i++) {
				System.out.println(i);
			}
			for(j = n2; j <= n2; j++) {
				System.out.println(j);
			}
		} else if(n1 < 1){	
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else if(n2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		*/
		
		// 두 수 입력 / 작은수와 큰수 구분 / 작은수부터 큰수까지 출력
		
		int num1, num2, max, min;
		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();
	
		max = (num1 > num2) ? num1 : num2;
		min = (num1 < num2) ? num1 : num2;
		
		if(min < 1 || max < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}
		}	
	}
}
