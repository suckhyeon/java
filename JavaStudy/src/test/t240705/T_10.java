package test.t240705;

import java.util.Scanner;

public class T_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		while(true) {
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 :");
		char ch = sc.next().charAt(0);
		
		for(int i = 0; i < str.length(); i++) {
			str.length(i) = str;
		}
		
		System.out.println("포함된 개수 : "){
			
		}
		
		System.out.print("더 하시겠습니까? (y/n) : ");
		String answer = sc.next();
		
		switch(answer) {
		case "y" , "Y" :
			break;
		case "n" , "N" :
			break;
			default:{
				System.out.println("잘못된 대답입니다.");
				}
			}
		}
		*/
		
		while(true) {
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 :");
		char ch = sc.next().charAt(0);
		
		 // 전체를 탐색하며 입력받은 문자가 몇개 존재하는지 검사
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("포함된 개수 : " + count);
		
		// y/n 을 제대로 입력했는지 검사해서 아릴 시 다시 입력받는다.
		while(true) {
			System.out.println("더 하시겠습니까? (y/n) :");
			
			ch = sc.next().charAt(0);
			if(!(ch == 'n' || ch == 'N' || ch == 'y' || ch == 'Y')) {
				System.out.println("잘못입력했습니다. 다시 입력해주세요");
				}
			 else {
				break;
			 }
			}
		
		// n or N 을 입력햇다면 종료
		if(ch == 'n' || ch == 'N') {
			break;
		}
	}
}
}
