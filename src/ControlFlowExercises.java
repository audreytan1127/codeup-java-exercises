import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        // Create new scanner to scan for user input in run terminal
        Scanner scanner = new Scanner(System.in);

//  EXERCISE 1A
//        int i = 5;
//        while(i<= 15) {
//            System.out.println(i);
//            i++;
//        }
//  EXERCISE 1B
//        int i = 0;
//        do {
//            i += 2;
//            System.out.println(i);
//        } while (i < 100);

//        int i = 100;
//        do {
//            i-=5;
//            System.out.println(i);
//        } while (i>-10);

//        Have to change data type so that a i going up to 1 million would fit.
//        long i = 2;
//        do{
//            System.out.println(i);
//            i*=i;
//        }while(i<1000000);

//  EXERCISE 1A WITH FOR LOOP
//        for(int i=5; i<=15; i++){
//            System.out.println(i);
//        }

//  EXERCISES 1B WITH FOR LOOP
//        for(int i=0; i<=100; i+=2){
//            System.out.println(i);
//        }

//        for(int i=100; i>=-10; i-=5){
//            System.out.println(i);
//        }

//        for(long i=2; i<1000000; i*=i){
//            System.out.println(i);
//        }

//  EXERCISE 2 FIZZBUZZ
//        for(int i=0;i<100;i++){
//            if(i%3==0 && i%5==0){
//                System.out.println("FizzBuzz");
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//            } else if (i%3==0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

//  EXERCISE 3 TABLE OF POWERS
//        // Declaring the toContinue variable to "y" will get the loop to start once, like a do-while loop
        //  String toContinue = "y";
//        // prints what the user should enter
//        System.out.println("Please enter an integer to count up to.");
//        // scans for the user input and store into variable with data type int
//        int userInputInteger = scanner.nextInt();
//        // prints top of chart
//            System.out.println("  number   | squared |   cubed  ");
//        // prints separation of titles and values
//            System.out.println("-----------|---------|-----------");
//        // for loop to iterate through to the user input integer and apply arithmetic to integers
//        for(int i = 1; i<=userInputInteger; i++){
//        // runs square and and cube functions on integer
//        int userInputSquared = i*i;
//        int userInputCubed = i*i*i;
//        // displays the integers iterated through and the values of their square and cube.
//        // souf + tab will allow for formatting, %d = print integers
//        // %n is line break in souf
//        // After the end quote, break with comma and place the variables you want to print, respectively.
//            System.out.printf("  %d        | %d       | %d       %n", i, userInputSquared, userInputCubed);
//        }
//        // Ask the user if they would like to another integer to iterate through
//        System.out.println("would you like to continue? (y/n)");
//        // calls the first String toContinue and set equal to the user answer
//        toContinue = scanner.next();
//        // Acts like line break or else it would print on the same line as user answer
//        System.out.println();

//  EXERCISE 4 CHANGE TO LETTER GRADE
        String userConfirmation = "y";
       while(userConfirmation.equalsIgnoreCase("y")){
        System.out.println("Enter a grade between 0 and 100.");
        int userGrade = scanner.nextInt();
           if(userGrade >= 97 && userGrade <=100){
           System.out.println("Your letter grade is an A+.");
       } else if (userGrade >= 93 && userGrade <= 96) {
           System.out.println("Your letter grade is a A.");
       } else if (userGrade >= 90 && userGrade <= 92) {
           System.out.println("Your letter grade is a A-.");
       } else if (userGrade >= 87 && userGrade <= 89) {
           System.out.println("Your letter grade is a B+.");
       } else if (userGrade >= 83 && userGrade <= 86) {
           System.out.println("Your letter grade is a B.");
       } else if (userGrade >= 80 && userGrade <= 82) {
               System.out.println("Your letter grade is a B-.");
           } else if (userGrade >= 77 && userGrade <= 79) {
               System.out.println("Your letter grade is a C-.");
           } else if (userGrade >= 73 && userGrade <= 76) {
               System.out.println("Your letter grade is a C.");
           } else if (userGrade >= 70 && userGrade <= 72) {
               System.out.println("Your letter grade is a C-.");
           } else if (userGrade >= 67 && userGrade <= 69) {
               System.out.println("Your letter grade is a D+.");
           } else if (userGrade >= 65 && userGrade <= 66) {
               System.out.println("Your letter grade is a D.");
           } else if (userGrade >= 60 && userGrade <= 64) {
               System.out.println("Your letter grade is a D-.");
           } else if (userGrade <= 59) {
               System.out.println("Your letter grade is F.");
           } else{
           System.out.println("Please enter a valid numerical integer between 0 and 100");
       }

        System.out.println("Would you like to continue converting your numerical grades to letter grades? (Y/N)");
         userConfirmation = scanner.next();
         System.out.println();
       }
    }
}
