package Shapes;
// // The circle class resides in a package (folder) called Shapes

// // Create class Circle (a new file in Shapes folder)
//// Make it accessible to outside of the file and the package by declaring public
public class Circle {
//    // Create a radius field
//    // make it private so that it cannot be changed once it has been set
//    // make it double so that deicmal points are accepted.
    private double radius;

//    // Not necessary but store Pi into a constant = final
//    // Import Math.PI
//    // double because it has many decimal points
    public static final double PI = Math.PI;

//    // Create method of circle to take parameter with data type double called radius
    public Circle(double radius){
//        // when radius is passed as argument when declaring this method, the radius of the circle will be set
//        // equal to argument value
        this.radius = radius;
    }

//    //Create method to get the area of the circle
//    // set it to return data type double
    public double getArea(){
//        // store area in double data type called area
//        // set it equal to pi * r^2
        double area = PI * (radius * radius);
//        // return the stored double value
        return area;
    }

//    // Create method to get the circumference of the circle
//    // set it to return data type double
    public double getCircumference(){
//        // store circumference in double data type called circumference
//        // set it equal to 2*pi*r
        double circumference = 2 * PI * radius;
//        // method needs to return double, so return variable circumference.
        return circumference;
    }


}

