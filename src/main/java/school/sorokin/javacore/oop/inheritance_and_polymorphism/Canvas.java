package school.sorokin.javacore.oop.inheritance_and_polymorphism;

public class Canvas {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Square(4), new Triangle(3, 4, 5)};

        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area for this shape: " + shape.calculateArea());
        }
    }
}
