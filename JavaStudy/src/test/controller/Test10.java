package test.controller;

public class Test10 {
	public static void main(String[] args) {
	      int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61}, {14, 16, 18, 78}, {45, 26, 72, 23}};
	      /*
	      int[] copyAr = arr;
	      
	      for(int j=0; j<array.length;j++) {   
	         for(int i=0; i<array[j].length;i++) {
	            array[j][i] = i;
	         }
	      }
	      if(array[j][i] % 3 == 0) {
	      }
	      */
	      int size = 0;
	      
	      for(int i=0; i < array.length; i++) {
	    	  size += array[i].length;
	      }
	      
	      int[] copyAr = new int[size];
	      int copyIndex = 0;
	      
	      //공식 2차원배열 값들 대입하는 2차원배열 array를 전체검사
	      for(int i = 0; i < array.length; i++) {
	    	  for(int j=0; j < array[i].length; j++) {
	    		//2차원 배열의 요소가 i,j의 요소가 3의 배수인지 확인
	    		 if(array[i][j] % 3 == 0) { 
	    			 // i,j의 요소가 이미 copyAr들어잇는 요소인지 확인하기
	    			 boolean isCountinue = false;
	    			 for(int k = 0; k < copyIndex; k++) {
	    				 if(copyAr[k] == array[i][j]) {
	    					 isCountinue = true;
	    				 }
	    			 }
	    			 //isCountinue -> true일 대는 반복값이 존재
	    			 // !isCountinue -> 반복값이 존재하지 않는다면 copyAr -> array[i][j]대입
	    			 if(!isCountinue) {
	    				 copyAr[copyIndex] = array[i][j];
		    			 copyIndex += 1; //값을 넣고 1칸씩 증가
	    			 }
	    		 }
	    	  }
	    	  
	      }  
	      //copyAr출력 copy인덱스까지
	      System.out.print("copyAr : ");
	      for(int i=0; i<copyIndex; i++) {
	    	  System.out.print(copyAr[i] + " ");
	      }
	}

}
