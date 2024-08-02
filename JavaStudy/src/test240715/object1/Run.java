package test240715.object1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		
		/*
		1번
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("정수 입력 : ");
		int num3 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		if(num3 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		*/
		
		/*
		2번
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		for(int i=0; i <= n; i++) {
			System.out.print(i + " ");
		}
		*/
		
		/*
		3번
		System.out.print("입력 : ");
		
		int random = (int)(Math.random()*20) +1;
		
		int count = 0;
		int[] arr = new int[20];
		int[] arr1 = new int[10];
		
		for(int i=1; i<random; i++) {
			System.out.print(i + " ");
		}
		
		for(int i=random; i<=arr1.length; i++) {
			if(i == arr1.length) {
				count++;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("입력횟수 : " + count);
		*/
		
		/*
		1번
		int num1, num2, num3;
		System.out.print("입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.print(num1 % 2 == 0 ? "짝 " : "홀 ");
		System.out.print(num2 % 2 == 0 ? "짝 " : "홀 ");
		System.out.print(num3 % 2 == 0 ? "짝 " : "홀 ");
		*/
	
		/*
		3번
		int[] arr = new int[20]; // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 
		
		System.out.print("입력 : ");
		for(int i=0; i <10; i++) {
			int num = sc.nextInt();
			arr[num -1] ++;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");	
		}
		*/
		
		//학생 10명을 생성하고 reTest를 실행한 후 모든 학생의 점수를 출력
		
		Student[] stdArr = new Student[10];
		
		for(int i=0; i < stdArr.length; i++) {
			stdArr[i] = new Student();
		
			System.out.print("이름 : ");
			stdArr[i].setName(sc.next());
			
			System.out.print("반 : ");
			stdArr[i].setClassRoom(sc.nextInt());
			
			stdArr[i].reTest();
			
		}
		System.out.printf("%5s %3s %4s %4s\n" , "이름" , "반", "자바","sql", "실습");
		for(int i=0; i<stdArr.length; i++) {
			System.out.printf("%5s %3d %4.2f %4.2f 4.2f\n", stdArr[i].getName(), stdArr[i].getClassRoom(),
					stdArr[i].getJavaScore(), stdArr[i].getSqlScore(), stdArr[i].getPracticeScore());
		}
	}
}
