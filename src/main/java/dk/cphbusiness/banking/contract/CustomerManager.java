package dk.cphbusiness.banking.contract;

import java.util.List;

public interface CustomerManager {
    CustomerDetail getCustomer(String cpr);


    public static class CustomerIdentifier {
        private final long id;

        public CustomerIdentifier(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

    }

    /**
     * Member details
     */
    public static class CustomerDetail extends CustomerIdentifier {
        private String cpr, name;
        private BankManager.BankSummary bank;
        private List<String> accountNumbers;

        public CustomerDetail(long id, String cpr, String name, BankManager.BankSummary bank, List<String> accountNumbers) {
            super(id);
            this.cpr = cpr;
            this.name = name;
            this.bank = bank;
            this.accountNumbers = accountNumbers;
        }

        public String getCpr() {
            return cpr;
        }

        public void setCpr(String cpr) {
            this.cpr = cpr;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BankManager.BankSummary getBank() {
            return bank;
        }

        public void setBank(BankManager.BankSummary bank) {
            this.bank = bank;
        }

        public List<String> getAccountNumbers() {
            return accountNumbers;
        }

        public void setAccountNumbers(List<String> accountNumbers) {
            this.accountNumbers = accountNumbers;
        }
    }

    /**
     * Member summary
     */
    public static class CustomerSummary extends CustomerIdentifier {
        private String cpr, name;
        private BankManager.BankSummary bank;

        public CustomerSummary(long id, String cpr, String name, BankManager.BankSummary bank) {
            super(id);
            this.cpr = cpr;
            this.name = name;
            this.bank = bank;
        }

        public String getCpr() {
            return cpr;
        }

        public void setCpr(String cpr) {
            this.cpr = cpr;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BankManager.BankSummary getBank() {
            return bank;
        }

        public void setBank(BankManager.BankSummary bank) {
            this.bank = bank;
        }
    }
}
