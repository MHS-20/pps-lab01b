package e1;

public class SilverBankAccount extends AbstractBankAccount{

    private BankAccount base;

    public SilverBankAccount(BankAccount ba){
        super(ba);
    }

    public int getBalance() {
        return base.getBalance();
    }

    public void deposit(int amount) {
        base.deposit(amount);
    }

    public void withdraw(int amount) {
        if (this.getBalance() < amount){
            throw new IllegalStateException();
        }
        base.withdraw(amount + 1);
    }
}
