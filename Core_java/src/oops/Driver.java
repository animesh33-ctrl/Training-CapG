package oops;

public class Driver {
	public static void main(String[] args) {
		Trainer r = new Trainer();
		r.setId(1);
		r.setName("Animesh");
		r.setPass("@123");
		System.out.println(r.getId());
		System.out.println(r.getName());
		System.out.println(r.getPass());
	}
}
