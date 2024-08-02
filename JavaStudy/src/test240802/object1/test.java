package test240802.object1;

import test240710.object1.Person;

public class test {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		for(int i = 0; i < pArr.length; i++) { // i가 pArr.length보다 작거나 같을때까지 반복한다면 인덱스 3번부터는 빈공간이라 오류가난다.
			System.out.println(pArr[i]); // getName() 대신해서 [i]를 입력한다.
		}
	}
}