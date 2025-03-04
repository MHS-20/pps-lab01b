package e1;

public class GoldBankAccount extends AbstractBankAccount {

    private BankAccount base;

    public GoldBankAccount(BankAccount ba) {
       super(ba);
        // this.base = ba;
    }

    public void withdraw(int amount) {
        if (this.getBalance() + 500 < amount)
            throw new IllegalStateException();
        base.withdraw(amount);
    }
}