package test240715.object1;

public class Student {
	//팔드
	//접근제한자 자료형 변수이름;
	
	private String name;
	private int classRoom;
	private double javaScore;
	private double sqlScore;
	private double practiceScore;
	
	//생성자
	
	public Student() {
		super();
	}

	public Student(String name, int classRoom, double javaScore, double sqlScore, double practiceScore) {
		super();
		this.name = name;
		this.classRoom = classRoom;
		this.javaScore = javaScore;
		this.sqlScore = sqlScore;
		this.practiceScore = practiceScore;
	}

	//메소드
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public double getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(double javaScore) {
		this.javaScore = javaScore;
	}

	public double getSqlScore() {
		return sqlScore;
	}

	public void setSqlScore(double sqlScore) {
		this.sqlScore = sqlScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	public String toString() {
		return this.classRoom + "반" + this.name + "학생" + this.javaScore + "점" + this.sqlScore + "점" + this.practiceScore + "점";
	}
	
	public double getEvg() {
		double sum = this.javaScore + this.sqlScore + this.practiceScore;
		return sum/3;
	}
	
	public boolean isPassd() { 
		if(this.javaScore >= 50 && this.sqlScore >= 50
				&& this.practiceScore >= 50 && this.getEvg() >= 60) {
			return true;
		}
		
		return false;
	}
	
	public void reTest() { 
		// 0~100 은 Math.random() * 101
		this.setJavaScore(Math.random() * 101);
		this.setSqlScore(Math.random() *101);
		this.setPracticeScore(Math.random() * 101);
	}

}
