package test.t240705;

import java.util.Scanner;

public class T_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int random = (int)(Math.random() * 100) + 1;
		int num = sc.nextInt();
		
		for(int i = 1; i < random; i++) {
			random = i + 1;
		}
		for(int i = 1; i < random; i++) {
			System.out.println(random);
		}
		while(true) {
		System.out.println("1~100 사이의 임이의 난수를 맞춰보세요 : ");
		
		if(num < 1 || num > 100) {
			System.out.println("1~100 사이의 숫자를 입력해주세요.");
		}
		
		if(random > num) {
			System.out.println("UP!");
		} else if(random < num){
			System.out.println("DOWN!");
		} else {
			System.out.println("정답입니다!");	
			System.out.printf("%d회만에 맞추셨습니다.");
		}
			break;
		}
		*/
		
		int rand = (int)(Math.random() * 100) + 1;
		//System.out.println(rand);
		int count = 0;
		
		while(true) {
		System.out.print("1~100 사이의 임이의 난수를 맞춰보세요 :");
		int num = sc.nextInt();
		
		if(!(num >= 1 && num <= 100)) {
			System.out.println("1~100사이의 숫자를 입력하세요.");
			continue;
			} 
		
		count++;
		
		if(num == rand) {
			System.out.println("정답입니다.");
			System.out.println(count + "회 만에 맞추셨습니다.");
		} else if(num > rand) {
			System.out.println("DOWN!");
		} else {
			System.out.println("UP!");
		}
		}
	}
}
