package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
//        int radius = input.getInt();
        double radius = input.getDouble();
        Circle myCircle = new Circle(radius);

        System.out.println("The area of the circle is: " + myCircle.getArea() + " ft.");
        System.out.println("The circumference of the circle is: " + myCircle.getCircumference() + " ft.");
    }
}
