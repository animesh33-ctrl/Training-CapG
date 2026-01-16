package supercall;

public class Mobile extends Product{
	float price;
	String sim;
	public Mobile(String brand,float price,String sim) {
		super(brand);
		this.price = price;
		this.sim = sim;
	}
	
	public void display() {
		System.out.println("Brand : "+this.brand);
		System.out.println("Price : "+this.price);
		System.out.println("Sim : "+this.sim);
	}
	
	public static void main(String[] args) {
		Mobile m  = new Mobile("IQOO", 25000, "JIO");
		m.display();
	}
}
