package oops.abstraction;

public class Cricket extends Game{
	
	@Override
	public void start() {
		System.out.println("Cricket is started after feb");
	}
	
	@Override
	public void end() {
		System.out.println("Cricket is started before december");
	}
	
	public static void main(String[] args) {
		Game t = new Cricket();
		t.play();
	}
	
}
