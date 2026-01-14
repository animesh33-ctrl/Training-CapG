package oops;

public class Student {
	String name;
	private int pass;
	
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Raju";
		s.pass = 123;
		System.out.println(s.name);
		System.out.println(s.pass);
	}
}
