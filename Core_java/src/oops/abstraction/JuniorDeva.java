package oops.abstraction;

public class JuniorDeva extends Deva {
	
	@Override
	public void goldLoan() {
		System.out.println("Junior Deva Paid Gold Loan!!");
	}
	
	public void bike() {
		System.out.println("BMW!!!!");
	}
	
	public static void main(String[] args) {
		System.out.println("Junior Deva Object :- ");
		JuniorDeva j = new JuniorDeva();
		j.homeLoan();
		j.goldLoan();
		j.bike();
		System.out.println("---------------------------");
		
		System.out.println("Parent Object :- ");
		Parent p = new JuniorDeva();
		p.homeLoan();
		p.goldLoan();
//		p.bike(); //CTE
		System.out.println("---------------------------");
		
		System.out.println("Deva Object :- ");
		Deva d = new JuniorDeva();
		d.homeLoan();
		d.goldLoan();
//		d.bike(); //CTE
		System.out.println("---------------------------");
	}
}
