package hw2;

public class FixedAmountAccount extends AbstractAccount {
    public FixedAmountAccount(double balance) {
        this.balance = balance;
    }

    public FixedAmountAccount() {
        this(0);
    }

    public void put(double amount) {}

    public void take(double amount) {}
}
