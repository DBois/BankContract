package dk.cphbusiness.banking.contract;

import org.junit.Test;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

public class AccountManagerTest {

    @Test
    public void testGetAccount(){
        assumeThat(AccountManagerHolder.manager, not(nullValue()));
        var accountNumber = "0123456789";
        AccountManager.AccountDetail account = AccountManagerHolder.manager.getAccount(accountNumber);
        assumeThat(account, not(nullValue()));
        assertEquals("0123456789", account.getNumber());
    }

    @Test
    public void testGetAccounts(){
        assumeThat(AccountManagerHolder.manager, not(nullValue()));
        var accounts = AccountManagerHolder.manager.getAccounts("1008956666");
        assumeThat(accounts, not(nullValue()));
        assertEquals(2, accounts.size());
    }

    @Test
    public void testTransfer(){
        assumeThat(AccountManagerHolder.manager, not(nullValue()));
        var sourceNumber = "0123456789";
        var source = AccountManagerHolder.manager.getAccount(sourceNumber);
        var targetNumber = "0012345678";
        AccountManagerHolder.manager.transfer(10000, sourceNumber, targetNumber);
        var target = AccountManagerHolder.manager.getAccount(targetNumber);
        source = AccountManagerHolder.manager.getAccount(sourceNumber);
        assertEquals(10000, target.getBalance());
        assertEquals(-10000, source.getBalance());
    }

}
