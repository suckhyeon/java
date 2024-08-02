package test.t240709.object3;

public class Book {
	private String title; //제목
	private String publisher; //출판사
	private String author; //작가
	private int prive; //가격
	private double discountRate; //할인율
	
	
	public void Book() {}
	
	public void Book1(String title, String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}

	public Book(String title, String publisher, String author, int prive, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.prive = prive;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrive() {
		return prive;
	}

	public void setPrive(int prive) {
		this.prive = prive;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	
	public void information() {
		
	}
	
}



