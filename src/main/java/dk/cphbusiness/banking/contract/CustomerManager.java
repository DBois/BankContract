package dk.cphbusiness.banking.contract;

import java.util.List;

public interface CustomerManager {
    // TODO: Change Throw exception to custom exceptions
    CustomerDetail getCustomer(String cpr) throws Exception;


    public static class CustomerIdentifier {
        private final String cpr;

        public CustomerIdentifier(String cpr) {
            this.cpr = cpr;
        }

        public String getCpr() {
            return cpr;
        }

    }

    /**
     * Member details
     */
    public static class CustomerDetail extends CustomerIdentifier {
        private String name;
        private List<String> accountNumbers;

        public CustomerDetail(String cpr, String name, List<String> accountNumbers) {
            super(cpr);
            this.name = name;
            this.accountNumbers = accountNumbers;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
        private String name;

        public CustomerSummary(String cpr, String name) {
            super(cpr);
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
