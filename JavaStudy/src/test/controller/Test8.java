package test.controller;

public class Test8 {
	 public static void main(String[] args) {
	      int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
	      
	      double sum = 0 , count = 0; 
	      for(int j=0; j<array.length;j++) {   
	         for(int i=0; i<array[j].length;i++) {
	            sum += array[j][i];
	            count++;
	         }
	      }
	      System.out.printf("합계 : %.1f \n",sum);
	      System.out.printf("평균 : %.3f", (sum / count));
	      
	     
	  
	      /*
	      double sum =0,count = 0;
	      
	      for(int i=0; i < array.length; i++) {
	    	  for(int j=0; j < array[i].length; j++) {
	    		  sum += array[i][j]; 
	    		  count++;
	    	  }
	      }
	      System.out.println("합계 : " + sum);
	      System.out.println("평균 : " + (sum / count));
	      */
	 }
}
