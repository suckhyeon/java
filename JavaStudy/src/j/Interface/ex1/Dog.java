package j.Interface.ex1;

public class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("촐랑촐랑 뛰어다닌다.");
		
	}

	@Override
	public void eat() {
		System.out.println("촴촴촴 먹는다.");
		
	}

	@Override
	public void maskSound() {
		System.out.println("멍멍 ~ 왈왈");
		
	}
}
