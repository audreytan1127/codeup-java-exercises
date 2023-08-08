package Shapes;

public class Rectangle {

    protected double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getArea(){
        double area = length * width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = (2*length) + (2*width);
        return perimeter;
    }

}
