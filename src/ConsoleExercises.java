import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        String greeting = "Salutations";
//        String name = "Kyle";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//        System.out.printf("%s, %s.",greeting, name);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }

}
