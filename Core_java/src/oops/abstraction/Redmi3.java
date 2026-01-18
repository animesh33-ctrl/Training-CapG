package oops.abstraction;

public class Redmi3 extends Redmi2{
	@Override
	public void smartCamera() {
		System.out.println("SMART CAMERA");
	}
	
	public static void main(String[] args) {
		Redmi3 r3 = new Redmi3();
		r3.smartCamera();
		r3.camera();
		r3.battery();
		System.out.println("-------------------");
		
		Redmi2 r2 = new Redmi3();
		r2.smartCamera();
		r2.battery();
		r2.camera();
		System.out.println("-------------------");
		
		Redmi1 r1 = new Redmi3();
//		r1.smartCamera(); // Till Redmi2
		r1.battery();
		r1.camera();
		System.out.println("-------------------");
		
		Mobile m = new Redmi3();
		m.battery();
		m.camera();
		System.out.println("-------------------");
			
	}
	
	
}
