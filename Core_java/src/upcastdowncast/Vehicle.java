package upcastdowncast;

public class Vehicle {
	public void travel() {
		System.out.println("Travelling...");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.travel();
//		v1.noOfPass(); //error
		
		Car c1 = (Car) v1;
		c1.travel();
		c1.noOfPass();
		
		v1 = new Bike();
		v1.travel();
		
		Bike b1 = (Bike)v1;
		b1.travel();
		b1.topSpeed();
		
		v1 = new Train();
		v1.travel();
		
		Train t1 = (Train)v1;
		t1.travel();
		t1.ticketPrice();
		
		// Class Cast Exception
		Vehicle v2 = new Bike();
		Car c2 = (Car)v2;
		
	}
}
