package Shapes;

import util.Input;

public class CircleApp {

    static Input userInput = new Input();
    public static void main(String[] args) {
        System.out.println("Please enter the radius of your circle.");
        double userRadius = userInput.getDouble();
        Circle firstCircle = new Circle(userRadius);
        double firstCircleArea = firstCircle.getArea();
        double firstCircleCircumference = firstCircle.getCircumference();
        System.out.printf("Your circle's area = %.2f.%n Your circle's circumference = %.2f.%n", firstCircleArea, firstCircleCircumference);

    }
}
