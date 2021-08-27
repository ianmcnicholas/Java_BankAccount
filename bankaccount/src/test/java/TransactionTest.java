import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TransactionTest {

    @Test
    void testRequiresDateCreditDebitAndBalanceToInitialize() {
        String date = "26/08/2021";
        float credit = 100;
        float debit = 200;
        float balance = 1000;
        Transaction transaction = new Transaction(date, credit, debit, balance);
        assertEquals("26/08/2021", transaction.getDate());
        assertEquals(100, transaction.getCredit());
        assertEquals(200, transaction.getDebit());
        assertEquals(1000, transaction.getBalance());
    }

}
