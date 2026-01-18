package oops.abstraction;

public class Rectangle extends Shape {
	
	@Override
	public void area() {
		System.out.println("Area of Rectangle.");
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.display();
	}
}
