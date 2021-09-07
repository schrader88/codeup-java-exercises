import java.util.Scanner;

public class myIOExperiment {

    public static void main(String[] args) {
        Scanner expScanner = new Scanner(System.in);

        System.out.print("Please Enter Your Name: ");
        String userInput = expScanner.next();
//        System.out.println("Hello, " + userInput);
        System.out.printf("Hello, %s", userInput);
    }

}

class mySecondIOExperiment {

    public static void main(String[] args) {

        // write a Java program that asks the user for their age and then tells them if they are a teenager or not.
        // bonus: if not, tell them whether they are younger or older than a teenager.

        Scanner secondScan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int userAge = secondScan.nextInt();

        if (userAge > 18) {
            System.out.println("User is over 18 years old.");
        } else if (userAge < 18 && userAge > 12) {
            System.out.println("User is a teenager under 18 years old.");
        } else {
            System.out.println("User is below 13 years old.");
        }

    }

}
