package a.basic;
import java.util.Scanner;

public class Practice2 {
	/*
	 * 키보드로 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로 + 세로) * 2
	 * 
	 * 가로 : ()
	 * 세로 : ()
	 * 
	 * 면적 : n
	 * 둘레 : n
	 * 
	 * + 소수점 2번째 자리까지만 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int num1, num2;
		
		System.out.print("가로 : ");
		num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("세로 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("면적 : " + (num1 * num2));
		System.out.println("둘레 : " + ((num1 + num2) * 2));
		*/
		
		float width, height;
		
		/*System.out.print("가로 : ");
		width = sc.nextFloat();
		sc.nextLine();
		
		System.out.print("세로 : ");
		height = sc.nextFloat();
		sc.nextLine();
		*/
		
		//이렇게도 가능
		System.out.print("가로와 세로 : ");
		width = sc.nextFloat();
		height = sc.nextFloat();
		
		
		System.out.printf("면적 : %.2f \n" , (width * height));
		System.out.printf("둘레 : %.2f " , (width + height)*2);
		
		
		
	}

}
