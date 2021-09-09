import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
//        Addition(5, 10);
//        Subtraction(10, 5);
//        Multiplication(10, 5);
//        Division(10, 5);
//        Modulus(10, 5);
//        getInteger(1, 10);
//        getFactorial();
        diceRoll();
    }

    public static void Addition(int number, int numberTwo) {
        System.out.println(number + numberTwo);
    }

    public static void Subtraction(int number, int numberTwo) {
        System.out.println(number - numberTwo);
    }

    public static void Multiplication(int number, int numberTwo) {
        // Below is simple multiplication with the "*" operator:

//        System.out.println(number * numberTwo);

        // Below is refactored without the "*" operator (in a For loop):

        int userNumber = number;
        for (int i = 1; i < numberTwo; ++i) {
            number += userNumber;
        }
        System.out.println(number);

        // Below is refactored without the "*" operator (with recursion):

        // USE RECURSION HERE!!
    }

    public static void Division(int number, int numberTwo) {
        System.out.println(number / numberTwo);
    }

    public static void Modulus(int number, int numberTwo) {
        System.out.println(number % numberTwo);
    }

    // Method below is using a do-while loop with an embedded conditional:

//    public static void getInteger() {
//        int userNumber;
//
//        do {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter a number between 1 and 10: ");
//            userNumber = scanner.nextInt();
//
//            if (userNumber > 10) {
//                System.out.println("That number is too high!");
//            } else if (userNumber < 1) {
//                System.out.println("That number is too low!");
//            } else {
//                System.out.println("Nice! The number you chose was " + userNumber + ", which is between 1 and 10!");
//            }
//        } while (userNumber > 10 || userNumber < 1);
//    }

    // Refactoring above method below. Using recursion:

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();

        if (userInput > min && userInput < max) {
            System.out.println("Nice! " + userInput + " is between 1 and 10.");
            return userInput;
        }

        System.out.println(userInput + " is not in between 1 and 10.");
        return getInteger(1, 10);
    }

    // Will refactor to use recursion.

    public static void getFactorial() {
        Scanner scanner = new Scanner(System.in);

        String userContinue = "";

        do {

            // Changed the max to 20 for bonus. Highest factorial possible with "long" data type:

//            System.out.println("Enter an integer from 1 to 10: ");
            System.out.println("Enter an integer from 1 to 20: ");
            int userInteger = scanner.nextInt();
            long fact = 1;

//            if (userInteger > 10 || userInteger < 1) {
            if (userInteger > 20 || userInteger < 1) {
//                System.out.println("That number is not between 1 and 10.");
                System.out.println("That number is not between 1 and 20.");
            } else {
                for (int i = 1; i <= userInteger; i++) {
                    fact *= i;
                }
                System.out.println("The factorial of " + userInteger + " is " + fact);
            }

            System.out.println("Would you like to continue? (choose yes/no)");
            userContinue = scanner.next();

        } while (userContinue.equals("yes"));
    }

    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);

        String userContinue = "";

        do {

            System.out.println("How many sides are on the dice? ");
            int userSides = scanner.nextInt();

            System.out.println("Roll those dice! Enter \"ROLL\" to continue!");
            String userRoll = scanner.next();

            if (userRoll.equalsIgnoreCase("roll")) {
                int die1 = (int) (Math.random() * userSides) + 1;
                int die2 = (int) (Math.random() * userSides) + 1;
                System.out.println("Dice roll complete. The result of the first is " + die1 + " and the result of the second is " + die2 + "!");
            } else {
                System.out.println("Okay, let me know if you would like to roll.");
            }

            System.out.println("Would you like to roll again? (choose yes/no)");
            userContinue = scanner.next();

        } while (userContinue.equalsIgnoreCase("yes"));
    }

}
