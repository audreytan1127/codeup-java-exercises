package Shapes;

public class Square extends Quadrilateral {
    private double side;
//        private double side;

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
    public void setLength(double length) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        this.side = side;
    }
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }

//public double getArea(){
//        double area = side * side;
//        return area;
//}
//
//public double getPerimeter(){
//        double perimeter = 4 * side;
//        return perimeter;
//}


}
