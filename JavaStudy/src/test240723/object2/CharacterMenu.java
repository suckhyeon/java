package test240723.object2;

import java.util.Scanner;

public class CharacterMenu{
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		CharacterController cc = new CharacterController();
		
		try {
		int length = cc.countAlpha(str); // 리턴된 카운트 값을 인트로 받아주기 위한 변수
		System.out.println("\'" + str + "\'에 포함된 영문자 개수 : " + length);
		} catch(CharCheckException e) {
			System.out.println("문자열에 공백이 포함되어있습니다.");
			e.printStackTrace();
		} finally {
			sc.close();
			System.out.println("잘 종료되었습니다.");
		}
	}
}
