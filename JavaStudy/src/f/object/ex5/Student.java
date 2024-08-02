package f.object.ex5;

//이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고있는 개체를 만들어라
// 데이터는 직접 접근을 허용하지않고 모두 간접적으로 set/get/을 해줄수 잇도록 작성해라
//모든 데이터를 매개변수로 받아 초기화 하면서 객체를 생성할 수 있는 생성자를 작성
public class Student {
	//필드영역(데이터)
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;
	
	//생성자영역  alt + shift + s -> o
	public Student() {}
	
	/*
	public Student(String name, int age, int math, int eng, int kor) {
		this.name = name;
		this.age= age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	*/
	
	/*
	public String toSTring() {
		return "이름 : " + this.name + "\n나이 :" + this.age + "\n수학점수 : " + this.math + "\n영어점수 :" + this.eng + "\n국어점수 :" + this.kor;
	}
	*/
	
	
	//메소드영역 게터세터  alt + shift + s -> r
	public Student(String name, int age, int math, int eng, int kor) {
		this.name = name;
		this.age = age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setAge(int age) {
		if(age < 1) {
			this.age = 1;
			return;
		}
		this.age = age;
	}
	
	public void setMath(int math) {
		if(math < 0) {
			this.math = 0;
			return;
		}
		this.math = math;
	}
	
	public void setEng(int eng) {
		if(eng < 0) {
			this.eng = 0;
			return;
		}
		this.eng = eng;
	}
	
	public void setKor(int kor) {
		if(kor < 1) {
			this.kor = 0;
			return;
		}
		this.kor = kor;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public double getEvg() {
		double evg = (this.math + this.eng + this.kor) / 3.0;
		return evg;
	}
	
	public void printEvg() {
		System.out.println(this.getName() + "님의 평균 : " + this.getEvg());
	}
}
