// Problem 8: Bank Account Types (Hierarchical Inheritance)
// Base: BankAccount -> SavingsAccount / CheckingAccount / FixedDepositAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override public void displayAccountType() {
        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override public void displayAccountType() {
        System.out.println("Checking Account | Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int termMonths;
    public FixedDepositAccount(String accountNumber, double balance, int termMonths) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
    }
    @Override public void displayAccountType() {
        System.out.println("Fixed Deposit Account | Term: " + termMonths + " months");
    }
}

public class BankAccountsHierarchical {
    public static void main(String[] args) {
        BankAccount[] accounts = {
            new SavingsAccount("SA-101", 10000, 4.5),
            new CheckingAccount("CA-202", 5000, 20000),
            new FixedDepositAccount("FD-303", 250000, 12)
        };
        for (BankAccount b : accounts) b.displayAccountType();
    }
}
