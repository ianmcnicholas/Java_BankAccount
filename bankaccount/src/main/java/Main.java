import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ArithmeticException {

        try {
            BankAccount account1 = new BankAccount();
            account1.deposit(1000);

            BankAccount account2 = new BankAccount();
            account2.deposit(500);
            account2.withdraw(600);

            System.out.print("Account1 has a balance of: ");
            System.out.println(account1.getBalance());

            System.out.print("Account2 has a balance of: ");
            System.out.println(account2.getBalance());
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //this has now been caught

    }

}
