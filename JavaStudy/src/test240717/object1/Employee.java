package test240717.object1;

public class Employee extends Person {

	private int Salary;
	private String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		Salary = salary;
		this.dept = dept;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString() + " 급여 : " + this.Salary + " 부서 : " + this.dept;
	}	
}
