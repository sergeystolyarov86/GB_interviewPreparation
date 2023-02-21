package lesson1;

public class Circle extends Shape {
    double radius = 5.4d;
    double pi = 3.14d;

    @Override
    void perimeter() {
        System.out.println("Circle perimeter " + 2 * pi * radius);
    }
}
