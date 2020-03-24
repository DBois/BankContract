package dk.cphbusiness.banking.contract;

import org.junit.Test;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeThat;

import static dk.cphbusiness.banking.contract.CustomerManagerHolder.*;
import static dk.cphbusiness.banking.contract.CustomerManager.*;

public class CustomerManagerTest {
        @Test
        public void testGetCustomer() {
            assumeThat(customerManager, not(nullValue()));
            var cpr = "0101010001";
            CustomerDetail customerDetail = customerManager.getCustomer(cpr);
            assertEquals(customerDetail.getCpr(), cpr);
        }
}
