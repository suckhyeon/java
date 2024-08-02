package test.T240703;

import java.util.Scanner;

public class T_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int g, e, m;
		System.out.println("국어 점수 : ");
		System.out.println("영어 점수 : ");
		System.out.println("수학 점수 : ");
		
		g = sc.nextInt();
		e = sc.nextInt();
		m = sc.nextInt();

		int sum = 0;
		int gob = 0;
		
		sum = g+e+m;
		
		gob = sum / 3;
		
		if(40 < g) if(40 < e) if(40 < m)
		if(40 < g && gob <= 60) {
			System.out.println("국어 : " + g + "영어 : " + e + "수학 : " + m + "합계 : " + sum + "평군 : " + gob + "축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
		*/
		
		int koScore, mathScore, enScore;
		System.out.print("국어점수 : ");
		koScore = sc.nextInt();
		
		System.out.print("수학점수 : ");
		mathScore = sc.nextInt();
		
		System.out.print("영어점수 : ");
		enScore = sc.nextInt();
		
		int sum = koScore + mathScore + enScore;
		// 정수, 정수 연산일 경우 결과는 정수가 된다(int)
		// 둘중 하나를 실수로 변경해주면 연산시 자동형변환에 의해서 실수값의 결과가 나온다.
		float evg = sum / 3.0f;
		
		if(koScore >= 40 && mathScore >= 40 && enScore >= 40 && evg >= 60) {
			System.out.println("국어 : " + koScore);
			System.out.println("수학 : " + mathScore);
			System.out.println("영어 : " + enScore);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + evg);
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}	
	}

}
