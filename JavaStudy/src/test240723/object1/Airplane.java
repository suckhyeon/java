package test240723.object1;

public class Airplane extends Plane{

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		super.setFielSize((int)(super.getFielSize() - (distance*3)));
	}

	@Override
	public void refuel(int fuel) {
		super.setFielSize((int)(super.getFielSize() + (fuel)));
		
	}
}