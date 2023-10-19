package main;

public class DepositAccount extends Account {
    private long takeUnixTime;

    public DepositAccount(Object balance) {
        super(balance);
    }

    public DepositAccount() {
        this(0);
    }

    public String take(Object amount) {
        long unixTime = System.currentTimeMillis();
        int takeLimit = 86400 * 30;

        if(this.takeUnixTime == 0 || 
        unixTime - this.takeUnixTime > takeLimit) {
            this.takeUnixTime = unixTime;

            return super.balanceAction(amount, 0.0, "take");
        } else {
            return "Нельзя снимать средства чаще, чем раз в месяц!";
        }
    }
}
