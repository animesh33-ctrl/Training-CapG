package oops.polymorphism.runtime;

class MapV1{
	void route() {
		System.out.println("Direction");
	}
}

class MapV2 extends MapV1{
	@Override
	void route() {
		super.route();
		System.out.println("Duration");
	}
}
public class MapV3 extends MapV2{
	void bookCab() {
		System.out.println("Uber Cab Booked");
	}
	
	public static void main(String[] args) {
		MapV3 map = new MapV3();
		map.route();
		map.bookCab();
		System.out.println("----------------------");
		MapV1 map2 = new MapV3();
		map2.route();
		System.out.println("----------------------");		
		MapV3 map3 = (MapV3)map2;
		map3.route();
		map3.bookCab();
	}
}
