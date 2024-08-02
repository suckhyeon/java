package test240723.object1;

public class PlaneTest {

	public static void main(String[] args) {
		
		Plane[] pl = new Plane[2];
		
		pl[0] = new Airplane("L747", 1000);
		pl[1] = new Cargoplane("C40 ",  1000);
		
		System.out.println("plane \t" + "fuelSize");
		System.out.println("----------------");
		
		for(Plane p : pl) {
			System.out.println(p.getPlaneName() + "    " + p.getFielSize());
		}
		
		System.out.println("\n100 운항");
		((Airplane)pl[0]).flight(100);
		((Cargoplane)pl[1]).flight(100);
		
		System.out.println("plane \t" + "fuelSize");
		System.out.println("----------------");
		for(Plane p : pl) {
			System.out.println(p.getPlaneName() + "   " + p.getFielSize());
		}
		
		System.out.println("\n200 주유");
		((Airplane)pl[0]).refuel(200);
		((Cargoplane)pl[1]).refuel(200);
		
		System.out.println("plane \t" + "fuelSize");
		System.out.println("----------------");
		for(Plane p : pl) {
			System.out.println(p.getPlaneName() + "   " + p.getFielSize());
		}
		
	}

}
