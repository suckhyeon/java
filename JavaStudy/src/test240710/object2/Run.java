package test240710.object2;

public class Run {

	public static void main(String[] args) {
		
		/*
		Product p1 = new Product("에어1" , 190000, "나이키");
		p1.information();
		
		System.out.println();
		
		Product p2 = new Product("에어3" , 210000, "나이키");
		p2.information();
		 */
		
		/*
		Student st = new Student(1,3,"조석현",165,'남' );
		st.information();
		*/
		
		Book b1 = new Book();
		Book b2 = new Book("홍길동전","길벗","허균");
		Book b3 = new Book("자바란 무엇인가", "kh", "조석현", 15000, 0.2);
		
		b1.inform();
		System.out.println();
		b2.inform();
		System.out.println();
		b3.inform();
	}
}
