package dk.cphbusiness.banking;

import org.junit.Test;

import java.util.Collection;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;
import static dk.cphbusiness.banking.CustomerManagerHolder.*;
import static dk.cphbusiness.banking.CustomerManager.*;

public class CustomerManagerTest {
        @Test
        public void testGetCustomer() {
            assumeThat(customerManager, not(nullValue()));

            CustomerDetail customerDetail = customerManager.getCustomer("0101952145");

            assertThat(customerDetail, not(nullValue()));
        }
}
