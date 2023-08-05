package Shapes;

public class Circle {
    private double radius;

    public static final double PI = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = PI * (radius * radius);
        return area;
    }
    public double getCircumference(){
        double circumference = 2 * PI * radius;
        return circumference;
    }


}

