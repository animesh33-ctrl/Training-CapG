package object_creation;

public class BankAccount {
	int accNo;
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accNo = 12345;
        b1.balance = 5000;
        b1.deposit(1500);
        b1.showBalance();
    }
}
