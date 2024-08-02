package test240723.object4;

import java.util.Scanner;

public class CharacterMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 :");
		String str = sc.nextLine();
		
		CharacterController cc = new CharacterController();
		
		try {
			int length = cc.countAlpha(str);
			System.out.println("\'" + str + "\'에 포함된 영문자 개수 : " + length);
		} catch (CharCheckException e) {
			System.out.println("문자열에 공백이 포함");
			e.printStackTrace();
		}
		
	}

}
