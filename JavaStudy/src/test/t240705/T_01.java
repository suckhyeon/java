package test.t240705;

import java.util.Scanner;

public class T_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int sum = (int)(kor + eng + math);
		int evg = sum / 3;
		
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + evg);
		
		
		/*
		double ko, en, math;
		System.out.print("국어 :");
		ko = sc.nextDouble();
		
		System.out.print("영어 :");
		en = sc.nextDouble();
		
		System.out.print("수학 :");
		math = sc.nextDouble();
		
		int total = (int)(ko + en + math);
		int evg = total /3;
		
		System.out.println("\n총점 : " + total);
		System.out.println("평균 : " + evg);
		*/
	}
}
