package school.sorokin.javacore.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.setYear(2020);
        tesla.setModel("2.4");
        tesla.setBrand("Tesla");

        Car bmw = new Car();
        bmw.setYear(2025);
        bmw.setModel("iX2");
        bmw.setModel("BMW");

        System.out.println(tesla);
        System.out.println(bmw);

        tesla.setYear(102);
        System.out.println(tesla);
    }
}
