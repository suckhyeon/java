package test240718.object3;

public class Run {

	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();		
		String[] result = pc.method();
		
		String res = null;
		
		for(int i=0; i<result.length;i++) {
			
			res = result[i];
			
			System.out.println(res);
			System.out.println();
			}
		}
}



