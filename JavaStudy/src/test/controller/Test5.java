package test.controller;

import java.util.Scanner;

public class Test5 {
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      /*
	      System.out.print("입력1 :");
	      int num1 = sc.nextInt();
	      
	      System.out.print("입력2 :");
	      int num2 = sc.nextInt();
	      
	      int gob = num1 * num2;
	      
	      if(num1 < 10 && num2 <10) {
	         if(gob < 10) {
	            System.out.println("한자리 수 입니다.");
	         }else {
	            System.out.println("두자리 수 입니다.");
	         }
	      }
	      */
	      
	      System.out.print("입력 : ");
	      int num1 = sc.nextInt();
	      int num2 = sc.nextInt();
	      
	      if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
	    	  int result = num1 * num2;
	    	  if(result >= 10) {
	    		  System.out.println("두자리 수 입니다.");
	    	  } else {
	    		  System.out.println("한자리 수 입니다.");
	    	  }
	      }
	      
	      //System.out.println((num1 * num2 >= 10) ? "두자리 수" : "한자리 수"); 삼항연산자
	   }
	}



