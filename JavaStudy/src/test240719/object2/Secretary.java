package test240719.object2;

public class Secretary extends Employee implements Bonus {

	public Secretary() {
		super();
	}

	public Secretary(String name, int number, String department, int salay) {
		super(name, number, department, salay);
	}
	
	public double tax() {
	
		return this.getSalay() * 0.1 ;
	}
	
	public void incentive(int pay) {
		super.setSalay((int)(super.getSalay() * 1.8));
	}

	
}
