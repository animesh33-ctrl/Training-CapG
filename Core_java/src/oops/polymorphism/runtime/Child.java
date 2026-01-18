package oops.polymorphism.runtime;

public class Child extends Parent {

	@Override
	void home() {
		System.out.println("Red");
	}

	void bike() {
		System.out.println("BMW");
	}
	
	// Method hiding
	static void home2() {
		System.out.println("Home2 Child");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Parent p = new Parent();
		p.home(); //blue
		p.home2();
//		p.bike(); //Error

		Child c = new Child();
		c.home(); //red
		c.bike(); //bmw
		c.home2();

		Parent p1 = new Child();
		p1.home(); //red
		p1.home2();
//		p1.bike();
	}
}
