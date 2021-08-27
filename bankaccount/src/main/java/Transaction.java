import java.util.ArrayList;

public class Transaction {
    private final String date;
    private float credit;
    private float debit;
    private float balance;

    public Transaction(String date, float credit, float debit, float balance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.balance = balance;
    }

    public String getDate() {
        return this.date;
    }

    public float getCredit() {
        return this.credit;
    }

    public float getDebit() {
        return this.debit;
    }

    public float getBalance() {
        return this.balance;
    }

}
