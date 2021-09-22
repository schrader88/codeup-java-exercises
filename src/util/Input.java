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
        System.out.println("Please enter a number between " + min + " and " + max + ": ");

        try {
            userInt = Integer.valueOf(getString("Enter number here: "));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("That is not a number!");
            return getInt(min, max);
        }

        if (userInt > max || userInt < min) {
            System.out.println("That number is not within " + min + " and " + max + ". Try again.");
            return getInt(min, max);
        }

        return userInt;
    }

    public int getInt() {
        int userInt;

        try {
            userInt = Integer.valueOf(getString("Enter number here: "));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("That is not a number!");
            return getInt();
        }

        return userInt;
    }

    public double getDouble(double min, double max) {
        double userInt;
        System.out.println("Please enter a number between " + min + " and " + max + ": ");

        try {
            userInt = Double.valueOf(getString("Enter number here: "));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("That is not a number!");
            return getDouble(min, max);
        }

        if (userInt > max || userInt < min) {
            System.out.println("That number is not within " + min + " and " + max + ". Try again.");
            return getDouble(min, max);
        }

        return userInt;
    }

    public double getDouble() {
        double userDbl;

        try {
            userDbl = Double.valueOf(getString("Enter number here: "));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("That is not a number!");
            return getDouble();
        }

        return userDbl;
    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }
}
