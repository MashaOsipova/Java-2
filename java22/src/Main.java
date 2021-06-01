public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int topUpBalance = 1200;
        int Bonus = 0;

        if (topUpBalance > 1000) {
        }

        if (topUpBalance < 1000) {
            Bonus = 0;
        }
        int bonus = (accountBalance + topUpBalance) / 100;
        System.out.println(bonus);

        int totalBalance = accountBalance + topUpBalance + bonus;
        System.out.println(totalBalance);
}}
