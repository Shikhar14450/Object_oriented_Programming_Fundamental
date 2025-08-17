
// Access Modifiers - SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, String holder, double balance, double interestRate) {
        super(accNo, holder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Savings Account - AccNo: " + accountNumber +
                ", Holder: " + accountHolder + ", Balance: " + getBalance() + ", Rate: " + interestRate);
    }
}
