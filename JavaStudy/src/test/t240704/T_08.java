package test.t240704;

import java.util.Scanner;

public class T_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] arr = new String[일, 월, 화, 수, 목, 금, 토];
		for(int i=0; i < arr.length; i++) {
			arr[i] = i;
		
		System.out.println(arr);
		
		if(0 <= num <= 6) {
			arr
		}
		for(int i = 0; i <= 6; i++) {
			arr[i] = arr;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		*/
		
		String[] strArr = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.print("0 ~ 6 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(0 <= num && num <= 6) {
			System.out.println(strArr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
