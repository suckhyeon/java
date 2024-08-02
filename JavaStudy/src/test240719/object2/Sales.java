package test240719.object2;

public class Sales extends Employee implements Bonus{

	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salay) {
		super(name, number, department, salay);
	}
	
	public double tax() {
		return this.getSalay() * 0.13;
	}
	
	public void incentive(int pay) {
		super.setSalay((int)(super.getSalay() + (pay * 1.2)));
	}

}
