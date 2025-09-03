package school.sorokin.javacore.oop.types;

import school.sorokin.javacore.oop.intro.Car;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        double d = 5.3;
        boolean isHot = true;

        System.out.println("i = " + i + ", d = " + d + ", isHot = " + isHot);
        Car car = new Car();
        car.speed = 74;
        car.brand = "Tesla";
        System.out.println("car brand - " + car.brand + ", car speed - " + car.speed);

        car = null;
        System.out.println("after car=null: " + car);

        System.gc();
    }
}
