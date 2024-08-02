package test240731.object1;

public class Run {
	/*
	 * MVC 패턴 : 각 클래스마다 역할(데이터(모델), 화면(뷰), 요청처리(컨트롤))을 부여서해 작업 => 유지보수에 용이
	 * 
	 * M(Model) : 데이터를 담당하는 역할(데이터를 담기위한 클래스, 비지니스로직 처리하기위한 클래스, 데이터가 보관되어있는 보관함과 연결해서 입출력을 해주기위한 클래스)
	 * V(view) : 화면을 담당하는 역할(사용자에게 보여지는 시각적인 요소(입, 출력)) - menu객채
	 * C(Controller) : 사용자가 요청한 내용을 처리한 후 그 결과를 돌려주는 역할
	 */

	public static void main(String[] args) {
		new FarmMenu().mainMenu();

	}

}
