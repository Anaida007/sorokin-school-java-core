package school.sorokin.javacore.oop.abstraction_and_interfaces;

public class SavingAccount extends Account implements Printable{

    public SavingAccount() {}

    public SavingAccount(int balance) {
        super(balance);
    }
    @Override
    public void withdraw(int amount) {
        int newBalance = getBalance() - amount;
        if (newBalance >=0) {
            setBalance(newBalance);
        } else {
            System.out.println("Ошибка при проведении операции. Недостаточно средств на счёте");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Сберегательный счёт:");
        System.out.println("Баланс: " + getBalance());
    }
}
