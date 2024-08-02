package test240710.object1;

public class Person {
	String name; // 값이 없다면 "이름없음" String name = "이름없음"
	int age; // 값이 없다면 1 int age = 1; 
	
	// 모든 필드 데이터를 전달받은 값으로 초기화하는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name :" + name + " age : " + age);
	}

	//name값 만을 전달받아 초기화하는 생성자

	public Person(String name) {
		this(name, 1); // this()는 본인의 생성자 호출 , 생성자는 항상 맨 앞에서 호출
		//this.name = name;
		//this.age = 1;
		System.out.println("name :" + name + " age : " + age);
	}

	// 값을 전달받지 않고 초기화하는 생성자
	public Person() {
		this("이름없음" , 1);
		//this.name = "이름없음";
		//this.age = 1;
		System.out.println("name :" + name + " age : " + age);
	}
	
	//public Person(int age) { System.out.println("age : " + age); }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	

}
