package test.t240705;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("주민번호를 입력하세요(- 포함) : ");
		String num = sc.next();
		
		String arr = new String[num];
		
		for(int i = 0; i < arr.length(); i++) {
			arr[num] = i;
		}
		
		for(int i = 0; i < arr.length(); i++) {
			System.out.println(arr[num] + " ");
		}
		
		if(arr[7] == 2) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		*/
		
		System.out.print("주민번호를 입력하세요(- 포함) : "); //주민번호 입력 받기
		String str = sc.next(); //주민번호 입력하기 위한 스캐너 함수
		char gender = str.charAt(7);  //charAt()으로 그 해당하는 거 빼내기
		
		// switch case문 사용해서 풀기
		switch(gender){  // 인덱스 7번째 자리가 1 또는 3일 경우 
		case '1' :
		case '3' :
			System.out.println("남자");
			break;
		case '2' : // 인덱스 7번째 자리가 2 또는 4일 경우
		case '4' :
			System.out.println("여자");
			break;
			default:
				System.out.println("잘못 입력");
		}
		
	}
}
