package dk.cphbusiness.banking.contract;


import java.util.List;

public interface MovementManager {
    // TODO: Change Throw exception to custom exceptions
    List<MovementDetail> getMovements(String accountNumber) throws Exception;

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
     **/
    public static class MovementDetail extends MovementIdentifier {
        long time;
        long amount;
        String target;
        String source;

        public MovementDetail(long id, long time, long amount, String target, String source) {
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

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }
    }
}

