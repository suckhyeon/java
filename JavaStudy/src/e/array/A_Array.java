package e.array;

public class A_Array {
	/*
	 * 변수 : 하나의 공간에 하나의 값을 담을 수 있다.
	 * 배열 : 하나의 공간에 여러개의 값을 담을 수 있는 개념
	 * 		 같은 자료형의 값으로만 담을 수 있다.
	 * 		 정확하게 얘기하자면 배열의 각 인덱스 자리에 실제 값이 담김(index는 0부터 시작)
	 * 
	 * 배열은 왜 사용할까?
	 * 변수만을 사용하게 된다면 -> 대량의 데이터들을 보관하고자 할 때 각각의 변수를 만들어서 따로 관리해야한다. 
	 */

	public static void main(String[] args) {
		
		/*
		 * int형 변수 5개 만들어서 0~4의 값을 각각 할당해주세요
		 */
		/*
		int n1 = 0;
		int n2 = 1;
		int n3 = 2;
		int n4 = 3;
		int n5 = 4;
		*/
		
		/*
		int[] arr1 = new int[5];
		arr1[0] = 0;
		arr1[1] = 1;
		arr1[2] = 2;
		arr1[3] = 3;
		arr1[4] = 4;
		*/
		
		int[] arr1 = {0, 1, 2, 3, 4};
		
		/*
		 * 1. 배열 선언(여러개의 값들을 보관할 배열을 만들기 -> 참조변수 선언)
		 * 자료형[] 배열이름; <- 선호 
		 * 자료형 배열이름[];
		 */
		
		int[] arr;
		
		/*
		 * 2. 배열 할당(이 배열에 몇개의 값들을 보관할건지 크기를 지정하는 과정)
		 * 배열명 = new 자료형[배열의 크기(길이)];
		 */
		
		arr = new int[5];
		
		/*
		 * 배열을 선언과 동시에 할당가능
		 */
		
		int[] arr2 = new int[5];
		
		/*
		 * 3. 값을 대입하고 가져와서 사용하기
		 * index를 이용해서 접근한다.
		 */
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println(arr); //실제 arr이라는 값을 출력하면 arr의 정보(자료형 + 길이 + 주소정보)같은 것들이 출력된다. -> 이상문구출력
	}

}
