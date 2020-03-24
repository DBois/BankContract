package dk.cphbusiness.banking.contract;

import org.junit.Test;
import java.util.List;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assume.assumeThat;

public class MovementManagerTest {
    @Test
    public void testCreateMovement(){
        assumeThat(MovementManagerHolder.manager, not(nullValue()));
        List<MovementManager.MovementDetail> movement = MovementManagerHolder.manager.getMovements("0123456789");
        assumeThat(movement, not(nullValue()));
    }
}