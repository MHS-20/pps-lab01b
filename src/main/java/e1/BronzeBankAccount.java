package e1;

public class BronzeBankAccount {

    private BankAccount base;

    public BronzeBankAccount(BankAccount ba){
        this.base = ba;
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

        if(amount > 100 )
            base.withdraw(amount + 1);
        else
            base.withdraw(amount);
    }

}
