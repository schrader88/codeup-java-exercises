import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        highLowGameMethod();
    }

    public static void highLowGameMethod() {
        Scanner scanner = new Scanner(System.in);

        String userContinue = "";

        int guessAccumulator = 0;

        int randomNumber = (int) (Math.random() * 100) + 1;

        do {

            System.out.println(randomNumber);

            System.out.println("Guess the number between 1 and 100: ");
            int userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS! That is correct!");
                break;
            }

            if (guessAccumulator == 5) {
                System.out.println("Shoot! That is 5 guesses. Better luck next time!");
                break;
            }

            guessAccumulator++;

            System.out.println("Would you like to play again? (yes/no)");
            userContinue = scanner.next();


        } while (userContinue.equalsIgnoreCase("yes"));

        System.out.println("You guessed a total of " + guessAccumulator + " times.");
    }
}
