package test240723.object3;

public class NumberController {

	public NumberController() {
		super();
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		
		
		if((num1 >= 1 && num1 <= 100) && (num2 >= 1 && num2 <= 100)) {
			return (num1 % num2 == 0); // boolean형 true false 리턴법
		} else {
			throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
		}
		
		/*
		if(num1 >= 1 && num1 <=100 && num2 >= 1 && num2 <= 100) {
			if(num1 % num2 == 0) {
				System.out.println("true");
			} else if(num1 % num2 != 0){
				System.out.println("false");
			}
		}
		if(!(num1 >= 1 && num1 <=100 && num2 >= 1 && num2 <= 100)) {
				throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");	
			}
		*/
	}

}
