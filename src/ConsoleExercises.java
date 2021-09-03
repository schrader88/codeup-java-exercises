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
//        System.out.format("The value of pi is approximately %.4s", pi);
//        System.out.printf("The value of pi is approximately %.2f", pi);
//        System.out.format("The value of pi is approximately %.2f", pi);

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer: ");
//        int nextInt = scanner.nextInt();
//        System.out.println("The integer you entered is " + nextInt);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("These are your 3 words: %n%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your favorite sentence: ");
////        String userSentence = scanner.next();
//        String userSentence = scanner.nextLine();
//        System.out.printf("Your sentence is: %s", userSentence);

//        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter the LENGTH and WIDTH of a Codeup classroom: ");

//        int userLength = Integer.parseInt(scanner.nextLine());
//        int userWidth = Integer.parseInt(scanner.nextLine());

//        System.out.println("The area of the classroom is " + (userLength * userWidth) + ". The perimeter of the classroom is: " + ((userLength * 2) + (userWidth * 2) + "."));

        // Bonuses below:

//        Scanner scanner = new Scanner(System.in);

        // Confused at what this line below does:

//        scanner.useDelimiter("\n");

//        System.out.print("Enter the LENGTH, WIDTH, and HEIGHT of a Codeup classroom: ");

        // Variables below allow decimal entries:

//        double userLength = scanner.nextDouble();
//        double userWidth = scanner.nextDouble();
//        double userHeight = scanner.nextDouble();

//        System.out.println("The area of the classroom is " + (userLength * userWidth) + ". The perimeter of the classroom is: " + ((userLength * 2) + (userWidth * 2)) + ". The volume of the classrooom is: " + (userLength * userWidth * userHeight) + ".");


//    # Console IO Bonus Exercises
//
//1. Prompt the user to enter a favorite quote
//    - output the quote
//    - ask them to enter how many words are in the quote
//    - output the number they entered
//    - output if the number they entered indeed matched the number of words

//    Scanner scanner = new Scanner(System.in);

//    System.out.print("Enter a quote: ");
//    String userQuote = scanner.nextLine();
//    System.out.println("Quote: " + userQuote);
//    System.out.println("How many words are in that quote? ");
//    int quoteLength = scanner.nextInt();
//    System.out.println("You entered that the quote has " + quoteLength + " word(s).");

//    String[] words = userQuote.split("\\s+");

//    if (words.length == quoteLength) {
//        System.out.print("Yes, there are " + quoteLength + " words in that quote.");
//    } else {
//        System.out.print("I'm sorry, that is NOT the correct amount of words.");
//    }

//2. Prompt the user to enter a list of top three favorite foods separated by only spaces
//
//    - Use the printf() to output the three top foods with the format:
//            1. FirstFood
//        2. SecondFood
//        3. ThirdFood

//    Scanner scanner = new Scanner(System.in);

//    System.out.print("Enter your three favorite foods (Ex: Food Food Food): ");
//    String userFoods = scanner.nextLine();
//    System.out.printf("");


//3. Prompt the user to enter a grocery list of three items
//    - each item should only be separated by a comma (no spaces)
//    - you will need to use the .useDelimiter() method on your scanner object
//    - output the result as a comma-separated list using printf()

    }

}
