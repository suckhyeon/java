package a.basic;
import java.util.Scanner;
public class Practice3 {
	/*
	 * 문자열 => 객채(기능들이 있다.)
	 * ex) 문자열비교시 -> 문자열.equals(비교문자열)
	 * 
	 * 문자열.chatAt(index) : 문자열에서 내가 원하는 index의 글자를 가져온다.
	 * index : 순서를 지칭할 때 사용하는 것(0부터 시작한다.)
	 * 
	 * 영어 단어를 키보드로 입력받아 단어의 앞에서부터 3개를 출력하세요.
	 * ex) apple -> app
	 * 
	 * 단어를 입력하세요 : ()
	 * 첫 번째 문자 : a
	 * 두 번째 문자 : p
	 * 세 번째 문자 : p
	 */
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("단어를 입력하세요 : ");
		str = sc.nextLine(); //apple
		
		System.out.println("첫 번째 문자 : " + str.charAt(0)); //a
		System.out.println("두 번째 문자 : " + str.charAt(1)); //p
		System.out.println("세 번째 문자 : " + str.charAt(2)); //p
		
		/*String str1 = "suckhyeon";
		char ch1 = str1.charAt(3);
		System.out.println(ch1);
		*/
	}
	

}
