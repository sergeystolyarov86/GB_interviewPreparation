package lesson1;

public class Triangle extends Shape {
    double a = 4d;
    double b = 8.5d;
    double c = 6.35d;

    @Override
    void perimeter() {
        System.out.println("Triangle perimeter "+a + b + c);
    }
}
