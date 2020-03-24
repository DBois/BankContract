package dk.cphbusiness.banking;

import net.sourceforge.plantuml.graph.Move;
import net.sourceforge.plantuml.openiconic.Movement;

import java.util.List;

public interface MovementManager {
    List<MovementDetail> getMovements(String accountNumber);

    public static class MovementIdentifier {
        private final long id;

        public MovementIdentifier(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

    }

    /**
     * Member details
     */
    public static class MovementDetail extends MovementIdentifier {
        long time;
        long amount;
        AccountManager.AccountSummary target;
        AccountManager.AccountSummary source;

        public MovementDetail(long id, long time, long amount, AccountManager.AccountSummary target, AccountManager.AccountSummary source) {
            super(id);
            this.time = time;
            this.amount = amount;
            this.target = target;
            this.source = source;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public long getAmount() {
            return amount;
        }

        public void setAmount(long amount) {
            this.amount = amount;
        }

        public AccountManager.AccountSummary getTarget() {
            return target;
        }

        public void setTarget(AccountManager.AccountSummary target) {
            this.target = target;
        }

        public AccountManager.AccountSummary getSource() {
            return source;
        }

        public void setSource(AccountManager.AccountSummary source) {
            this.source = source;
        }
    }
}

