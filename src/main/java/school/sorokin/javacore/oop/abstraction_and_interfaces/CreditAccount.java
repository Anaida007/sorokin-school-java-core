package school.sorokin.javacore.oop.abstraction_and_interfaces;

public class CreditAccount extends Account implements Printable {

    private int limit = 0;

    public CreditAccount(){}

    public CreditAccount(int limit, int balance) {
        super(balance);
        this.limit = limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    @Override
    public void withdraw(int amount) {
        int newBalance = getBalance() - amount;
        if (newBalance >= limit) {
            setBalance(newBalance);
        } else {
            System.out.println("Ошибка при проведении операции. Превышен кредитный лимит");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Кредитный счёт:");
        System.out.println("Баланс: " + getBalance() + ", кредитный лимит: " + limit);
    }
}
