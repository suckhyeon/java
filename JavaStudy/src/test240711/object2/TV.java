package test240711.object2;

public class TV {
	
	// 필드
	private String tvName;
	private int tvnum;
	private int tvInch;
	private int price;
	
	public TV() {
		super();
	}

	public TV(String tvName, int tvnum, int tvInch, int price) {
		super();
		this.tvName = tvName;
		this.tvnum = tvnum;
		this.tvInch = tvInch;
		this.price = price;
	}

	public String getTvName() {
		return tvName;
	}

	public void setTvName(String tvName) {
		this.tvName = tvName;
	}

	public int getTvnum() {
		return tvnum;
	}

	public void setTvnum(int tvnum) {
		this.tvnum = tvnum;
	}

	public int getTvInch() {
		return tvInch;
	}

	public void setTvInch(int tvInch) {
		this.tvInch = tvInch;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println(this.tvName + "에서 만든" + this.tvnum +"년형 " + this.tvInch + "인치 TV의 가격 : " + this.price);
	}
	

}
