package o.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListRun {

	public static void main(String[] args) {
		/*
		 * 컬렉션 : 자료구조 개념이 내장되어있는 클래스로 자바에서 제공하는 자료구조를 담당하는 프레임워크
		 * 
		 * 자료구조 : 방대한 데이터를 보다 효율적으로 관리(추가, 삭제, 조회, 정렬, 수정)할 수 있도록 도와주는 개념
		 * 프레임워크 : 이미 만들어져있는 틀(코드더미)
		 * 
		 * 배열의 단점과 컬렉션의 장점
		 * 
		 * 배열의 단점 
		 * 1. 배열은 크기를 지정해야한다. => 새로운 값을 더 추가하고자 한다면 새로운 크기의 배열을 만들고 기존의 값을 전부 복사하는 코드를 작성해야한다.
		 * 2. 배열 중간에 값을 추가하거나 삭제하는 경우 값을 매번 이동시켜주는 복잡한 코드를 직접 작성해야한다.
		 * 3. 한 공간에 한 타입의 데이터들만 저장이 가능하다.
		 * 
		 * 컬렉션의 장점
		 * 1. 크기를 지정해 줄 필요가 없다. 만일 지정했다고해도 더 많은 데이터를 담으면 알아서 사이즈를 늘려준다.
		 * 2. 중간에 값을 추가한다거나 삭제하는 경우 값을 당겨주는 작업(알고리즘)을 직접 기술할 필요가 없다. 단지 메소드 호출만으로 알아서 내부적으로 진행이 된다.
		 * 3. 한 공간에 여러타입의 데이터들을 저장할 수 있다. 단 객체만 가능, 한 타입만 담도록 제한할 수도 있다.(제네릭 사용 가능)
		 */
		
		//ArrayList list
		List list = new ArrayList(10); // 크기지정을 할수도 있고 안해도 괜찮다.
		// List list = new LinkedList(); 
		
		System.out.println(list); //[] 비어있는 상태
		System.out.println(list.size()); // 0
		
		// 1. add(E e) : 리스트 공간 끝에 전달된 데이터를 추가시켜주는 메소드
		list.add(new Music("에피소드" , "이무진"));
		list.add(new Music("스무살 어느날" , "윤하"));
		list.add(new Music("맨정신" , "빅뱅"));
		list.add("끝");
		
		System.out.println(list); // list의 특징 : 순서를 유지하면서 담긴다. (0번 인덱스부터 순서대로)
		
		// 장점 1 : 지정된 배열의 크기보다 더 많이 넣어도 오류가 발생하지 않는다. => 크기제악x
		// 장점 3 : 다양한 타입의 데이터를 담을 수 있다. => 여러 타입 보관가능
		
		// 2. add(int index, E e) : 직접 인덱스를 지정해서 해당 위치에 데이터를 추가할 수 있다.
		list.add(1, new Music("고민중독","qwer"));
		System.out.println(list); // list의 특징 : 1이면 인덱스 1번자리에 새롭게 추가하고 기존 1번인덱스에있던 정보부터 끝까지는 한칸씩 밀려서 출력
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터를 삭제시켜주는 메소드
		list.remove(1);
		System.out.println(list); // list의 특징 : 1번 인덱스자리에 잇던 정보를 삭제하고 그 뒤부터 한칸씩 땡겨와 출력

		// 4. set(int index, E e) : 해당 인덱스 위치의 값을 전달받은 e객체로 변경
		list.set(2, new Music("고민중독","qwer"));
		System.out.println(list); // list의 특징 : 2번 인덱스 자리의 잇던 정보를 새롭게 변경
		
		// 5. size() : 리스트의 사용중인 사이즈를 반환시켜주는 메소드
		System.out.println(list.size());
		
		// 6. get(int index) : 해당 인덱스 위의 객체 반환시켜주는 메소드
		Music m = (Music)list.get(0);
		System.out.println(m); // list의 특징 : 0번 인덱스에 있는 정보를 출력
		
		System.out.println(((Music)list.get(1)).getTitle()); // 해당 인덱스의 타이틀 정보를 출력
		
		// 7. subList(int index1 , int count) : List => 특정부분 추출해서 새로운 리스트로 변환
		List sub = list.subList(0, 2);
		System.out.println(sub); // 0번 인덱스부터 2번 인덱스 전까지 출력
		
		// 8. addAll(Collection c) : 컬렉션을 통째로 뒤에 추가시켜주는 메소드
		list.addAll(sub);
		System.out.println(list); // 기존 리스트가 끝나고 sub리스트에 있던 정보들을 추가
		
		// 9. isEmpty() : boolean 리턴형 => 컬렉션이 비어있는지 묻는 메소드 비워져있으면 true 안비워져있으면 fasle
		System.out.println(list.isEmpty());
		
		// 10. clear() : 전부 비워주는 메소드
//		list.clear();
//		System.out.println(list);
//		
//		System.out.println(list.isEmpty()); // 비어있어서 true
		
		System.out.println("==================================");
		// 전체접근 방법
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==================================");
		
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
}
