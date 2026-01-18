package oops.abstraction;

public class Sbi extends Bank{
	@Override
	public int getInterestRate() {
		System.out.print("SBI : ");
		return 10;
	}
}
