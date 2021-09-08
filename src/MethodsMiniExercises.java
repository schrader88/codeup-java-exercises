import java.util.Scanner;

public class MethodsMiniExercises {

    // TODO: break the following code apart into a few methods
    public static void main(String[] args) {
        integerMatchesLength(userString(), userInteger());
    }

    public static String userString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an input.");
        String stringInput = sc.nextLine();
        return stringInput;
    }

    public static int userInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int intInput = sc.nextInt(); // assume the user will enter a valid integer
        return intInput;
    }

    public static void integerMatchesLength(String stringInput, int intInput) {
        if (stringInput.length() == intInput) {
            System.out.println("That matches the length of the input!");
        } else {
            System.out.println("That doesn't match the length of the input!");
        }
    }

}