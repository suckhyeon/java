package test240730.object1;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 :
				this.joinMembership();
				break;
			case 2 :
				this.logIn();
				this.memberMenu();
				break;
			case 3 :
				this.sameName();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void memberMenu() {
		System.out.println();
		System.out.println("******* 회원 메뉴 *******");
		while(true) {
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : 
				this.changePassword();
				break;
			case 2 :
				this.changeName();
				break;
			case 3 :
				System.out.println("로그아웃 되었습니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void joinMembership() { // Member 클래스에 member가 name password로 저장되어잇다.
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		
		Member m = new Member(name, password);
		
		if(mc.joinMembership(id, m)) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}
	
	public void logIn() { //환영 후 리턴으로 반복문 탈출
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		
		String name = mc.logIn(id, password);
		if(name != null) {
			System.out.println(name + "님 환영합니다!");
			return;
		} else {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
		}
	}
	
	public void changePassword() { // 바로 if문으로 덮어씌우기
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("현재 비밀번호 입력 : ");
		String password = sc.nextLine();
		
		System.out.print("새로운 비밀번호 : ");
		String newPwd = sc.nextLine();
		
		if(mc.changePassword(id, password, newPwd)) {
			System.out.println("비밀번호 변경에 성공했습니다.");
		} else {
			System.out.println("비밀번호 변경에 실패했습니다.");
		}
	}
	
	public void changeName() { // 위에서id를 찾았기때문에 아래에서 id는 값이 있다.
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		
		String name = mc.logIn(id, password);
		if(name != null) {
			System.out.println("현재 설정된 이름 : " + name);
			
			System.out.println("변경할 이름 : ");
			String newName = sc.nextLine();
			
			mc.changeName(id, newName);
			System.out.println("이름 변경에 성공하였습니다.");
			System.out.println("변경된 이름 : " + newName);
		} else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
		}
	}
	
	public void sameName() { // isEmpty 비어잇나? entrySet 키 벨류를 다 가지고있는 엔트리 타입을 가진 셋
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		
		TreeMap result = mc.sameName(name);
		if(result.isEmpty()) {
			System.out.println("회원을 찾지 못하였습니다.");
		} else {
			for(Object entry : result.entrySet()) {
				Entry<String, String> en = (Entry)entry;
				System.out.println(en.getKey() + " : " + en.getValue());
			}
		}
	}

}
