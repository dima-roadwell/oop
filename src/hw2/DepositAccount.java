package hw2;

public class DepositAccount extends AbstractAccount {
    private long takeUnixTime;

    public DepositAccount(double balance) {
        this.balance = balance;
    }

    public DepositAccount() {
        this(0);
    }

    public void take(double amount) {
        long unixTime = System.currentTimeMillis();
        int takeLimit = 86400 * 30;

        if(this.takeUnixTime == 0 || 
        unixTime - this.takeUnixTime > takeLimit) {
            this.takeUnixTime = unixTime;

            super.take(amount);
        } else {
            throw new IllegalArgumentException("Нельзя снимать средства чаще, чем раз в месяц!");
        }
    }
}
