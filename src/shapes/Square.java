package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

//    private int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public int getPerimeter() {
//        return (4 * side);
//    }
//
//    public int getArea() {
//        return (side * side);
//    }
}
