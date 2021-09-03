import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        String greeting = "Salutations";
//        String name = "Kyle";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);
//        System.out.printf("%s, %s.",greeting, name);

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.next();
//        String userInput = scanner.nextLine();

//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        double pi = 3.14159;

//        System.out.printf("The value of pi is approximately %.4s", pi);

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer: ");
//        int nextInt = scanner.nextInt();
//        System.out.println("The integer you entered is " + nextInt);

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter 3 words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("These are your 3 words: %s, %s, %s", firstWord, secondWord, thirdWord);

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your favorite sentence: ");
////        String userSentence = scanner.next();
//        String userSentence = scanner.nextLine();
//        System.out.printf("Your sentence is: %s", userSentence);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the LENGTH and WIDTH of a Codeup classroom: ");
        int userLength = Integer.parseInt(scanner.nextLine());
        int userWidth = Integer.parseInt(scanner.nextLine());
        System.out.println("The area of the classroom is " + (userLength * userWidth) + ". The perimeter of the classroom is: " + ((userLength * 2) + (userWidth * 2) + "."));

    }

}
