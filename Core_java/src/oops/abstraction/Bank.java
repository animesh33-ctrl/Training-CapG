package oops.abstraction;

public abstract class Bank {
	public abstract int getInterestRate();
	
	public static void main(String[] args) {
		Bank b1 = new Sbi();
		Bank b2 = new Hdfc();
		
		System.out.println(b1.getInterestRate());
		System.out.println(b2.getInterestRate());
		
	}
}
