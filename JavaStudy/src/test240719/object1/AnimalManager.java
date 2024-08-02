package test240719.object1;

public class AnimalManager{

	public static void main(String[] args) {
		
		Animal[] ani = new Animal[5];
	
		//int random = (int)(Math.random()*2) + 1;
		
		ani[0] = new Dog("흰둥이" , "시고르자브르종", 20);
		ani[1] = new Dog("검둥이" , "허스키", 20);
		ani[2] = new Cat("럭키" , "먼치킨", "우리집", "흰색");
		ani[3] = new Dog("망둥이" , "강아지", 20);
		ani[4] = new Cat("유미" , "기생", "오빠", "무지개");
		
		for(int i=0; i<ani.length; i++) {
			ani[i].speak();
		}
	}
}
