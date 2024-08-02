package test.t240705;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("첫 번째 숫자 :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 :");
		int num2 = sc.nextInt();
		
		int min, max;
		
		max = (num1 > num2) ? num1 : num2;
		min = (num1 < num2) ? num1 : num2;
		
		 if(num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else if(num1 > 1 || num2 > 1){
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}
			}
			*/
		int min, max;
		
		while(true) {
			System.out.print("첫 번째 숫자 :");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 :");
			int num2 = sc.nextInt();
			
			max = (num1 > num2) ? num1 : num2;
			min = (num1 < num2) ? num1 : num2;
			
			 if(num1 < 1 || num2 < 1) {
					System.out.println("1 이상의 숫자를 입력해주세요.");
				} else {
					for(int i = min; i <= max; i++) {
						System.out.print(i + " ");
					}
					break;
				}
			}
		}
}

