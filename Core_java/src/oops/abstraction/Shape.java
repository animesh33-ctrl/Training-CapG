package oops.abstraction;

public abstract class Shape {
	public abstract void area();
	public void display() {
		System.out.println("Display Method called.");
		area();
		System.out.println("-----------------------------");
	}
}
