package test240711.object2;

public class Human {
	/*
	private String name;
	private int price;
	
	public Human() {
		super();
	}
	
	public Human(int price) {
		super();
		this.price = price;
	}



	public Human(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void buy() {
		System.out.println(this.name + "님의 구매내역");
	}

	public void discount() {
		System.out.println("남은잔액 : " + this.price);
		
	}
	*/
	
	private String name;
	private int money;
	
	public Human(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void buy(TV tv) {
		if(tv.getPrice() <= this.money) { //구매가능
			System.out.println(this.name + "구매내역 ");
			tv.show();
			this.money -= tv.getPrice();
			System.out.println("남은 잔액 : " + this.money);
		} else { //구매불가능
			System.out.println(this.name + "님 잔액이 부족하여 구매할 수 없습니다." );
		}
		
	}
	
	
	
	
	
	
	
}
