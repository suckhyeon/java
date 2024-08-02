package test.t240709.object1;

public class Run {
	public static void main(String[] args) {
		Product phone1 = new Product("갤럭시 25" , 1300000, "삼성");
		Product phone2 = new Product("아이폰 15" , 1750000, "애플");
		
		phone1.information();
		phone2.information();
	
	}
}
