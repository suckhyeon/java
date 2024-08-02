package f.object.ex4;

public class Run {
	public static void main(String[] args) {
		Member tjrgus = new Member();
		tjrgus.changeName("조석현");
		tjrgus.printName();
		
		
		//아이디 비번 이름을 초기화하는 생성자를 통해
		//객체를 하나 생성하고 printName()을 통해 이름을 출력해라
		
		Member suckhyeon = new Member("whtjrgus", "1q2w3e4r", "석현");
		suckhyeon.printName();
	}
}
