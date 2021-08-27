import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class BankAccount {

    private float balance;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(float d) {
        if (d <= 0) {
            throw new ArithmeticException("You must deposit a positive amount");
        }
        balance += d;
        buildCreditTransaction(d);
    }

    public void withdraw(float w) {
        if (w <= 0) {
            throw new ArithmeticException("You must withdraw a positive amount");
        }
        else if (w > balance) {
            throw new ArithmeticException("Insufficient funds");
        }
        balance -= w;
        buildDebitTransaction(w);
    }

    private void buildDebitTransaction(float amount) {
        Transaction transaction = new Transaction(this.getDate(), 0, amount, this.getBalance());
        transactions.add(transaction);
    }

    private void buildCreditTransaction(float amount) {
        Transaction transaction = new Transaction(this.getDate(), amount, 0, this.getBalance());
        transactions.add(transaction);
    }

    public float getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    private String getDate() {
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

}
