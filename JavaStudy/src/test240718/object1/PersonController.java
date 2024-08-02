package test240718.object1;

import test240712.object1.Member;

public class PersonController {
	
	Person[] p = new Person[10]; //다형성
	
	//private Student[] s = new Student[3];
	//private Employee[] e = new Employee[10];
	
	// 학생객체 수를 countArr[0]에   
	// 근로자객체 수를 countArr[1]에 넣어서 반환
	
	public int[] personCount() {
		
		int[] countArr =new int[2];
		
		int studentCount = 0, employeeCount = 0;
			
		for(int i=0; i < p.length; i++) {
			if(p[i] == null) {
				break;
			} else if(p[i] instanceof Student) {
				studentCount++;
			} else if(p[i] instanceof Employee) {
				employeeCount++;
			}
		}	
		
		/*
		for(Person per : p) {
			if(per == null) {
				break;
			} else if(per instanceof Student) {
				studentCount++;
			} else if(per instanceof Employee)
				employeeCount++;
		}
		*/
		
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
	/*
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i=0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	*/
	
	
	//public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		/*
		for(int i=0; i < e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
		*/
		
	//}
	
	public void insertPerson(Person per) {
		for(int i=0; i < p.length; i++) {
			if(p[i] == null) {
				p[i] = per;
				return;
			}
		}
	}
	public Person[] printPerson() {
		return this.p;
	}
}
