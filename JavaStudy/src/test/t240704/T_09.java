package test.t240704;

public class T_09 {
	public static void main(String[] args) {
		
		/*
		int[][] iArr = new int[4][4];
		
		for(int i = 0; i <= iArr[0].length; i++) {
			iArr[0][i] = i;
		}
		for(int i = 0; i < iArr[1].length; i++) {
			iArr[1][] = 
		}
		for(int i = 0; i < iArr[2].length; i++) {
			iArr[2][i] = ;	
		}
		for(int i = 0; i < iArr[3].length; i++) {
			iArr[3][i] = ;	
		}
		*/
		
		/*
		int[][] arr= {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		*/
		
		int[][] arr = new int[4][4];
		int value = 1;
		for(int i = 0; i < arr.length; i++) {  //1차원 배열의 갯수
			for(int j = 0; j < arr[i].length; j++) { //1차원 배열이 i일때 길이
				arr[i][j] = value++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
