package hw2;

public class Homework2 {
    public static void main(String[] args) {
        // Account account1 = new CreditAccount(200);
        // System.out.println(account1.getAmount());
        // account1.take(100);
        // System.out.println(account1.getAmount());
        // account1.take(100);
        // System.out.println(account1.getAmount());

        // Account account2 = new DepositAccount(200);
        // System.out.println(account2.getAmount());
        // account2.take(100);
        // System.out.println(account2.getAmount());
        // account2.put(100);
        // System.out.println(account2.getAmount());
        // account2.take(100);
        // System.out.println(account2.getAmount());

        Account account3 = new FixedAmountAccount(200);
        System.out.println(account3.getAmount());
        account3.take(100);
        System.out.println(account3.getAmount());
        account3.put(100);
        System.out.println(account3.getAmount());
        account3.take(100);
        System.out.println(account3.getAmount());
    }
}
