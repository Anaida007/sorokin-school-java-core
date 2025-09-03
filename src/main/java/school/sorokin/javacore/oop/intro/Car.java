package school.sorokin.javacore.oop.intro;

public class Car {

    public String brand;

    public int speed;

    public void accelerate() {
        speed = speed + 10;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("it's finalize method");
        super.finalize();
    }
}
