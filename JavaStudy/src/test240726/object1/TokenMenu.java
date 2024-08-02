package test240726.object1;

import java.util.Scanner;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 :
				this.tokenMenu();
				break;
			case 2 :
				this.inputMenu();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void tokenMenu() {
		String str = " J a v a P r o g r a m";
		
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String newStr = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + newStr);
		System.out.println("토큰 처리 후 개수 : " + newStr.length());
		System.out.println("모두 대문자로 변환 : " + newStr.toUpperCase());
		System.out.println();
	}
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		String firstr = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " + firstr);
		
		System.out.print("찾을 문자를 하나 입력하세요 : ");
		char target = sc.next().charAt(0);
		int count = tc.findChar(str,target);
		System.out.println(target + " 문자가 들어간 갯수 : " + count);
		System.out.println();
	}
}
