package test240723.object1;

public abstract class Plane {
	
	private String planeName;
	private int fielSize;
	
	public Plane() {
		super();
	}

	public Plane(String planeName, int fielSize) {
		super();
		this.planeName = planeName;
		this.fielSize = fielSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFielSize() {
		return fielSize;
	}

	public void setFielSize(int fielSize) {
		this.fielSize = fielSize;
	}
	
	public abstract void refuel(int fuel) ;
	
	public abstract void flight(int distance);

}
