package test240712.object1;

public class MemberController {
	private Member[] m = new Member[SIZE];
	
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		for(int i=0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}
	
	// inputid를 넘겨받아서 사용중 여부를 체크하고 중복된 id일 경우 사용불가 -> return false;
	// 중복되지 않은 id일 경우 -> return true;
	public boolean checkId(String inputId) {
		
		for(int i=0; i < m.length; i++) {
			if(m[i] == null) {
				return true;
			}
			String userId = m[i].getId();
				if(userId.equals(inputId)) { //중복id찾음
					return false; //사용불가
			} 
		}
		
		return true;
		//return true; //사용가능
		
	}
	
	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		for(int i=0; i < m.length; i++) {
			if(m[i] == null) { //이 부분이 빔
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	
	public String searchMember() {
		return null;
	}
	
	public String searchId(String id) {
		for(int i=0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				return m[i].inform();
			}
		}
		return null;
		
		/*
		for(int i=0; i < m.length; i++) {
			if(m[i].equals(id)) {
				if(id.equals(id)) {
					System.out.println("찾으신 회원의 조회 결과입니다.");
				} else {
					System.out.println("검색 결과가 없습니다.");
				}
				
			}
		}
		*/
		
	}
	
	public Member[] searchName(String name) {
		Member[] mArr = new Member[this.SIZE]; //이름이 동일한 걸 담을 배열
		
		int count = 0;
		for(int i=0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				mArr[count++] = m[i];
			}
		}
		return null;
		
	}
	
	public Member[] searchEmail(String email) {
		Member[] mArr = new Member[this.SIZE]; //이름이 동일한 걸 담을 배열
		
		int count = 0;
		for(int i=0; i < m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {
				mArr[count++] = m[i];
			}
		}
		return null;
	}
	
	public void updateMember() {
		
	}
	
	//성공적으로 비밀번호 변경 시 return true
	//비밀번호 변경 실패 시 return false
	public boolean updatePassword(String id, String password) {
		for(int i=0; i < m.length; i++) {
			//배열 m의 i번째 인덱스가 null이 아니고 id가 사용자가 입력한 id와 동일할 때
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		//배열의 모든 index에 담긴 member를 확인하였지만 id가 같은 member를 찾지 못함
		return false;
	}

	public boolean updateName(String id, String name) {
		for(int i=0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateEmail(String id, String email) {
		for(int i=0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}
	
	//true -> 정상적으로 삭제됨
	//false -> id를 찾지 못함
	public boolean delete(String id) {
		for(int i=0; i < m.length; i++) {
			if(m[i] == null) {
				return false;
			} else if(m[i].getId().equals(id)) { //찾음
				for(int j=i; j < (m.length -1); j++) {
					m[j] = m[j+1];
				}
				m[m.length - 1] = null;
				return true;
			}
		}
		
		return false;
	}
	
	public void delete() {
		this.m = new Member[this.SIZE];
	}
	
	public Member[] printAll() {
		return this.m;
	}
	
}
