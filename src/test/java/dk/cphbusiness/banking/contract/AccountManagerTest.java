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
        AccountManager.AccountDetail account = AccountManagerHolder.manager.getAccount("1008956666");
        assumeThat(account, not(nullValue()));
    }

    @Test
    public void testGetAccounts(){
        assumeThat(AccountManagerHolder.manager, not(nullValue()));
        var accounts = AccountManagerHolder.manager.getAccount("0123456789");
        assumeThat(accounts, not(nullValue()));
    }

    @Test
    public void testTransfer(){
        assumeThat(AccountManagerHolder.manager, not(nullValue()));
        var source = AccountManagerHolder.manager.getAccount("1008956666");
        var targetNumber = "1008956667";
        AccountManagerHolder.manager.transfer(10000, targetNumber);
        var target = AccountManagerHolder.manager.getAccount(targetNumber);
        assertEquals(target.getBalance(), 10000);
        assertEquals(source.getBalance(), -10000);
    }

}
