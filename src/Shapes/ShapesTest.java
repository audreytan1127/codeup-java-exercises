package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5,8);
       double myShapePerimeter = myShape.getPerimeter();
        double myShapeArea = myShape.getArea();
        System.out.printf("This is the perimeter: %.2f.%nThis is the area: %.2f.%n", myShapePerimeter, myShapeArea);



        Measurable secondShape = new Square(7);
        double secondShapePerimeter = secondShape.getPerimeter();
        double secondShapeArea = secondShape.getArea();
        System.out.printf("This is the perimeter: %.2f.%nThis is the area: %.2f.%n", secondShapePerimeter, secondShapeArea);



    }
//        Rectangle box1 = new Rectangle(5, 4);
//        double box1Perimeter = box1.getPerimeter();
//        double box1Area = box1.getArea();
//        System.out.printf("The perimeter of this box is: %.2f.%nThe area of this box: %.2f.%n", box1Perimeter, box1Area);
//
//        Rectangle box2 = new Square(5);
//        double box2Perimeter = box2.getPerimeter();
//        double box2Area = box2.getArea();
//        System.out.printf("The perimeter of this box: %.2f.%nThe area of this box: %.2f.%n", box2Perimeter, box2Area);
//    }


}
