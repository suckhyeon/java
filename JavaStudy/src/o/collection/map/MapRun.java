package o.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapRun {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		
		// 계층구조
		// List계열, Set계열의 클래스들은 Collection을 구현한 클래스이다. => 객체를 추가하고자할 때 공통적으로 add메소드를 이용
		
		// Map계열은 Collection을 구현한 클래스가 아니다. => 객체를 추가하고자 할때 put메소드를 이용(Key + value 한쌍으로 담아야한다.)
		
		// 1.put(k, v) : map에 키 벨류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1000));
		hm.put("칸쵸", new Snack("단맛", 500));
		hm.put("홈런볼", new Snack("달달한맛", 600));
		hm.put("아이셔", new Snack("신맛", 300));
		
		System.out.println(hm);
		// 저장되는 순서가 랜덤이다. value값이 중복되어도 키값이 중복되지 않으면 잘 저장된다.
		
		hm.put("홈런볼", new Snack("딸기맛", 800));
		System.out.println(hm);
		//동일한 키값으로 다시 추가하는 경우 value값이 덮어씌워진다. 중복된 키값이 공존할 수 없어서 키값이 식별자 역할을 한다.
		
		// 2. get(Object Key) : 해당 키값을 가지는 value값을 리턴해준다.
		System.out.println(hm.get("다이제"));
		System.out.println(hm.get("홈런볼"));
		
		// 3. size() : 담겨있는 객체들의 수
		System.out.println(hm.size());
		
		// 4. replace(key, value) => 해당 키값을 찾아서 다시 전달한 value값으로 수정
		hm.replace("칸쵸", new Snack("초초초 초코맛" , 1200));
		System.out.println(hm);
		
		// 5. remove(Object Key) => 해당 키값을 찾아서 그 벨류세트를 삭제시켜주는 메소드
		hm.remove("아이셔");
		System.out.println(hm);
		
		// 전체객체에 대해서 접근하는 방법
		
		// for each <- 순서가 있어야되기때문에 불가능
		// Iterator반복자 사용불가능 List, set 계열에서만 사용
		
		// Map의 Key는 set과 매우 유사하다.
		// 1. Key를 모아서 set자료구조의 형태로 받을 수 있다.
		
		Set KeySet = hm.keySet();
		System.out.println(KeySet);
		
		for(Object key : KeySet) {
			System.out.println("키 : " + key +  " 값 : " + hm.get(key));
		}
		
		//2. entrySet() 이용하는 방법
		Set entrySet = hm.entrySet();
		
		Iterator it = entrySet.iterator();
		while(it.hasNext()){
			Entry entry = (Entry)it.next(); // Entry객체안에 Key, value값이 다 담겨져있다.
			
			String key = (String)entry.getKey();
			Snack value = (Snack)entry.getValue();
			System.out.println("키 : " + key +  " 값 : " + value);
		}
	}
}
