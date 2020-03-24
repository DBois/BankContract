package dk.cphbusiness.banking.contract;

import java.util.HashMap;
import java.util.Map;

public interface BankManager {


    public static class BankIdentifier {
        private final long id;

        public BankIdentifier(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

    }

    /**
     * Member details
     */
    public static class BankDetail extends BankIdentifier {
        private Map<String, AccountManager.AccountSummary> accounts = new HashMap<>();
        private Map<String, CustomerManager.CustomerSummary> customers = new HashMap<>();
        private String name;

        public BankDetail(long id, Map<String, AccountManager.AccountSummary> accounts, Map<String, CustomerManager.CustomerSummary> customers, String name) {
            super(id);
            this.accounts = accounts;
            this.customers = customers;
            this.name = name;
        }

        public Map<String, AccountManager.AccountSummary> getAccounts() {
            return accounts;
        }

        public void setAccounts(Map<String, AccountManager.AccountSummary> accounts) {
            this.accounts = accounts;
        }

        public Map<String, CustomerManager.CustomerSummary> getCustomers() {
            return customers;
        }

        public void setCustomers(Map<String, CustomerManager.CustomerSummary> customers) {
            this.customers = customers;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * Member summary
     */
    public static class BankSummary extends BankIdentifier {
        private String name;

        public BankSummary(long id, String name) {
            super(id);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
