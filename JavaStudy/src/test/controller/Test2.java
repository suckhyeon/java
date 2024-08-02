package test.controller;

public class Test2 {
	public static void main(String[] args) {
		/*
		for(int j=2; j<=5; j++) {   
			if(j % 2 == 1) {
	           for(int i=1; i<=9; i++) {
	        	  System.out.println(j + "*" + i + "=" + (j * i));
	           }
			}
		}
		*/
		
		for(int j=2; j<=5; j++) {
			for(int i=1; i<10; i++) {
				if((j * i) % 2 == 1) {
				System.out.println(j + " * " + i + " = " + (j * i));
				}
			}
		}
	}
}