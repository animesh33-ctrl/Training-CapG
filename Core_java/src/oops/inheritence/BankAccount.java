package oops.inheritence;

public class BankAccount {
    private int accNo;
    private String holder;
    private double balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        if (accNo > 0)
            this.accNo = accNo;
        else
            System.out.println("Invalid account number");
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        if (!holder.isEmpty())
            this.holder = holder;
        else
            System.out.println("Invalid holder name");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0)
            balance += amt;
        else
            System.out.println("Invalid amount");
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance)
            balance -= amt;
        else
            System.out.println("Invalid withdraw amount");
    }
}
