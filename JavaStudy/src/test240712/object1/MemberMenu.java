package test240712.object1;

import java.util.Scanner;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	
	private MemberController mc = new MemberController();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		
		int choice = 0;
		
		while(choice != 9) {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");
			if(mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록 : ");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색 ");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			
			choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				this.insertMember();
				break;
			case 2 :
				this.searchMember();
				break;
			case 3 :
				this.updateMember();
				break;
			case 4 :
				this.deleteMember();
				break;
			case 5 :
				this.printAll();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		
		/*
		while(true) {
			if(mc.existMemberNum() > 10) {
				System.out.println("2. 회원 검색 : ");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.println("메뉴 번호 :");
				int num = sc.nextInt();
				} else if(mc.existMemberNum() < 10){ 
					System.out.println("1. 새 회원 등록 : ");
					System.out.println("2. 회원 검색 : ");
					System.out.println("3. 회원 정보 수정");
					System.out.println("4. 회원 삭제");
					System.out.println("5. 모두 출력");
					System.out.println("9. 끝내기");
					System.out.println("메뉴 번호 :");
					int num = sc.nextInt();
				} else if(num == 9) {
					System.out.println("프로그램을 종료합니다.");	
				}
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				
		}
		*/
	}
	
	public void insertMember() {
		
		String id, pwd, name, email;
		String gender;
		int age;
		
		System.out.println("새 회원을 등록합니다.");
		
		while(true) {
		System.out.print("아이디 : ");
		id = sc.next();
		if(mc.checkId(id)) { //사용가능
			break;
		} else { //사용불가
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		}
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("비밀번호 : ");
		pwd = sc.next();
		System.out.print("이메일 : ");
		email = sc.next();
		
		while(true) {
		System.out.print("성별(M/F) : ");
		gender = sc.next();
		if(gender.equals("m") || gender.equals("M") || gender.equals("f") || gender.equals("F")) {
			break;
			} else {
				System.out.println("성별을 다시 입력하세요.");
			}
		}
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.println("회원 정보가 입력되었습니다.");
		
		mc.insertMember(id, name, pwd, email, gender, age);
		
		/*
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		if(mc.checkId()).equals(id)) {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		System.out.print("비밀번호 입력 :");
		String password = sc.next();
		
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		if(!(gender == 'm' && gender == 'M' && gender == 'f' && gender == 'F')) {
			System.out.println("성별을 다시 입력하세요.");
		}
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		return mc.insertMember(id, name, password, email, email, age);
		*/
	}
	
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.println("메뉴 번호 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1 :
			this.searchId();
			break;
		case 2 :
			this.searchName();
			break;
		case 3 :
			this.searchEmail();
			break;
		case 9 :
			System.out.println("메인으로 돌아갑니다.");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void searchId() {
		String id;
		
		System.out.print("검색할 아이디 : ");
		id = sc.next();
		
		String memberInfo = mc.searchId(id);
		if(memberInfo == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			System.out.println(memberInfo);
		}
		
		/*
		System.out.println("검색할 아이디 :");
		String id = sc.next();
		if(!(mc.searchId(id).equals(id))) {
			System.out.println("검색 결과가 없습니다.");
			
		} else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(mc.Member);
		}
		*/
	}
	
	public void searchName() {
		String name;
		
		System.out.print("검색할 이름 : ");
		name = sc.next();
		
		Member[] mArr = mc.searchName(name);
		if(mArr[0] == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(int i=0; i<mArr.length; i++) {
				if(mArr[i] == null) {
					break;
				}
				String info = mArr[i].inform();
				System.out.println(info);
			}
		}
	}
	
	public void searchEmail() {
		String email;
		
		System.out.println("검색할 이메일 : ");
		email = sc.next();
		
		Member[] mArr = mc.searchEmail(email);
		if(mArr[0] == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(int i = 0; i < mArr.length; i++) {
				if(mArr[i] == null) {
					break;
				}
				String info = mArr[i].inform();
				System.out.println(info);
			}
		}
	}
	
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1 :
			this.updatePassword();
			break;
		case 2 :
			this.updateName();
			break;
		case 3 :
			this.updateEmail();
			break;
		case 9 :
			System.out.println("메인으로 돌아갑니다.");
			break;
		default :	
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void updatePassword() {
		String id, pwd;
		
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.next();
		
		System.out.print("수정할 비밀번호 : ");
		pwd = sc.next();
		
		if(mc.updatePassword(id, pwd)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
	
	public void updateName() {
		String id, name;
	
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.next();
		
		System.out.print("수정할 이름 : ");
		name = sc.next();
		
		if(mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
	
	public void updateEmail() {
		String id, email;
		
		System.out.print("수정할 회원의 아이디 : ");
		id = sc.next();
		
		System.out.print("수정할 이메일 : ");
		email = sc.next();
		
		if(mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			this.deleteOne();
			break;
		case 2 :
			this.delete();
			break;
		case 9 :
			System.out.println("메인으로 돌아갑니다.");
			break;
		default :
			System.out.println("잘못 입력하셧습니다.");
		}
		
	}
	
	public void deleteOne() {
		
		System.out.print("삭제할 회원 ID : ");
		String id = sc.next();
		
		System.out.println("정말 삭제할 것인가요? (y/n)");
		char ch = sc.next().charAt(0);
		if(ch == 'y' || ch == 'Y') {
			if(mc.delete(id)) {
			System.out.println("성공적으로 삭제하였습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
		
		
		/*
		System.out.println("삭제할 회원 id입력 : ");
		String id = sc.next();
		
		System.out.println("정말 삭제하시겠습니까? (y/n)");
		char ch = sc.next().charAt(0);
		
		if(ch == 'Y' && ch == 'y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		*/
		
	}
	
	public void delete() {
		System.out.println("정말 삭제할 것인가요? (y/n)");
		char ch = sc.next().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
		
	}
	
	public void printAll() {
	
		if(mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			Member[] mArr = mc.printAll() ;
			for(int i=0; i<mArr.length; i++) {
				if(mArr[i] == null) {
					break;
				}
				String info = mArr[i].inform();
				System.out.println(info);
			}
		}
		
	}
}


