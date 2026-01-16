package upcastdowncast;

public class Helper {
	

	public static void getVehicle(Vehicle v) {
		if (v instanceof Car) {
			Car c = (Car) v;
			c.noOfPass();
		} else if (v instanceof Bike) {
			Bike b = (Bike) v;
			b.topSpeed();
		} else if (v instanceof Train) {
			Train t = (Train) v;
			t.ticketPrice();
		}
	}

	public static void main(String[] args) {
		Car c = new Car();
		getVehicle(c);

		Bike b = new Bike();
		getVehicle(b);

		Train t = new Train();
		getVehicle(t);
	}
}
