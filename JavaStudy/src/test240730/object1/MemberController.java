package test240730.object1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MemberController {
	private HashMap map = new HashMap();
	
	public boolean joinMembership(String id, Member m) { // id를 키로 m을 벨류로  / map.contain(id)
		
		if(map.get(id) == null) { // id를 key로 값을 가져왔을 때 값이 없다면
			map.put(id, m);
			return true;
		}
		return false;
		
		/*
		if(id.equals()) { //id를 key로 값을 가져왔을 때 값이 없다면
			map.put(id, m); // 제네릭 선언을 안해서 object형태로 들어감
			return true;
		} else {
			return false;
		}
		
		return false;
		*/
	}
	
	public String logIn(String id, String password) { // null이 아니여야 값이 들어있다.
		Member m = (Member)map.get(id);
		if(m != null) {
			if(m.getPassword().equals(password)) {
				return m.getName();
			}
		}
		
		return null;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) { // object로 반환되니 member로 다운캐스팅
		Member m = (Member)map.get(id);
		if(m != null && m.getPassword().equals(oldPw)) {
			m.setPassword(newPw);
			return true;
		}
		return false;
	}
	
	public void changeName(String id, String newName) {
		Member m = (Member)map.get(id);
		if(m != null) {
			m.setName(newName);
		}
	}
	public TreeMap sameName(String name) { // map형태로는 반복 불가 set은 반복이 되기때문에 key를 set으로 불러오기
		TreeMap result = new TreeMap(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		//map,keySet() -> id가 모여잇는 set자료규조
		for(Object id : map.keySet()) {
			Member m = (Member)map.get(id);
			if(m.getName().equals(name)) {
				result.put(id, m.getName());
			}
		}
		return result;
		
	}

}
// set,map은 순서가없어서 tree(treemap)로 하면 순서가 생김
