package oops.abstraction;

public class CalcChild1 extends Calculator {
	
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	
	@Override
	public int multi(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		Calculator c = new CalcChild1();
		System.out.println(c.add(1, 2));
		System.out.println(c.multi(1, 2));
		System.out.println(sub(3, 2));
	}
	
}
