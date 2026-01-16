package supercall;

public class Laptop extends Product {
	float price;
	String processor;

	public Laptop(String brand, float price, String processor) {
		super(brand);
		this.price = price;
		this.processor = processor;
	}
	
	public void display() {
		System.out.println("Brand : "+this.brand);
		System.out.println("Price : "+this.price);
		System.out.println("Processor : "+this.processor);
	}

	public static void main(String[] args) {
		Laptop l = new Laptop("Asus", 183000, "Intel Ultra 9");
		l.display();
	}

}
