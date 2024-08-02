package i.polymorphism.ex2;

public class Avante extends Car{
	
	public Avante(String color, String fuel, int year) {
		super(color, fuel, year);
	}
	
	@Override
	public void drive() {
		System.out.println("슈웅~슈웅");
	}

	public void moveAvante() {
		System.out.println("아반떼 이동");
	}

}
