package test240726.object1;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		
		String newStr = "";
		while(tokenizer.hasMoreElements()) {
			newStr += tokenizer.nextToken();
		}
		
		return newStr;
	}

	public String firstCap(String input) {
		String firstr = "";
//		for(int i=0; i<input.length(); i++) {
//			firstr += (i == 0 ? (input.charAt(i) + "").toUpperCase() : input.charAt(i)); // 0~끝까지
		
		firstr = input.substring(0, 1).toUpperCase() + input.substring(1); // 0번째부터 1까지 + 1번째부터
	
		return firstr;
	}
	
	public int findChar(String input, char one) {
		int count = 0;
//		for(int i=0; i<input.length(); i++) {
//			if(input.charAt(i) == one) {
//				count++;
//			}
		
		for(char c : input.toCharArray()) {
			if(c == one) {
				count ++;
			}
		}
		
		return count;
	}
	
}