package test.t240704;

import java.util.Scanner;

public class T_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 12345678910
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1 ;
		}
		
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
		}
	
		
		/* 10987654321
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		/*
		int[] arr = new int[10];
		
		for(int i = arr.length - 1; i >= 0; i--) {
			arr[i] = i + 1;
		}
		
		for(int i = arr.length - 1; i >= 0; i--) {
		System.out.print(arr[i] + " ");
		}
		*/
		
	}
}
