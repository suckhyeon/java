package test.t240704;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String ID = "myId";
		final String PWD = "myPassword12";
		
		String id;
		System.out.print("아이디 : ");
		id = sc.next();
		
		String pwd;
		System.out.print("비밀번호 : ");
		pwd = sc.next();
		
		
		if(id.equals(ID) && pwd.equals(PWD)) {
			System.out.println("로그인 성공");
		} else if(id.equals(ID) && pwd != PWD) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if(id != ID && pwd.equals(PWD)) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("잘못 입력");
		}
		
		
		// 문자열 비교는 항상 .equals() 사용
		
		/*
		if(ID.equals(id)) { // 아이디 일치
			if(PWD.equals(pwd)) { // 비번 일치
				System.out.println("로그인 성공");
			} else { // 비번 불일치
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else { // 아이디 불일치
			System.out.println("아이디가 틀렸습니다.");
		}
		*/
	}

}
