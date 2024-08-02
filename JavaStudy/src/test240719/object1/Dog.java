package test240719.object1;

public class Dog extends Animal{

	private int weight;
	
	public static final String PLACE = "애견카페";

	public Dog() {
		super();
	}

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static String getPlace() {
		return PLACE;
	}

	public void speak() {	
		String info = super.toString() + "몸무게는 " + this.weight + "kg 입니다.";
		System.out.println(info);
	}
	
}
