import java.util.Scanner;

public class MethodPractice {

    /*
        METHOD STRUCTURE...

        VISIBILITY_MODIFIER STATIC_OR_INSTANCE RETURN_TYPE METHOD_NAME(PARAM_DATATYPE PARAM, ...) {

            BODY OF METHOD HERE

        }

        For Example...

        public static void main(String[] args) {
            System.out.println("Hello World");
        }


     */

        // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)

        // no input or returned output

//    public static void sayGreeting() {
//        System.out.println("Hello");
//    }
//NEED TO CALL THE METHOD IN MAIN (can only have one main method)
//    public static void main(String[] args) {
////        Can sout the method call and will print whatever is in the return (if using return type)
//        sayGreeting();
//    }
        // no returned output with input

//    public static void sayInput(String input) {
//        System.out.println(input);
//    }

        // returned output without input

//    public static int returnSeven() {
//        return 7;
//    }

        // return output given an input

//    public static int returnInt(int someInt) {
//        return someInt;
//    }

        // multiple parameters

//    public static double returnProductOfThreeNums(double num1, double num2, double num3) {
//        return num1 * num2 * num3;
//    }


        // using a method inside another method

//    public static int returnSumOfInts(int intOne, int intTwo) {
//        return returnInt(intOne) + returnInt(intTwo);
//    }


        // return type different from input type

//    public static int returnLengthOfString(String input) {
//        return input.length();
//    }

        // multiple input types

//    public static String repeatStr(String str, int times) {
//        return str.repeat(times);
//    }

//    public static void printCharMultipleTimes(char c, int repetitions) {
//        System.out.println(String.valueOf(c).repeat(repetitions));
//    }


        /**
         * METHOD MINI-EXERCISES
         */

        // TODO: Write a method, returnName, that returns the string of your name.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(myName());
        System.out.println(returnLongerString("this is a long string.", "this is an even longer string!"));
        System.out.println(canBeHalved(16));
        System.out.println(addition(4, 5));
        System.out.println(subtraction(17, 4));
        System.out.println(multiplication(33, 2));
        System.out.println(division(333, 3));
        System.out.println(modulus(8, 6));
    }
    public static String myName(){
        String inputName = "Audrey Tan";
        return inputName;
    }

        // TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.

    public static String returnLongerString(String str1, String str2){
        if (str1.length() > str2.length()){
            return str1;
        }else{
            return str2;
        }
    }
        // TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
    public static boolean canBeHalved(int int1){
        if(int1%2==0){
            return true;
        }else{
            return false;
        }
    }

        // TODO: !! Complete math exercises from the curriculum !!
public static int addition(int int1, int int2){
        return int1 + int2;
}
public static int subtraction(int int1, int int2){
        return int1 - int2;
}
public static int multiplication (int int1, int int2){
        return int1 * int2;
}
public static int division (int int1, int int2){
        return int1 / int2;
}
public static int modulus (int int1, int int2){
        return int1 % int2;
}
        // ----------- OVERLOADING

    /*

        Method overloading is a way to define the same method with different method signatures.
        It is a convenience to prevent the programmer from having to create many more method names
        when defining functionality for various data type inputs.

        Much of the Java language is defined using overloaded methods (e.g. println())

     */

        // overloading example

//    public static void sayHello() {
//        System.out.println("Hello World");
//    }
//
//    public static void sayHello(int num) {
//        for (int i = 0; i < num; i += 1) {
//            sayHello();
//        }
//    }

        // Is this overloading???

//        public static String sayHello(int num) {
//            return "Hello World";
//        }

        // Is this overloading???

//        public static String sayHello(String punctuation) {
//            return "Hello World" + punctuation;
//        }



        /**
         * OVERLOAD MINI-EXERCISES
         */

        // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
        //  a greeting message to the user by either their first or first and last name.

        // example: sayName("Justin") - "Hi Justin"
        // example: sayName("Justin", "Reich") - "Hi Justin Reich"


        // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles



    }