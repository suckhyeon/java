package test.controller;

import java.util.Scanner;

public class Test1 {
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      /*
	      while(true) {
	      System.out.print("입력 : ");
	      int num = sc.nextInt();
	      
	      if(1 <= num && num <= 100) {
	         if(num % 2 ==0) {         
	            System.out.println("2의 배수입니다.");
	         } else {
	            System.out.println("2의 배수가 아닙니다.");
	            }
	         }
	      }
	      */
	      
	      System.out.println("입력 : ");
	      int num = sc.nextInt();
	      
	      if(num >= 1 && num <= 100) {
	    	  if(num % 2 == 0) {
	    		  System.out.println("2의 배수입니다.");
	    	  } else {
	    		  System.out.println("2의 배수가 아닙니다.");
	    	  }
	      }
	      
	      //System.out.println(num % 2 == 0 ? "2의 배수입니다." : " 2의 배수가 아닙니다." ); 삼항연산자
	
	 }
}
