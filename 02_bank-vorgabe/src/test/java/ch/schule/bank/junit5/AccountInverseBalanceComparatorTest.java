package ch.schule.bank.junit5;

import ch.schule.Account;
import ch.schule.AccountInverseBalanceComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountInverseBalanceComparatorTest {

    @Test
    void compare() {
        // Create some accounts with different balances
        Account account1 = new Account("1");
        account1.deposit(1, 5000);

        Account account2 = new Account("2");
        account2.deposit(1, 10000);

        Account account3 = new Account("3");
        account3.deposit(1, 2000);

        List<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);

        // Sort the accounts using AccountInverseBalanceComparator
        Collections.sort(accounts, new AccountInverseBalanceComparator());

        // Verify the order after sorting
        assertEquals("3", accounts.get(0).getId());  // Highest balance (inverse order)
        assertEquals("1", accounts.get(1).getId());
        assertEquals("2", accounts.get(2).getId());  // Lowest balance (inverse order)
    }
}
