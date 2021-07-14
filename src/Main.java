public class Main {
    public static void main(String[] args) {
        int balance = 100;//в рублях
        int topUpBalance = 100;//пополнение в рублях
        int bonus = 100;//за каждые 100 руб. бонус 1 руб., при пополнение от 1000 руб.

        if (topUpBalance >= 1000) {
            int finalBalance = (topUpBalance / bonus) + topUpBalance + balance;
            System.out.println("Balance: " + finalBalance);
        } else {
            int finalBalance = (balance + topUpBalance);

            System.out.println("Balance: " + finalBalance);
        }
    }
}
