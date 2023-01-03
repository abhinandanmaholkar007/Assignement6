package bankserver;

class Bank
{
    private double accountBalance=3000.00;

    public double getAccountBalance() {
        return accountBalance;
    }
}
public class BankSystem {
    public static void main(String[] args) {
        Bank currentBalance=new Bank();
        double bankBalance=currentBalance.getAccountBalance();
        System.out.println(bankBalance);
    }
}
