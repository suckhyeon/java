package j.Interface.ex1;

public interface Animal {

	/*
	 *  static 변수
	 *  추상메소드 : 미완성 메소드로 구현부({})가 없는 메소드다.
	 *  abstract 추상키워드를 붙어서 생성
	 */
	
	//public abstract void move();
	//void move(); 위와 동일하다
	//public void move(); 3개 다 동일
	
	public abstract void move();
	public abstract void eat();
	public abstract void maskSound();
}
