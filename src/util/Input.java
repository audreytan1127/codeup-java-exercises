package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    String getString() {
        return scanner.nextLine();
    }

    boolean yesNo() {
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {
            System.out.println("Yes");
            return true;
        } else {
            System.out.println("No");
            return false;
        }
    }



    int getInt(int min, int max) {
        System.out.printf("Please enter an integer between %d and %d.%n", min, max);
        int userIntInput;
            userIntInput = scanner.nextInt();
        if (userIntInput >= min && userIntInput <= max) {
            return userIntInput;
        } else {
          while(userIntInput < min || userIntInput > max) {
              System.out.printf("Please enter a valid integer between the range %d to %d.%n", min, max);
              userIntInput = scanner.nextInt();
          }
            return userIntInput;
        }
    }

    int getInt() {
        int userIntInput = scanner.nextInt();
        return userIntInput;
    }

    double getDouble(double minimum, double maximum) {
        System.out.printf("Please enter a number between %.2f and %.2f.%n", minimum, maximum);
        double userInput;
        userInput = scanner.nextDouble();
        if (userInput >=  minimum && userInput <= maximum) {
            return userInput;
        } else {
            while(userInput < minimum || userInput > maximum) {
                System.out.printf("Please enter a valid integer between the range %.2f to %.2f.%n", minimum, maximum);
                userInput = scanner.nextDouble();
            }
            return userInput;
        }
    }

    double getDouble() {
        double userDoubleInput = scanner.nextDouble();
        return userDoubleInput;
    }

}



