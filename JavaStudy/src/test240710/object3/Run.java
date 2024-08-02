package test240710.object3;

public class Run {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEmpNo(100);
		emp1.setEmpName("홍길동");
		emp1.setDept("영업부");
		emp1.setJob("과장");
		emp1.setAge(25);
		emp1.setGender('남');
		emp1.setSalary(2500000);
		emp1.setBonusPoint(0.05);
		emp1.setPhone("010-1234-5678");
		emp1.setAddress("서울시 강남구");
		
		System.out.println("번호 : " + emp1.getEmpNo());
		System.out.println("이름 : " + emp1.getEmpName());
		System.out.println("부서 : " + emp1.getDept());
		System.out.println("직책 : " + emp1.getJob());
		System.out.println("나이 : " + emp1.getAge());
		System.out.println("성별 : " + emp1.getGender());
		System.out.println("급여 : " + emp1.getSalary());
		System.out.println("보너스 : " + emp1.getBonusPoint());
		System.out.println("전화번호 : " + emp1.getPhone());
		System.out.println("주소 : " + emp1.getAddress());
		
		
	}

}
