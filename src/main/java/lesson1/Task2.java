package lesson1;

public class Task2 {
//    interface Moveable {
//        void move();
//    }
//    interface Stopable {
//        void stop();
//    }
//    abstract class Car {
//        public Engine engine;                     - сделать поле private
//        private String color;
//        private String name;
//        protected void start() {                   - можно расширить видимость метода до public или вообще сделать
//                                                       abstract,чтобы логику реализовали наследники
//            System.out.println("Car starting");
//        }
//        abstract void open();
//        public Engine getEngine() {
//            return engine;
//        }
//        public void setEngine(Engine engine) {
//            this.engine = engine;
//        }
//        public String getColor() {
//            return color;
//        }
//        public void setColor(String color) {
//            this.color = color;
//        }
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//}
//}
//   class LightWeightCar extends Car implements Moveable {
//    @Override
//    void open() {
//        System.out.println("Car is open");
//    }
//    @Override
//    public void move() {
//        System.out.println("Car is moving");
//    }
//}
//  class Lorry extends Car, Moveable, Stopable {           -Stopable должен быть implement
//                                                          нет реализации open от Car
//    public void move(){
//        System.out.println("Car is moving");
//    }
//    public void stop(){
//        System.out.println("Car is stop");
// }
    /** Для оптимизации кода я бы вообще убрал интерфейсы и их методы отдал в класс Car сделав их abstract.
     *  По логике любая машина движется, останавливается и стартует, а наследники уже эту логику у себя реализуют
     *  по своему.
     * */
}
