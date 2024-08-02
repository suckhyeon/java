package o.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericListRun {
	
	/*
	 * 제네릭을 사용하는 이유
	 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있다.
	 * 2. 컬렉션에 저장된 객체를 열어서 사용할 때 매번 형변환하는 절차를 없애기 위해서
	 */
	
	public static void main(String[] args) {
		List<Music> list = new ArrayList();
		
		list.add(new Music("에피소드" , "이무진"));
		list.add(new Music("스무살 어느날" , "윤하"));
		list.add(new Music("맨정신" , "빅뱅"));
		//list.add("끝"); 뮤직으로 제네릭 해버려서 안된다.
		
		System.out.println(list);
		
		for(Music m : list) {
			System.out.println(m);
		}
	}
	
}
