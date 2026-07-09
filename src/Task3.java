//09/7/26  CO3

// Superclass
class BankAccount {
    // Private data members
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccount() {
        System.out.println("Account Details");
        System.out.println("---------------");
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Balance        : " + getBalance());
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Calculate interest
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Display savings account details
    public void displaySavingsAccount() {
        System.out.println("\nInterest Rate  : " + interestRate + "%");
        System.out.println("\nInterest Earned : " + calculateInterest());
    }
}

// Main class
public class Task3 {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(100245, 50000.0, 5);

        account.displayAccount();
        account.displaySavingsAccount();
    }
}