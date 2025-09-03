package school.sorokin.javacore.oop.abstraction_and_interfaces;

public class Main {

    public static void main(String[] args) {
        Account savingAccount1 = new SavingAccount(100);
        SavingAccount savingAccount2 = new SavingAccount(100);

        Account creditAccount1 = new CreditAccount(100, 50);
        CreditAccount creditAccount2 = new CreditAccount(100, 50);

        savingAccount1.deposit(100);
        savingAccount1.withdraw(150);
        savingAccount1.withdraw(150);
        savingAccount2.deposit(30);
        savingAccount2.withdraw(200);
        savingAccount2.printInfo();

        creditAccount1.deposit(100);
        creditAccount1.withdraw(150);
        creditAccount1.withdraw(150);
        creditAccount2.deposit(30);
        creditAccount2.withdraw(200);
        creditAccount2.printInfo();


    }
}
