package oops.polymorphism;

public class Math {
	public static void add(int a, int b) {
		System.out.print("Int type of Data : ");
		System.out.println(a + b);
	}

	public static void add(long a, long b) {
		System.out.print("Long type of Data : ");
		System.out.println(a + b);
	}

	public static void add(float a, float b) {
		System.out.print("Float type of Data : ");
		System.out.println(a + b);
	}

	public static void add(double a, double b) {
		System.out.print("Double type of Data : ");
		System.out.println(a + b);
	}

	public static int add(int a, int b, int c, int d) {
		System.out.print("Integer(4) type of Data : ");
		return (a + b + c + d);
	}
	
	public void add(int a,int b,int c) {
		System.out.print("Non-static Method : ");
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		add(1, 2);
		add(1111111, 222222222l);
		add(1, 2.0f);
		add(1, 2.0d);
		System.out.println(add(1, 2, 3, 4));
		Math m = new Math();
		m.add(1, 2, 3);
	}
}
