package hw2;

public class CreditAccount extends AbstractAccount {
    private double takeTax;

    public CreditAccount(double balance) {
        this.balance = balance;
        this.setTakeTax(0.01);
    }

    public CreditAccount() {
        this(0.0);
    }

    private void setTakeTax(double takeTax) {
        this.takeTax = takeTax;
    }

    public void take(double amount) {
        super.take(amount + amount * this.takeTax);
    }
}
