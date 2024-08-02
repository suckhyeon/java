package test.t240705;

import java.util.Scanner;

public class T_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(num / 2 == 1) {
				System.out.println("박");
			}else if(num / 2 == 0) {
				System.out.println("수");
			}else if(num < 1) {
				System.out.println("양수가 아닙니다.");
			}
			System.out.print(i + " ");
		}	
		*/
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("시스템 종료");
				break;
			}
			
			if(num > 0) {
				for(int i = 1; i <= num; i++) {
					System.out.print(i % 2 == 0 ? "수" : "박");
				}
			} else {
				System.out.println("양수가 아닙니다.");
			}
		System.out.println();
	}
}
}
