package oops.polymorphism;

public class FindMax {

	// 2 int
	public void max(int a, int b) {
		System.out.print("Max between two Integer : ");
		System.out.println(a > b ? a : b);
	}

	// 3 int
	public void max(int a, int b, int c) {
		System.out.print("Max between three Integer : ");
		System.out.println(a > b && a > c ? a : b > c ? b : c);
	}

	// 1 int,1 float
	public void max(int a, float b) {
		System.out.print("Max between One Integer and One Float : ");
		System.out.println(a > b ? a : b);
	}

	// 2 float
	public void max(float a, float b) {
		System.out.print("Max between two Float : ");
		System.out.println(a > b ? a : b);
	}

	public static void main(String[] args) {
		FindMax m = new FindMax();
		m.max(1, 2);
		m.max(1, 2, 3);
		m.max(3, 3.3f);
		m.max(3.14f, 3.15f);
	}
}
