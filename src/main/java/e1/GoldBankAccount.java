package e1;

public class GoldBankAccount implements BankAccount {

    private BankAccount base;

    public GoldBankAccount(BankAccount ba) {
        this.base = ba;
    }

    public int getBalance() {
        return base.getBalance();
    }

    public void deposit(int amount) {
        base.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() + 500 < amount)
            throw new IllegalStateException();
        base.withdraw(amount);
    }
}