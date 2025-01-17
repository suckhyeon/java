package test240731.object1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FarmController {
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) { //map을보면 해시코드 이퀄스 오버라이딩
		if(hMap.containsKey(f)) { // f라는 키로 데이터가 존재한다면 -> 추가불가
			return false;
		} else {
			hMap.put(f, amount);
			return true;
		}
	}

	public boolean removekind(Farm f) {
		if(hMap.containsKey(f)) { //f라는 키로 데이터가 존재한다면 -> 삭제가능
			hMap.remove(f);
			return true;
		}
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) { // 있어야 변경 가능put말고 replace로 해도 된다.
		if(hMap.containsKey(f)) {
			hMap.put(f, amount);
			return true;
		}
		return false;
	}
	
	public HashMap<Farm, Integer> printFarm(){ 
		return this.hMap;
	}
	
	public boolean buyFarm(Farm f) {
		Integer amount = hMap.get(f);
		if (amount != null && amount > 0) {
			list.add(f);
			hMap.replace(f, amount - 1);
			return true;
		} else {
			return false;	
		}
		/*
		if(hMap.containsKey(f) && hMap.get(f) >= 0) {
			list.add(f);
			hMap.put(f, -1);
			return true;
		}
		return false;
		*/
	}
	
	public boolean removeFarm(Farm f) {
		if (list.contains(f)) {
			list.remove(f);
			Integer amount = hMap.get(f); // hMap<종류, 갯수> => hMap.get(종류); => 갯수
			hMap.replace(f, amount + 1);
			return true;
		} else {
			return false;	
		}
		/*
		if(list.contains(f)) {
			list.remove(f);
			hMap.put(f, 1);
			return true;
		}
		return false;
		*/
	}
	
	public ArrayList<Farm> printBuyFarm(){
		return this.list;
	}
}
