package test240711.object3;

public class Book {
	private String name;
	private String jang;
	private String str;
	private int num;
	
	public Book(String name, String jang, String str, int num) {
		super();
		this.name = name;
		this.jang = jang;
		this.str = str;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJang() {
		return jang;
	}

	public void setJang(String jang) {
		this.jang = jang;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String toString() {
		return "제목 : " + this.name + "장르 : " + this.jang + "저자 : " + this.str + "책번호 : " + this.num;
	}
	

}
