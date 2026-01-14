package oops.inheritence;

public class Fruit {
	
	String color;
	String name;

	public Fruit() {}
	
	public Fruit(String color,String name) {
		this.color = color;
		this.name = name;
	}

	public static void main(String[] args) {
		Fruit f = new Fruit("Kashmiri","red");
		System.out.println(f.color);
		System.out.println(f.name);
	}
}
