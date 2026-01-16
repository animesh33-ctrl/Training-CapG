package oops.inheritence;

public class Bike1 extends Vehicle1 {
	private String brand;
	private float price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Bike1(String color, String brand, float price) {
		super(color);
		this.brand = brand;
		this.price = price;
	}
	public void display() {
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.getColor());
		System.out.println("Price : "+this.price);
	}
	
	public static void main(String[] args) {
		Bike1 b = new Bike1("Red","Splendor",60000.0f);
		b.display();
	}
}
