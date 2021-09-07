import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

        // Below will cause an infinite loop unless it is set to (i > 0) in the while. Why?
        // Will infinite loop if while is set to any number higher than 65536.

//        int i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i > 0 && i < 1000000);

        // Above code will be refactored to For loops below:

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (int i = 2; i > 0 && i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        // FizzBuzz Test

//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        // Table of Powers

//        Scanner tableScanner = new Scanner(System.in);

//        System.out.print("What number would you like to go up to? ");
//        int userInt = tableScanner.nextInt();
//        System.out.println(" ");
//        System.out.println("Here is your table!");
//        System.out.println(" ");
//        System.out.println("number | squared | cubed");
//        System.out.println("______ | _______ | _____");

//        for (int i = 1; i <= userInt; ++i) {
//            int squared = i * i;
//            int cubed = squared * i;
//            if (squared > 10) {
//                System.out.println(i + "      | " + squared + "      | " + cubed + "    ");
//            } else {
//                System.out.println(i + "      | " + squared + "       | " + cubed + "    ");
//            }
//        }

//        System.out.println("Would you like to continue?");

        // Letter Grade Converter

        Scanner gradeScanner = new Scanner(System.in);

        System.out.print("Please enter a grade between 0 and 100: ");
        int userGrade = gradeScanner.nextInt();

        if (userGrade < 59) {
            System.out.println("Your letter grade is: F");
        } else if (userGrade > 59 && userGrade < 67) {
            System.out.println("Your letter grade is: D");
        } else if (userGrade > 66 && userGrade < 80) {
            System.out.println("Your letter grade is: C");
        } else if (userGrade > 79 && userGrade < 88) {
            System.out.println("Your letter grade is: B");
        } else {
            System.out.println("Your letter grade is: A");
        }

        System.out.println("Would you like to continue?");

    }

}
