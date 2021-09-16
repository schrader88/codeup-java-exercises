package shapes;

import java.security.MessageDigest;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };

        Square square = new Square();
        Rectangle rectangle = new Rectangle();
    }
}
