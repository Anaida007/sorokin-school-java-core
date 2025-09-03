package school.sorokin.javacore.oop.inheritance_and_polymorphism;

public class Square extends Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public int getRadius() {
        return side;
    }

    public void setRadius(int side) {
        this.side = side;
    }
}
