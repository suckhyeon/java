package test240719.object1;

public abstract class Animal {
	
	private String name;
	private String kinds;

	protected Animal() {
		super();
	}
	//#은  protected 
	
	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}
	
	public String toString() {
		return "저의 이름은" + this.name + " 이고, 종류는 " + this.kinds + "입니다.";
	}
	
	public abstract void speak();
	
}
