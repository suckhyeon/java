package test.T240703;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int n;
		
		for(int i = 1; i < n; i++) {
			if(n >= 1) {
				System.out.println("1이상의 숫자를 입력하세요 : ");
				n = sc.nextInt();
				System.out.println(n);
			} else if(n < 0) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		*/
		
		while(true) {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) { //정상출력
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		break;
			} else {
				System.out.println("1 이상의 숫자를 입력하세요");
			}
		}
	}
}
	
		


