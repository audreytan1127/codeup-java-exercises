package Shapes;
//// This file resides in Shapes package (folder)
import util.Input;
// // to complete second part of exercise, Input class needs to be imported from util package.

// // create new class (file) called CircleApp
public class CircleApp {

//    // Call the Input class put into variable so it can be called easily.

//    // Just to test, put all of the calls to Circle class in psvm
//    //Move the variables out of main and leave souts when done testing.
    public static void main(String[] args) {
     Input userInput = new Input();
//        // Ask user for the radius of the circle
       do {
            System.out.println("Please enter the radius of your circle.");
//        // create variable to store the users input for the radius
//        // use Input class and get Double value
            double userRadius = userInput.getDouble();
//        // Create new circle by calling Circle class
//        // give the new circle the name of firstCircle
//        // set it equal to a new Circle with the parameter of the users input radius value.
            Circle firstCircle = new Circle(userRadius);
//        // set area variable of firstCircle equal to the firstCircle's area
//        // get area by calling getArea() method from Circle class (file)
            double firstCircleArea = firstCircle.getArea();
//        // set circumference variable of firstCircle equal to the firstCircle's circumference
//        // get circumference by calling getCircumference() method from Circle class (file)
            double firstCircleCircumference = firstCircle.getCircumference();
//        // Sout the area and circle with restricted decimal places
            System.out.printf("Your circle's area = %.2f.%n Your circle's circumference = %.2f.%n", firstCircleArea, firstCircleCircumference);
        } while(userInput.yesNo("Would you like to make another circle? [y/n]"));
    }
}
