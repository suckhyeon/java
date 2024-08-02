package test.t240705;

import java.util.Scanner;

public class T_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double cm = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 :");
		double kg = sc.nextDouble();
		
		double bmi = kg / (cm * cm);
		
		System.out.printf("BMI 지수 : %f\n" , bmi);

		/*
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(18.5 <= bmi && bmi < 23 ) {
			System.out.println("정상체중");
		} else if(23 <= bmi && bmi < 25) {
			System.out.println("과체중");
		} else if(25 <= bmi && bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
		*/
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23 ) {  // 이미 18.5이상이라서 18.5는 지워도 된다
			System.out.println("정상체중");
		} else if(bmi < 25) {  //이미 23이상라서 23은 지워도 된다.
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
		
	}
}
