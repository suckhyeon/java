package test240719.object2;

public abstract class Employee {
	
	private String name;
	private int num;
	private String department;
	private int salay;
	
	public Employee() {
		super();
	}

	public abstract double tax();
	public Employee(String name, int num, String department, int salay) {
		super();
		this.name = name;
		this.num = num;
		this.department = department;
		this.salay = salay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalay() {
		return salay;
	}

	public void setSalay(int salay) {
		this.salay = salay;
	}

}
