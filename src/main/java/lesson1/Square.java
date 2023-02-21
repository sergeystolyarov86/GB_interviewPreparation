package lesson1;

public class Square extends Shape {
    double length = 15;

    @Override
    void perimeter() {
        System.out.println("Square perimeter "+length * 4);
    }
}
