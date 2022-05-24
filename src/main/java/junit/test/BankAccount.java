package junit.test;

public class BankAccount {
    
    private String accountHolderName;
    private double accountBalance;

    public BankAccount (String name, double balance) {
        this.accountHolderName = name;
        this.accountBalance = balance;
    }

    public double deposit(double amount) {
        System.out.println(accountHolderName + " deposited $" + amount);
        return accountBalance += amount;
    }

    public double withdrawal(double amount) {
        return accountBalance -= amount;
    }

    public String getAccountInfo() {
        return accountHolderName + "'s account balance: $" + accountBalance;
    }
}
