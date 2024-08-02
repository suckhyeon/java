package test.t240709.object2;

public class Run {
	public static void main(String[] args) {
		
		Student stu1 = new Student(3, 6, "조석현", 63.5, '남');
		Student stu2 = new Student(3, 6, "김용담", 69.3, '여');
		
		stu1.information();
		stu2.information();
		
	}

}

