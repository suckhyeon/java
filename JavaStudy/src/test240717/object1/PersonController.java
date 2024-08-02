package test240717.object1;

import test240712.object1.Member;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		
		int[] countArr = new int[2];
		
		int studentCount = 0, employeeCount = 0;
		
		for(int i=0; i < s.length; i++) {
			if(s[i] == null) {
				break;
			} 
			studentCount++;
		}
			
		for(Employee emp : e) {
			if(emp == null) {
				break;
			} 
			employeeCount++;
		}
		countArr[0] = studentCount;
		countArr[1] = employeeCount;
		
		return countArr;
	}
		/*
		int count = 0;
		
		for(int  i=0; i < s.length; i++) {
			if(s[i] != null) {
				count++;
			} else {
				break;
			}
		}
		
		for(int i=0; i < e.length; i++) {
			if(e[i] != null) {
				count++;
			} else {
				break;
			}
		}
		return count;
		 */
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i=0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	
	public Student[] printStudent() {
			return this.s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0; i < e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
		
	}
	
	public Employee[] printEmployee() {
		return e;
	}

}
