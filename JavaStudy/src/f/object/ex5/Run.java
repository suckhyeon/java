package f.object.ex5;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/*
		// cho객체 생성 조석현 25살 수학 80 영어 70 국어 80
		// kim 객체 생성 김용담 24살 수학 95 영어 50 국어 70
		
		Student cho = new Student("조석현", 25, 80, 70, 80);
		Student kim = new Student("김용담", 24, 95, 50, 70);
		
		// cho의 모든 과목의 평군을 출력
		System.out.println(cho.getName() + "님의 평균 : " + cho.getEvg());
		// kim의 모든 과목의 평균을 출력
		System.out.println(kim.getName() + "님의 평균 : " + kim.getEvg());
		*/
		
		// 사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아 평균을 구학고 출력하는 프로그램 작성
		//ex) 이름 : 조석현	 나이 : 25 수학 : 80 영어 : 70 국어 : 80 평균 : 76
	
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 :");
		int age = sc.nextInt();
		
		System.out.print("수학점수 :");
		int math = sc.nextInt();
		
		System.out.print("영어점수 :");
		int eng = sc.nextInt();
		
		System.out.print("국어점수 :");
		int kor = sc.nextInt();
		
		Student cho = new Student(name, age, math, eng, kor);
		cho.printEvg();
		
	}
}
