package hw2;

public abstract class AbstractAccount implements Account{
    protected double balance;

    public void put(double amount) {
        this.balance += amount;
    }

    public void take(double amount) {
        if(balance >= amount) {
            doTake(amount);
        } else {
            throw new IllegalArgumentException("Недостаточно средств на балансе!");
        }
    }

    private void doTake(double amount) {
        this.balance -= amount;
    }

    public double getAmount() {
        return this.balance;
    }
}
