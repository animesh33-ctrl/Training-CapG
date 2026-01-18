package oops.abstraction;

public class Hdfc extends Bank{
	@Override
	public int getInterestRate() {
		System.out.print("HDFC : ");
		return 12;
	}
}
