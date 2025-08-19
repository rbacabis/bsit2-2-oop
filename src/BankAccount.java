public class BankAccount {

    static String bankName = "Liceo Bank";
    static double interestRate = 0.03;
    static int totalAccounts = 0;
    private static int nextAccountId = 1;


    private String accountNumber;
    private String accountHolderName;
    private double balance;


    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;

        System.out.printf("Account Created: %s for %s with initial balance: $%.1f%n",
                accountNumber, accountHolderName, initialBalance);
    }


    public static String generateAccountNumber() {
        return String.format("ACC%03d", nextAccountId++);
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("%s deposited $%.1f. New balance: $%.1f%n",
                    accountHolderName, amount, balance);
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("%s withdrew $%.1f. New balance: $%.1f%n",
                    accountHolderName, amount, balance);
        }
    }


    public double calculateInterest() {
        return balance * interestRate;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }
}