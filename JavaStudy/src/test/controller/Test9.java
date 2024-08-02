package test.controller;

public class Test9 {
	  public static void main(String[] args) {
	      int[][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
	      
	      /*
	      int max = array[1][0];
	      int min = array[1][1];
	     // int max, min;
	      
	      //int num = (array.length > array.length) ? max : min;
	      
	     // for(int j=0; j < array.length;j++) {
	         
	        // for(int i=0; i < array[j].length;i++) {
	            
	         //}
	      //}
	      System.out.println("가장 큰 값 : " + max);
	      System.out.println("가장 작은 값 : " + min);
	      */
	      
	      int max = array[0][0];   //00은 반드시 잇는 값이기때문에 초반을 이거로 잡음
	      int min = array[0][0];
	      
	      for(int i=0; i < array.length; i++) {
	    	  for(int j=0; j < array[i].length; j++) {
	    		  max = (max < array[i][j] ) ? array[i][j] : max;
	    		  min = (min > array[i][j] ) ? array[i][j] : min; 
	    	  }
	      }
	      System.out.println("가장 큰 값 : " + max );
	      System.out.println("가장 작은 값 : " + min);
	   }
}

