package test.t240705;

import java.util.Scanner;

public class T_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("중간 고사 점수 :");
		double mid = sc.nextInt();
		
		System.out.print("기말 고사 점수 :");
		double end = sc.nextInt();
		
		System.out.print("과제 점수 :");
		double sub = sc.nextInt();
		
		System.out.print("출석 회수 :" );
		double check = sc.nextInt();
		
		double mid1 = ((mid * 2) / 10);
		double end1 = ((end * 3) / 10);
		double sub1 = ((sub * 3) / 10);
		double check1 = ((check * 2) / 2);
		
		double sum = mid1 + end1 + sub1 + check1;
		
		System.out.println("========== 결과 ==========");
		
		System.out.printf("중간 고사 점수(20) : %.1f\n" , mid1);
		System.out.printf("기말 고사 점수(30) : %.1f\n" , end1);
		System.out.printf("과제 점수	(30) : %.1f\n" , sub1);
		System.out.printf("출석 점수	(20) : %.1f\n" , check1);
		System.out.printf("총점 : %.1f\n" , sum);
		
		if(sum >= 70) {
			System.out.println("Pass");
		} else if(sum < 70 && 20 >((check * 3) / 10)) {
			System.out.println("Fail");
		}
		*/
		
		double mid, finalScore, assignment, attendance;
		
		System.out.print("중간 고사 점수 :");
		mid = sc.nextDouble();
		mid *= 0.2;
		
		System.out.print("기말 고사 점수 :");
		finalScore = sc.nextDouble();
		finalScore *= 0.3;
		
		System.out.print("과제 점수 :");
		assignment = sc.nextDouble();
		assignment *= 0.3;
		
		System.out.print("출석 점수 :");
		attendance = sc.nextDouble();
	
		double total = mid + finalScore + assignment + attendance;
		
		System.out.println("========== 결과 ==========");
		System.out.println("중간 고사 점수(20) " + mid);
		System.out.println("기말 고사 점수(30) " + finalScore);
		System.out.println("과제 점수 \t(30) " + assignment);
		System.out.println("출석 점수 \t(20) " + attendance);
		System.out.println("총점 : " + total);
		
		if(total >= 70 && attendance >= (20 * 0.7)) {
			System.out.println("Pass");
		} else if(total < 70) {
			System.out.println("Fail [점수 미달]");
		} else {
			System.out.println("Fail [출석 미달]");
		}
	
		
	}
}
