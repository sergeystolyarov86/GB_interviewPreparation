package lesson1;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        // сделал билдер без проверок на валидность
        Person person = new Person.PersonBuilder().firstName("John").age(29).build();
        System.out.println(person);


        List<Shape> shapeList = List.of(new Triangle(),new Square(),new Circle());
        shapeList.forEach(Shape::perimeter);
    }
}
