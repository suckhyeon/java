package test.t240705;

import java.util.Scanner;

public class T_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.println("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.println("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double in1 = num1 + (num1 * 0.4);
		double in2 = num2 + (num2 * 0.0);
		double in3 = num3 + (num3 * 0.15);
		
		System.out.println("A사원 연봉/연봉+a : " + num1 + in1);
		System.out.println("B사원 연봉/연봉+a : " + num2 + in2);
		System.out.println("C사원 연봉/연봉+a : " + num3 + in3);
		
		switch(in > 3000) {
		case 1 :
		case 2 :
		case 3 :
			default :
				System.out.println("잘못입력");
				}
		*/
		
		int salaryA, salaryB, salaryC;
		System.out.print("A사원의 연봉 :");
		salaryA = sc.nextInt();
		
		System.out.print("B사원의 연봉 :");
		salaryB = sc.nextInt();
		
		System.out.print("C사원의 연봉 :");
		salaryC = sc.nextInt();
		
		double totalSalaryA, totalSalaryB, totalSalaryC;
		totalSalaryA = salaryA + (salaryA * 0.4);
		totalSalaryB = salaryB;
		totalSalaryC = salaryC + (salaryC * 0.15);
		
		System.out.printf("A사원의 연봉/연봉+a : %d/%f\n" , salaryA, totalSalaryA);
		System.out.println(totalSalaryA >= 3000 ? "3000이상" : "3000미만");
		
		System.out.printf("B사원의 연봉/연봉+a : %d/%f\n" , salaryB, totalSalaryB);
		System.out.println(totalSalaryB >= 3000 ? "3000이상" : "3000미만");
		
		System.out.printf("C사원의 연봉/연봉+a : %d/%f\n" , salaryC, totalSalaryC);
		System.out.println(totalSalaryC >= 3000 ? "3000이상" : "3000미만");
		
	}
}
