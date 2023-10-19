package main;

public class CreditAccount extends Account {
    private Double takeTax;

    public CreditAccount(Object balance) {
        super(balance);
        this.setTakeTax(0.01);
    }

    public CreditAccount() {
        this(0);
    }

    private void setTakeTax(Double takeTax) {
        this.takeTax = takeTax;
    }

    public String take(Object amount) {
        return super.balanceAction(amount, this.takeTax, "take");
    }
}
