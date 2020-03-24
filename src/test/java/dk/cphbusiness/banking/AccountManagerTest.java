package dk.cphbusiness.banking;

import org.junit.Test;
import java.util.Collection;
import java.util.List;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;
import static org.junit.Assume.*;
import static dk.cphbusiness.banking.AccountManagerHolder.*;
public class AccountManagerTest {

    @Test
    public void testGetAccount(){
        assumeThat(manager, not(nullValue()));
        AccountManager.AccountDetail account = manager.getAccount("1008956666");
        assumeThat(account, not(nullValue()));
    }

    @Test
    public void testGetAccounts(){
        assumeThat(manager, not(nullValue()));
        var accounts = manager.getAccount("123456789");
        assumeThat(accounts, not(nullValue()));
    }

    @Test
    public void testTransfer(){
        assumeThat(manager, not(nullValue()));
        var source = manager.getAccount("1008956666");
        var targetNumber = "1008956667";
        manager.transfer(10000, targetNumber);
        var target = manager.getAccount(targetNumber);
        assertEquals(target.getBalance(), 10000);
        assertEquals(source.getBalance(), -10000);
    }

}
