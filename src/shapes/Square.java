package shapes;

public class Square extends Quadrilateral{
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
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
