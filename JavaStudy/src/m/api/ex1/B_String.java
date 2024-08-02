package m.api.ex1;

import java.util.StringTokenizer;

public class B_String {
	
	public void method01() {
		
		// 1. 생성자를 통한 문자열생성
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1);
		System.out.println(str2);
		// String클래스에 toString메소드는 이미 오버라이딩 되어있다.
		
		System.out.println(str1 == str2); //false 이유는 주소값이 달라서 == 주소값비교
		System.out.println(str1.equals(str2)); //true  String클래스에서 equalse메소드는 이미 오버리이딩이 되어있다.(주소값이 아닌 값비교)		
		
		// String클래스에서 HashCode메소드도 이미 오버라이딩 되어있다.(주소값이 아닌 문자열을 가지고 만들도록 되어있다.) 
		System.out.println(str1.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		// ---------------------------------------------------------
		
		// 2.문자열을 리터럴값으로 생성
		String str3 = "hello";
		String str4 = "hello";
		// 리터럴 제시시 상수풀영역에 들어간다.
		// String Pool 특징 : 동일한 문자열을 가질 수 없다.
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4); //true 주소값 비교
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		// 변경하는 순간 기존의 문자열 자리에서 변경되는게 아닌 새로운 곳을 참조하도록 된다.(새로운 주소값 부여받음 => 주소값 변경)
		
	}
	
	public void method02() {
		String str1 = "Hello World";
		
		// 1.문자열.charAt(int index) : char => 문자열에서 전달받은 index 위치에 문자만을 추출해서 리턴
		char ch = str1.charAt(6);
		System.out.println("ch : " + ch);
		
		// 2.문자열.concat(String str) : String => 문자열과 전달된 또 다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		// 3.문자열.contains(CharSequence str) : boolean => 문자열과 전달된 문자열이 포함되어 있는지를 반환
		System.out.println("str1에 Hello라는 문자열이 포함? : " + str1.contains("Hello"));
		System.out.println("str1에 Bye라는 문자열이 포함? : " + str1.contains("Bye"));
		
		// 4.문자열.substring(int beginIndex <- 시작 인덱스, [int endIndex] <- 생략가능 마지막 인덱스) : String => 문자열을 시작인덱스 위치부터 마지막인덱스 -1 위치까지 추출해서 반환
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(6, 9));
		
		// 5. 문자열.replace(char oldChar, char newChar) : String => 문자열에서 oldChar문자를 newChar문자로 변환한 채 문자열 리턴
		String str4 = str1.replace('l', 'c');
		System.out.println("str1 : " + str1);
		System.out.println("str4 : " + str4);
		
		// 6. 문자열.toUpperCase() .toLowerCase() : String => 문자열을 전부 대문자, 소문자로 변경해서 반환
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		// 7. 문자열.trim() : String => 문자열의 앞 뒤 공백을 제거시킨 새 문자열을 리턴
		String str5 = "   JA    va       ";
		System.out.println(str5.trim());
		
		// 8. 문자열.toCgarArray() : char[] => 문자열을 char형 배열로 변형
		char[] arr = str1.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
		// 9. String.valueOf => 스트링형으로 변환
		System.out.println(String.valueOf(arr));

	}
	
	public void method03() {
		String str = "Java,Oracle,sql,html,css,spring";
		
		// 구분자를 기준으로 문자열을 분리시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때
		// String클래스에서 제공하는 split 메소드를 사용 => 문자열.split(구분자) : String[]
		
		String[] arr = str.split(",");
		for(String st : arr) {
		System.out.println(st);
		}
		
		// 분리된 문자열 배열을 다시 String으로 변경하는 방법
		// String.join(구분자, 배열)  / , 등등
		
		String str2 = String.join("," , str);
		System.out.println(str2);
		
		// 방법2. 분리된 문자열들을 각각 토큰으로서 관리가능
		// java.util.StringTokenizer 클래스를 이용
		//StringTokenizer stn = new StringTokenizer(문자열 , 구분자);
		//StringTokenizer stn = new StringTokenizer(str, ","); 구분자 안넣으면 1개로 취급 
		//System.out.println(stn);
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		System.out.println(stn.countTokens());
		
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		//System.out.println(stn.nextToken()); <= 오류 : 더이상 토큰이 남아있지 않을 때 다음토큰을 가져오려고 하면 예외발생
		
		System.out.println(stn.countTokens()); // 0출력 이미 다 토큰을 배출한 상태여서
		
		// 모든 토큰을 조회하는 방법
		stn = new StringTokenizer(str, ",");
		int count = stn.countTokens();
		
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		
		stn = new StringTokenizer(str, ",");
		while(stn.hasMoreElements()) { //가져올 토큰이 남아있는지 확인해 주는 메소드 있으면 true 없으면 false 없다면 탈출
			System.out.println(stn.nextToken());
		}
	}
}
