package dk.cphbusiness.banking.contract;
import java.util.List;
import java.util.Map;

public interface AccountManager {
    // TODO: Change Throw exception to custom exceptions
    AccountDetail getAccount(String number) throws Exception;
    List<AccountSummary> getAccountsFromCustomer(String CPR) throws Exception;
    MovementManager.MovementDetail transfer(long amount, String sourceNumber, String targetNumber) throws Exception;

    public static class AccountIdentifier {
        private final String number;

        public AccountIdentifier(String number) {
            this.number = number;
        }

        public String getNumber() {
            return this.number;
        }
    }

    /**
     * Member details
     */
    public static class AccountDetail extends AccountIdentifier {
        private BankManager.BankSummary bank;
        private CustomerManager.CustomerSummary customer;
        private long balance;
        private List<MovementManager.MovementDetail> movements;

        public AccountDetail(String number, BankManager.BankSummary bank, CustomerManager.CustomerSummary customer, long balance, List<MovementManager.MovementDetail> movements) {
            super(number);
            this.bank = bank;
            this.customer = customer;
            this.balance = balance;
            this.movements = movements;
        }

        public BankManager.BankSummary getBank() {
            return bank;
        }

        public void setBank(BankManager.BankSummary bank) {
            this.bank = bank;
        }

        public CustomerManager.CustomerSummary getCustomer() {
            return customer;
        }

        public void setCustomer(CustomerManager.CustomerSummary customer) {
            this.customer = customer;
        }


        public long getBalance() {
            return balance;
        }

        public void setBalance(long balance) {
            this.balance = balance;
        }

        public List<MovementManager.MovementDetail> getMovements() {
            return movements;
        }

        public void setMovements(List<MovementManager.MovementDetail> movements) {
            this.movements = movements;
        }
    }

    /**
     * Member summary
     */
    public static class AccountSummary extends AccountIdentifier {
        private BankManager.BankSummary bank;
        private long balance;

        public AccountSummary(String number, BankManager.BankSummary bank, long balance) {
            super(number);
            this.bank = bank;
            this.balance = balance;
        }

        public BankManager.BankSummary getBank() {
            return bank;
        }

        public void setBank(BankManager.BankSummary bank) {
            this.bank = bank;
        }


        public long getBalance() {
            return balance;
        }

        public void setBalance(long balance) {
            this.balance = balance;
        }
    }

}
