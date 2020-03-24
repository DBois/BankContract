package dk.cphbusiness.banking;
import java.util.List;

public interface AccountManager {
    AccountDetail getAccount(String number);
    List<AccountSummary> getAccounts(String CPR);

    void transfer(long amount, String targetNumber);

    public static class AccountIdentifier {
        private final long id;

        public AccountIdentifier(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }
    }

    /**
     * Member details
     */
    public static class AccountDetail extends AccountIdentifier {
        private BankManager.BankSummary bank;
        private CustomerManager.CustomerSummary customer;
        private String number;
        private long balance;
        private List<MovementManager.MovementDetail> movements;

        public AccountDetail(long id, BankManager.BankSummary bank, CustomerManager.CustomerSummary customer, String number, long balance, List<MovementManager.MovementDetail> movements) {
            super(id);
            this.bank = bank;
            this.customer = customer;
            this.number = number;
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

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
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
        private String number;
        private long balance;

        public AccountSummary(long id, BankManager.BankSummary bank, String number, long balance) {
            super(id);
            this.bank = bank;
            this.number = number;
            this.balance = balance;
        }

        public BankManager.BankSummary getBank() {
            return bank;
        }

        public void setBank(BankManager.BankSummary bank) {
            this.bank = bank;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public long getBalance() {
            return balance;
        }

        public void setBalance(long balance) {
            this.balance = balance;
        }
    }

}
