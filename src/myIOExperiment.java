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
