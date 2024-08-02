package test.t240704;

import java.util.Scanner;

public class T_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("문자열 :");
		String str = sc.next();
		
		System.out.println("문자 : ");
		Char ch = sc.next().charAt(0);
		
		String[] arr = new String[str];
		
		for(int i = 0; i < arr.length; i++) {
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[str] + "에" + ch + "가 존재하는 위치(인덱스) : " + );
		}
		System.out.println(ch + "개수 : " + );
		*/
		
		System.out.print("문자열 :");
		String str = sc.next(); 
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		char[] chArr = new char[str.length()];
		for(int i=0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		System.out.print(str + "에" + ch + "가 존재하는 위치(인덱스) : ");
		
		
		int count = 0;
		
		for(int i = 0; i < chArr.length; i++) {
			if (chArr[i] == ch) {  //문자열에서 가져온 n번째 문자와 입력받은 문자 비교
				System.out.print(i + " ");
				count++; //똑같은 문자를 찾았을 때 카운팅
			}
		}
		System.out.println();
		System.out.println(ch + "개수 : " + count);
	}
	
}

