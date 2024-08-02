package test.t240704;

import java.util.Scanner;

public class T_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		if(num > 0) {
			arr[num] = i;
		}
		
		for(int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1 ;
		}
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	}

}
