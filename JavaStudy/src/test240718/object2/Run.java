package test240718.object2;

public class Run {

	public static void main(String[] args) {
	
		PhoneController pc = new PhoneController();
		String[] result = pc.method();
		
		for(String res : result) {
			System.out.println(res);
			System.out.println();
		}
		
	}
}
