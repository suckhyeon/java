package test240718.object2;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		super();
		this.setMaker("삼성");
	}

	@Override
	public boolean bluetoothPen() {
		return true;
	}

	@Override
	public String printInformation() {
		
		String result = " ";
		result += ("갤럭시 노트9은 " + this.getMaker() + "에서 만들어졌고 계원은 다음과 같다. \n ");
		result += (this.makeCall() + "\n");
		result += (this.takeCall() + "\n");
		result += (this.picture() + "\n");
		result += (this.charge() + "\n");
		result += (this.touch() + "\n");
		result += (this.bluetoothPen());
		
		return result;
		
	}
	
	@Override
	public String makeCall() {
		
		return "번호를 누르고 통화버튼을 누름" ;
	}

	@Override
	public String takeCall() {
	
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {

		return "1200만 듀얼 카메라";
	}

	@Override
	public String touch() {

		return "정전식, 와콤팬 지원";
	}

	@Override
	public String charge() {

		return "고속 충전, 고속 무선충전";
	}
	

}
