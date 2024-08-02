package b.operater;

public class Operater3 {
	/*
	 * 산술연산자
	 * + - * / % 
	 * 우선순위
	 * * / % > + - 
	 * 
	 * 복합 대입 연산자
	 * 산술연산자와 대입연산자를 결합해서 사용할 수 있다.
	 * 
	 * += /= -= *= %=
	 * 
	 * ex) a = a + 3; -> a += 3; 
	 */
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b; // a = 1+5 = 6, b = 10, c = 16
		int d = c / a; // d = 2 
		int e = c % a; //16 / 6 = 4
		int f = e++; // 4(5)
		int g = (--b) + (d--); // --b = 9 d-- = 2(1) 9 + 2 = 11
		int h = 2;
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
		// a = 6, b = 9, c = 16, d = 1, e = 5, f = 4, g = 11, h = 2
		// 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
		// 6 + 3 * 10 % 8
		// 6 + 30 % 8
		// 6 + 6
		// 12
	}

}
