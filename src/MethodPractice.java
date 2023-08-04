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
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(myName());
//        System.out.println(returnLongerString("this is a long string.", "this is an even longer string!"));
//        System.out.println(canBeHalved(16));
//        System.out.println(addition(4, 5));
//        System.out.println(subtraction(17, 4));
//        System.out.println(multiplication(33, 2));
//        System.out.println(division(333, 3));
//        System.out.println(modulus(8, 6));
//    }
//    public static String myName(){
//        String inputName = "Audrey Tan";
//        return inputName;
//    }

    // TODO: Write a method, returnLongerString, that takes in two strings and returns the longer of the two strings.

//    public static String returnLongerString(String str1, String str2){
////        if (str1.length() >= str2.length()){
////            return str1;
////        }else{
////            return str2;
////        }

////        TERNARY OPERATOR EXAMPLE
//        return (str1.length() >= str2.length()) ? str1 : str2;
//    }

    // TODO: Write a method, canBeHalved, that takes in an integer and returns true if the input integer is evenly divisible by two.
//    public static boolean canBeHalved(int int1){
//        if(int1%2==0){
//            return true;
//        }else{
//            return false;
//        }

//  //      ANOTHER SOLUTION
//        boolean intIsEven = int1 % 2 == 0;
//        return intIsEven;

// //       EASY ONE LINE SOLUTION
//        return int1 % 2 == 0;
//    }

    // TODO: !! Complete math exercises from the curriculum !!
//public static int addition (int int1, int int2){
//        return int1 + int2;
//}
//public static int subtraction (int int1, int int2){
//        return int1 - int2;
//}
//public static int multiplication (int int1, int int2){
//        return int1 * int2;
//}
//public static double division (double int1, double int2){
//        return int1 / int2;
//}
//public static int modulus (int int1, int int2){
//        return int1 % int2;
//}

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
     *
     * @return
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"
//    public static void sayName(){
//        String name = "Audrey Tan";
//        System.out.println(name);
//    }
//    public static String sayName(int number){
//       return "Audrey Tan"; //will not print when ran, but is considered overloading because same method name, different parameters.
//    }
//
//    public static void main(String[] args) {
////        sayName();
//        sayName(5);
//    }

    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles
//public static int addition (int int1, int int2){
//        return int1 + int2;
//}
//public static double addition(double double1, double double2){
//        return double1 + double2;
//}
//public static int subtraction (int int1, int int2){
//        return int1 - int2;
//}
//public static double subtraction (double double1, double double2){
//        return double1 - double2;
//}
//public static int multiplication (int int1, int int2){
//        return int1 * int2;
//}
//public static double multiplication (double double1, double double2){
//        return double1 * double2;
//}
//public static double division (double double1, double double2){
//        return double1 / double2;
//}
//public static int division (int int1, int int2){
//        return int1 / int2;
//}
//public static int modulus (int int1, int int2){
//        return int1 % int2;
//}
//public static double modulus (double double1, double double2){
//        return double1 % double2;
//}

//    EXERCISE 2
//    Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.

//    (min range, max range)
//    public static int getInteger(int min, int max){
//
////        Looking for user input
//        Scanner scan = new Scanner(System.in);
//
////        Set the user input to 0, so it can be replaced when scanning in loop
//        int input = 0;
//
//        do{
////            Ask the user to for an integer within range
//            System.out.println("Please enter an integer between " + min + " and " + max +".");
//
////            Reformat the input variable to what the user inputs in command line
//            input = scan.nextInt();
//
//// If this condition is true, the function do functionality will continue
//        }while(!isInRange(input, min, max));
//
//// If the condition is not met, the user will break out of the loop and user input will be returned.
//        return input;
//    }
//
////    Create a new method to find out whether the user input is within a certain range.
//public static boolean isInRange(int num, int min, int max){
//
////        return true or false whether the integer that the user inputs is within min and max.
//        return num <= max && num >= min;
//}

//        //EXERCISE 2 GET INTEGER
//        // Call the function and place integer range within (min, max).
//        System.out.println("Your number is " + getInteger(1, 10));


//    EXERCISE 3
//FACTORIAL: continue only with user verification, use for loop, verify integer is between 1 and 10, display factorial entered by user as long type.
//    public static void main(String[] args) {
//
////        FACTORIAL EXERCISE
    // //Set the variable quit to false so that the function will run at least once to ask the user for an integer.
//        boolean quit = false;

// // While the variable quit is false,
//        while(!quit){

//    // Will ask the user for an integer between the (min, max)
//        int factorial = getInteger(1,10);

//    //The command line will print the integer the user chose, and the factorial value
//            System.out.println("The factorial of " + factorial + " is " + getFactorial(factorial));

//    //Will prompt for the user confirmation whether the want to continue.
//            System.out.println("Do you want to continue?");

//    //Will call the method quit and set equal to true or false (If false, will ask user for another integer)
//            quit = quit();
//        }
//
//    }
//    // Quit method returns a boolean (true or false)
//public static boolean quit(){
//        Scanner scanner = new Scanner(System.in);

//    // Will store user's confirmation into input variable
//        String input = scanner.nextLine();
//    // Will return the first character the user inputs, if not equal to y: will return true and quit out of program.
//        return  Character.toLowerCase(input.charAt(0)) != 'y';
//        }
//

//    //getFactorial method wil return a long and takes in int
//    public static long getFactorial(int factorial) {

//    //sets factorial to 1 (cannot be 0 or else all answers will be 0)
//        long result = 1;

//    //create a for loop to go through all the numbers up to the user input number.
//        for (int i=1; i<=factorial ; i++){

//    //Will multiply all numbers leading up to user number and stores it in variable called result.
//            result *= i;
//        }

//    // will return the result (the product of the factorial)
//        return result;
//    }

//    // EXERCISE 4
//    // DICE ROLLING
//    // Ask user for number of sides on dice
//    // Roll 2 of those dice
//    //static methods to choose random number within range (Math.random)

//    public static int userInputSidesOfDice() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter how many sides you would like on your pair of dice.");
//        int userAmountOfSides = scanner.nextInt();
//        return userAmountOfSides;
//    }
//public static String userConfirmRollDice(){
//        Scanner scanForConfirm = new Scanner(System.in);
//        String userConfirmation;
//    do{
//    System.out.println("Would you like to roll this pair of dice?[y/n]");
//    userConfirmation = scanForConfirm.next();
//    if(userConfirmation.equalsIgnoreCase("y")) {
//
//
//    }
//    }
//
//}
//public static void rollDice(int userAmountOfSides){
//    int min = 1;
//    int max = userInputSidesOfDice();
//    int range = max - min +1;
//    int randomNumber;
//    for(int i=0; i< 10; i++){
//        randomNumber = (int) Math.random()*range +min;
//    }
//}
//    public static void main(String[] args) {
//        System.out.println(userInputSidesOfDice());
//
//    }



}