import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Ask a question for user to answer
//        System.out.println("What is your name?");
//
////        Gets only the first word of the user input
////        String userInput = sc.next();
//
////        Gets the whole line that the user inputs
//        String usersInput = sc.nextLine();
//
////        To get number from user
//        int userNumber = sc.nextInt();
//
////        System.out.println("Your name is " + usersInput);
//
////        Like template literals, where %s is the placeholder for a variable that has been declared.
//        System.out.printf("Users name is %s", usersInput);

        //START INDEPENDENT EXERCISE AND CLASS WALK THRU

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f. %n", pi);
//
//        System.out.println("Please enter an integer.");
//        int userInputNumber = sc.nextInt();
//        System.out.printf("Your number is %d %n", userInputNumber);
//        Get a runtime error if anything but integer is given.


//        System.out.println("Enter a sentence.");
//        sc.nextLine();
//        String userSentence = sc.nextLine();
//        System.out.printf("Your sentence: %s", userSentence);

//        System.out.println("Enter a word.");
//        String firstWord = sc.next();
//        System.out.println("Enter another word.");
////        When using .next() or .nextInt(), it will skip the following .nextLine() that is called
////        so to consume the auto entered empty string, put sc.nextLine();
//        sc.nextLine();
//        String secondWord = sc.nextLine();
//        System.out.println("Enter a third word.");
//        String thirdWord = sc.nextLine();
//        System.out.printf("First word: %s, %n Second word: %s, %n Third word: %s, %n", firstWord, secondWord, thirdWord);

//        CLASS WALK THRU
//        System.out.println("Enter three words, separated by spaces.");
//        String userWordOne = sc.next();
//        String userWordTwo = sc.next();
//        String userWordThree = sc.next();
//        System.out.println(userWordOne);
//        System.out.println(userWordTwo);
//        System.out.println(userWordThree);

////        Not all words will be captured with the next() method. Will only capture until first white space.
////        Using .nextLine() will give the whole sentence that the user typed in.
//        System.out.println("Please enter a sentence.");
//        String userSentence = sc.next(); // Will NOT work.
//        String printsWholeSentence = sc.nextLine(); //WILL print everything until next line break.
//        System.out.println(userSentence);

        System.out.println("What is the width of the room?");
        String userInputWidth = sc.nextLine();
        int userParseWidth = Integer.parseInt(userInputWidth);

        System.out.println("What is the length of the room?");
        String userInputLength = sc.nextLine();
        int userParseLength = Integer.parseInt(userInputLength);

        int userPerimeter = userParseLength*2 + userParseWidth*2;
        System.out.printf("This is the perimeter = %d. %n", userPerimeter);
        int userArea = userParseLength * userParseWidth;
        System.out.printf("This is the area = %d. %n", userArea);

//        double volume = length * width * height
//        double userLength = sc.nextDouble();
//        double userWidth = Double.parseDouble(sc.nextLine());
//        System.out.println("What is the height of the room?");
//        double userHeight = sc.nextDouble();
//        double area = userWidth * userLength;
//        double perimeter = (length*2) + (width*2);

    }

}
