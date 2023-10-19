package main;

public class Account {
    private Double balance;

    public Account(Object balance) {
        if(balance instanceof Integer) {
            this.balance = Double.valueOf((Integer)balance);
        }
    }

    public Account() {
        this(0);
    }

    protected String balanceAction(Object amount, Double tax, String action) {
        String resultReport = "";

        if(amount instanceof Integer) {
            amount = Double.valueOf((Integer)amount);
        }

        if(amount instanceof Double) {
            if((Double)amount < 0) {
                resultReport = "Принимаются только положительные числа!";
            } else {
                resultReport = "Операция прошла успешно!";

                switch(action) {
                    case "put":
                        this.balance += (Double)amount;
                        break;
                    case "take":
                        if(this.balance < (Double)amount) {
                            resultReport = "На Вашем балансе недостаточно средств!";
                        } else {
                            this.balance -= (Double)amount + ((Double)amount * tax);
                        }
                        break;
                }
            }
        } else {
            resultReport = "Принимаются только числа!";
        }

        return resultReport;
    }
    
    public String put(Object amount) {
        return this.balanceAction(amount, 0.0, "put");
    }

    public String take(Object amount) {
        return this.balanceAction(amount, 0.0, "take");
    }

    public void getAmount() {
        System.out.format("Ваш баланс: %s\n", this.balance);
    }
}
