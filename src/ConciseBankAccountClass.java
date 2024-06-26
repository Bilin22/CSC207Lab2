public class ConciseBankAccountClass {
    private String accountHolderName;
    private int originalDeposit;

    /**
     * Set inputs to corresponding attributes.
     *
     * @param accountHolderName
     * @param originalDeposit
     */


    public ConciseBankAccountClass(String accountHolderName, int originalDeposit) {
        this.accountHolderName = accountHolderName;
        this.originalDeposit = originalDeposit;
    }

    /**
     * Implement this toString method and return a String with the
     * following format:
     * "This is a bank account held by <accountHolderName> with <originalDeposit> dollar original deposit!"
     *
     * @return A string representation of the bank account.
     */
    @Override
    public String toString() {
        return "This is a bank account held by " + this.accountHolderName + " with " + this.originalDeposit + " dollar original deposit!";

    }

    public static void main(String[] args) {
        ConciseBankAccountClass bankAccount = new ConciseBankAccountClass("Jack", 10000);
//        System.out.println(bankAccount.toString());
        System.out.println(bankAccount.toString());

    }
}

