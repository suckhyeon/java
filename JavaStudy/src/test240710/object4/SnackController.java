package test240710.object4;

public class SnackController {
	
	private Snack s = new Snack();

	public SnackController() {
		super();
	}
	
	public String saveDate(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setFlavor(flavor);
		s.setName(name);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다.";
	}
	
	public String confirmDate() {
		return s.information();
	}
}
