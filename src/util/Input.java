package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString() {
        System.out.println("Please enter value here: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
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
            userInt = Integer.valueOf(getString("Enter number here: "));


        } while (userInt > max || userInt < min);

        return userInt;
    }

    public int getInt() {
        int userInt = Integer.valueOf(getString("Enter number here: "));

        return userInt;
    }

    public double getDouble(double min, double max) {
        double userInt;

        do {
            System.out.println("Please enter a number between " + min + " and " + max + ": ");
            userInt = Double.valueOf(getString("Enter number here: "));


        } while (userInt > max || userInt < min);

        return userInt;
    }

    public double getDouble() {
        double userDbl = Double.valueOf(getString("Enter number here: "));

        return userDbl;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }
}
