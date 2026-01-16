package relatioship.has_a;

public class Helper {
	public static void main(String[] args) {
		Car c = new Car();
		Engine e = new Engine();
		e.setCc(250);
		e.setType("Diesel");
		
		c.setId(1);
		c.setColor("Red");
		c.setBrand("BMW");
		c.setEngine(e);
		
		System.out.printf("Id : %d \nColor : %s \nBrand : %s \n",c.getId(),c.getColor(),c.getBrand());
		System.out.printf("Engine CC : %.2f \nEngine Type : %s\n",c.getEngine().getCc(),c.getEngine().getType());
		
	}
}
