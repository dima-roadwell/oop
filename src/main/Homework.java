package main;

public class Homework {
    public static void main(String[] args) {

        // Первый тест
        System.out.println("First test");

        Account account1 = new Account();

        System.out.println(account1.put(5));
        account1.getAmount();

        System.out.println();


        // Второй тест
        System.out.println("Second test");

        Account account2 = new Account();

        System.out.println(account2.put(10));
        account2.getAmount();

        System.out.println(account2.take(5));
        account2.getAmount();

        System.out.println();


        // Третий тест
        System.out.println("Third test");

        Account account3 = new CreditAccount();

        System.out.println(account3.put(10));
        account3.getAmount();

        System.out.println(account3.take(5));
        account3.getAmount();

        System.out.println();


        // Четвертый тест
        System.out.println("Fourth test");

        Account account4 = new DepositAccount(100);
        account4.getAmount();

        System.out.println(account4.take(10));
        account4.getAmount();

        System.out.println(account4.take(10));
        account4.getAmount();
    }
}
