import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's up, I'm Bob. What do you need?");

        String userInput = scanner.nextLine();

//        if (userInput.contains("?")) {
//            System.out.println("Sure.");
//        } else if (userInput.contains("!")) {
//            System.out.println("Whoa, chill out!");
//        } else if (userInput.equals("")) {
//            System.out.println("Fine. Be that way!");
//        } else {
//            System.out.println("Whatever.");
//        }

        if (userInput.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }

}
