package test.t240705;

import java.util.Scanner;

public class T_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int count = 0;
		int win = 0;
		int ross = 0;
		int same = 0;
		
		System.out.println("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		
		System.out.println("가위바위보 : ");
		String rcp = sc.next();
		
		int random = (int)(Math.random() * 2) + 1;
		System.out.println(random);
		
		switch(rcp) {
		case "가위" : 
			System.out.println("");
		case "바위" :
			System.out.println("");
		case "보" :
			System.out.println("");
		}
		
		System.out.println("이겼씁니다.");
		win++;
		System.out.println("졌습니다");
		ross++;
		System.out.println("비겼습니다.");
		same++;
		
		
		count ++;
		System.out.println(count + "전" + win + "승" + ross "패);
		*/
		
		
		int win=0, draw=0, loss=0;
		String[] gameArr = {"가위", "바위", "보"};
		String name;
		System.out.print("당신의 이름을 입력해주세요 : ");
		name = sc.next();
		
		while(true) {
			System.out.print("가위바위보 : ");
			String user = sc.next();
			if(user.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", (win+draw+loss), win, draw, loss);
				break;
			}
			//컴퓨터에 랜덤으로 "가위,바위,보" 중 하나를 부여해야한다.
			//문자열을 랜덤으로 줄 수 없으니 우리는 랜덤 숫자를 부여한다.
			// 0(가위) 1(바위) 2(보)
			
			//int com = (int)(Math.random() * 3);
			//gameArr[0] -> 가위 [1] -> 바위 [2]-> 보
			
			String com = gameArr[(int)(Math.random() * 3)];
			
			if(user.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;
			} else if(user.equals("가위") && com.equals("보") || 
					user.equals("바위") && com.equals("가위") ||
					user.equals("보") && com.equals("바위")) {
				System.out.println("이겼습니다.");
				win++;
			} else {
				System.out.println("졌습니다.");
				loss++;
		}
		}
	}
}
