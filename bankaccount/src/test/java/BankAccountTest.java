import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {
    @Test
    void testHasStartingBalanceOfZero() {
        BankAccount subject = new BankAccount();
        float result = subject.getBalance();
        assertEquals(0, result);
    }
    @Test
    void testBalanceIncreasesWhenADepositIsMade() {
        BankAccount subject = new BankAccount();
        subject.deposit(100);
        float result = subject.getBalance();
        assertEquals(100, result);
    }
    @Test
    void testBalanceDecreasesWhenAWithdrawalIsMade() {
        BankAccount subject = new BankAccount();
        subject.deposit(100);
        subject.withdraw(50);
        float result = subject.getBalance();
        assertEquals(50, result);
    }

    @Test
    void testErrorThrownIfInsufficientFundsForWithdrawal() {
        BankAccount subject = new BankAccount();
        try {
            subject.withdraw(500);
        }
        catch (ArithmeticException e) {
            Assertions.assertEquals("Insufficient funds", e.getMessage());
        }
    }

    @Test
    void testErrorThrownIfNegativeDepositMade() {
        BankAccount subject = new BankAccount();
        try {
            subject.deposit(-50);
        }
        catch (ArithmeticException e) {
            Assertions.assertEquals("You must deposit a positive amount", e.getMessage());
        }
    }

    @Test
    void testErrorThrownIfNegativeWithdrawalMade() {
        BankAccount subject = new BankAccount();
        try {
            subject.withdraw(-50);
        }
        catch (ArithmeticException e) {
            Assertions.assertEquals("You must withdraw a positive amount", e.getMessage());
        }
    }

    @Test
    void testInitializesWithAnEmptyTransactionHistory() {
        BankAccount subject = new BankAccount();
        assertEquals(0, subject.getTransactions().size());
    }

    @Test
    void testCanCreateANewTransaction() {
        BankAccount subject = new BankAccount();
        subject.deposit(100);
        assertEquals(1, subject.getTransactions().size());
    }

}
