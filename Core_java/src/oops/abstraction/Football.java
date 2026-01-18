package oops.abstraction;

public class Football extends Game{
	@Override
	public void start() {
		System.out.println("Football is started after feb");
	}
	
	@Override
	public void end() {
		System.out.println("Football is started before december");
		
	}
	
	public static void main(String[] args) {
		Game t = new Football();
		t.play();
		Cricket t2 = new Cricket();
		t2.play();
		Football t1 = new Football();
		t1.play();
	}
}
