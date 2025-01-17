package test240729.object1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l); // 정상적으로 들어갔으면 true 안들어갓으면 false 반환형이 boolean이라서 가능
		/*
		lottery.add(l);
		for(Object obj : lottery) {
			if(lottery == null) {
				return false;
			}
		}
		return true; // 정상적으로 들어갔으면 true 안들어갓으면 false
		*/
	}
	
	public boolean deleteObject(Lottery l) {
		boolean isRemove = lottery.remove(l);
		if(isRemove && win != null) {
			win.remove(l);
		}
		return isRemove;
		/*
		if(l == this.winObject()) {
			return false;
		} else {
			
		lottery.remove(l);
		}
		
		boolean != null && this.winObjcet() != null
				
		
		return true;
		*/
	}
	
	public HashSet winObjcet() {
		if(lottery.size() < 4) {
			return null;
		}
		
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		
		//당첨자4명을 뽑기위한 반복4번
		while(win.size() < 4) {
			int rand = (int)(Math.random() * list.size()); // 랜덤발생
			win.add(list.get(rand)); //랜드 자리에있는 사람을 당첨목록에 추가
		}
		
		return win;
		/*
		ArrayList list = new ArrayList();
		list.addAll(lottery);
		
		list.indexOf(list);
		*/
	}
	
	public TreeSet sortedWinObject() {
		TreeSet sortedWinSet = new TreeSet(new SortedLottery());
		sortedWinSet.addAll(win);
		return sortedWinSet;
		
		/*
		Collections.sort(lottery, new TreeSet());
		
		return null;
		*/
	}
	
	public boolean searchWinner(Lottery l) {
		return win.contains(l);
		/*
		win.
		return true;
		*/
	}
}
