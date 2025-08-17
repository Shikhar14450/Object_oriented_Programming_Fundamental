
// Access Modifiers - BankAccount
class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accNo, String holder, double balance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance.");
    }

    public double getBalance() {
        return balance;
    }
}
