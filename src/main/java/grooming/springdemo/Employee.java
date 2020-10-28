package grooming.springdemo;

public class Employee {

	/*
	 * private Car car;
	 * 
	 * public Employee() { car = new Car(); }
	 * 
	 * public void travels() { car.transport(); }
	 */

	/*
	 * private Train train;
	 * 
	 * public Employee() { this.train = new Train(); }
	 * 
	 * public void travels() { train.transport(); }
	 */

	private Vehicle vehicle;

	public Employee() {
	}

	/*
	 * public Employee(Vehicle vehicle) { this.vehicle = vehicle; }
	 */

	public void travels() {
		vehicle.transport();
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
