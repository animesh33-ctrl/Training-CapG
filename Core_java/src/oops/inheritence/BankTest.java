package oops.inheritence;

public class BankTest extends BankAccount{
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccNo(5551);
        b.setHolder("Amit");
        b.deposit(5000);
        b.withdraw(1200);

        System.out.println("Account: " + b.getAccNo());
        System.out.println("Holder: " + b.getHolder());
        System.out.println("Balance: " + b.getBalance());
    }
}
