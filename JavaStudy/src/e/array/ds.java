package e.array;

public class ds {
	public static void main(String[] args) {
		// 배열 길이만큼 숫자 순서대로 
		int[] arr = new int[15];
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] += i+1;
			count++;
			System.out.print(arr[i] + " ");
		}
	}
}
