package test.t240704;

import java.util.Scanner;

public class T_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		final String G = "관리자";
		final String M = "회원";
		final String N = "비회원";
		
		String str1;
		System.out.print("권환을 확인하고자하는 회원 등급 : ");
		str1 = sc.next();
		
	
		if(G.equals(str1)) {
			System.out.println("회원관리 계시글관리 계시글작성 댓글장성 계시글조회");
		} else if(M.equals(str1)) {
			System.out.println("계시글작성 계시글 조회 댓글 작성");
		} else if(N.equals(str1)) {
			System.out.println("계시글 조회");
		}	
		 */
		
		/*
		System.out.print("권환을 확인하고자하는 회원 등급 : ");
		String role = sc.next();
		
		if(role.equals("관리자")) {
			System.out.println("회원관리 계시글관리 계시글작성 댓글장성 계시글조회");
		} else if(role.equals("회원")) {
			System.out.println("계시글작성 계시글 조회 댓글 작성");
		} else if(role.equals("비회원")) {
			System.out.println("계시글 조회");
		} else {
			System.out.println("잘못입력");
		}
		
		switch(role) {
		case "관리자" :
			System.out.println("회원관리 계시글관리 계시글작성 댓글장성 계시글조회");
			break;
		case "회원" :
			System.out.println("계시글작성 계시글 조회 댓글 작성");
			break;
		case "비회원" :
			System.out.println("계시글 조회");
			break;
			default :
				System.out.println("잘못입력");
		}	
		*/
		
		/*
		 * 
		 * 이렇게 해도 결과는 나온다.
		 * 
		String access = "" ;
		
		switch(role) {
		case "관리자" :
			access += "회원관리 계시글관리";
		case "회원" :
			access += "계시글작성 댓글 작성";
		case "비회원" :
			access += "계시글 조회";
			break;
			default :
				System.out.println("잘못입력");
		}	
		*/
	}
}
