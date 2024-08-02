package test240711.object1;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		// 정수 n(2~9)를 입력받아 2부터 n 까지 중 짝수의 구구단을 출력하는 코드를 작성
		// 만약 2~9사이의 값을 입력하지 않는다면 다시 입력하세요를 번복한다.
		
		Scanner sc = new Scanner(System.in);
		
		/*
		while(true) {
		System.out.print("정수 n을 입력하세요 : ");
		int n = sc.nextInt();
		
		if(2 <= n && n <= 9) {
			for(int j=2; j<=n; j++) {
				for(int i=1; i <=9; i++) {
					if(j % 2 == 0 && i % 2 == 0) {
						System.out.println(j + " * " + i + " = " + (j * i));
					}
				}
			}
		}else {
			System.out.println("다시 입력하세요");
			}
		}
		*/
		
		/*
		int n;
		System.out.print("정수 입력 :");
		while(true) {
			n = sc.nextInt();
			
			if(!(n >= 2 && n <= 9)) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			for(int i=2; i<n; i++) {
				if(i % 2 == 0) {
					for(int j=1; j<10; j++) {
						System.out.println(i + " * " + j + " = " + (i*j));
					}
				}
			}	
			break;
			}	
			*/
		
		
		}
	}
	

