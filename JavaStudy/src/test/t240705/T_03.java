package test.t240705;

import java.util.Scanner;

public class T_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("입력1 :");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 :");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 :");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num2 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		*/
		
		int[] arr = new int[3];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("입력%d :" , i + 1); //입력받는 곳
			arr[i] = sc.nextInt(); //입력을 위한 함수
		}
		
		if(arr[0] == arr[1] && arr[0] == arr[2]) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//System.out.println(arr[0] == arr[1] && arr[0] == arr[2]); //위의 축소버전
	}
}
