package test.controller;

import java.util.Scanner;

public class Test4 {
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
     	/*
	     System.out.print("1번값 : ");
	     int num1 = sc.nextInt();
	     
	     System.out.print("2번값 :");
	     int num2 = sc.nextInt();
	     
	     int hap = num1 + num2;
	     int cha = num1 - num2;
	     int gob = num1 * num2;
	     int nanu = num1 / num2;   
	     
	     System.out.println("합 :" + hap);
	     System.out.println("차 :" + cha);
	     System.out.println("곱 :" + gob);
	     
	     if(num1 <= 0) {
	        nanu = 0;
	        System.out.println("나누기 :" + nanu);
	     } else {
	        System.out.println("나누기 :" + nanu);
	     }
	  }
	  */
	 
	 int[] arr = new int[2];
	 
	 arr[0] = sc.nextInt();
	 
	 arr[1] = sc.nextInt();
	 
	 System.out.println("합 : " + (arr[0] + arr[1]));
	 System.out.println("차 : " + (arr[0] - arr[1]));
	 System.out.println("곱 : " + (arr[0] * arr[1]));
	 System.out.println("나누기 : " + (arr[0] / arr[1]));
	 
	 
	 
	 }
}