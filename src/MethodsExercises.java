import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        Addition(5, 10);
        Subtraction(10, 5);
        Multiplication(10, 5);
        Division(10, 5);
        Modulus(10, 5);
//        getInteger();
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
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

        return userInput;
    }

}
