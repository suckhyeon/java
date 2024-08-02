package test240723.object2;

public class CharacterController {

	public CharacterController() {
		super();
	}
	
	public int countAlpha(String s) throws CharCheckException{
		int count = 0;
		
		for(int i=0; i< s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ') { // ' ' 문자 공백
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			} else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) { // 문자를 인트형으로 바꿔 숫자로 계산해서 값이 크고 작은지 확인
				count++;
			}
		}
		return count;
	}
}
