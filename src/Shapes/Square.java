package Shapes;

public class Square extends Rectangle{
        private double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

public double getArea(){
        double area = side * side;
        return area;
}

public double getPerimeter(){
        double perimeter = 4 * side;
        return perimeter;
}


}
