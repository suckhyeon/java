package test240802.object1;

public class Circle {
	public static final double PI = 3.14;
	private double radius;  // 5번째 줄 클래스 다이어그램에서는 -라서 private로 정보은닉 해야한다.
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}
	
	public void draw() {
		System.out.println("반지름 " + radius + "cm인 원을 그립니다.");
	}
}
