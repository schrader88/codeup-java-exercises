package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString() {
        System.out.println("Please enter a string: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public boolean yesNo() {
        System.out.println("Please enter yes or y: ");
        String userInput = scanner.next();

        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt;

        do {
            System.out.println("Please enter a number between " + min + " and " + max + ": ");
            userInt = scanner.nextInt();


        } while (userInt > max || userInt < min);

        return userInt;
    }

    public int getInt() {
        System.out.println("Please enter a number: ");
        int userInt = scanner.nextInt();

        return userInt;
    }

    public double getDouble(double min, double max) {
        double userInt;

        do {
            System.out.println("Please enter a number between " + min + " and " + max + ": ");
            userInt = scanner.nextDouble();


        } while (userInt > max || userInt < min);

        return userInt;
    }

    public double getDouble() {
        System.out.println("Please enter a decimal number: ");
        double userDbl = scanner.nextDouble();

        return userDbl;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }
}
