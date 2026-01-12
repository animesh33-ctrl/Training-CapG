package Java_core;

public class Demo {
	public static void main(String[] args) {
//		int a = 10;
//		long b=a; //widening
//		System.out.println(b);
//		
//		long c = 20;
//		int d = (int)c;//narrowing
//		System.out.println(d);
//		
//		double d1 = 55.55;
//		int i1 = (int)d1; //narrowing
//		System.out.println(i1);
		int a = 3,b=5;
	    a = ++a + a++ - --a + b++ + ++b;
	    b = a++ + b++ + ++b;
		System.out.println(a);
		System.out.println(b);
	}
}
