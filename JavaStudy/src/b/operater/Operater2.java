package b.operater;

public class Operater2 {
	/*
	 * 증감연산자
	 * ++ : 변수의 담긴 값을 1증가시켜주는 연산자
	 * -- : 변수에 담긴 값을 1감소시켜주는 연산자
	 * 
	 * (증감연산)변수 : 전위연산 -> 후처리 선증감
	 * 변수(증감연산) : 후위연산 -> 선처리 후증감
	 */
	public static void main(String[] args) {
		int num1 = 0;
		
		System.out.println(num1++); // 후증감 0(1)
		System.out.println(++num1); // 선증감 2(2)
		System.out.println(num1--); // 2(1)
		System.out.println(++num1); // 2(2)
		System.out.println(++num1); // 3(3)
		System.out.println(num1++); // 3(4)
		System.out.println(num1--); // 4(3)
		System.out.println(--num1); // 2(2)
		System.out.println(--num1); // 1(1)
	}

}
