package test240802.object1;

import java.util.ArrayList;

import test240731.object1.Fruit;

public class MyCollection {
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		list.add(new Fruit("바나나", "노랑")); //new Fruit()을 추가해 내가 추가하고픈 과일과 그 색깔을 정해준다.
		
		for(int i=0; i<list.size(); i++) { // i<=list.size(); 코드를 i<list.size();코드로 변경한다.
			System.out.println(list.get(i));
		}
	}
}