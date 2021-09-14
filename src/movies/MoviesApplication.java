package movies;

import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Movie movie = new Movie();

        Scanner scanner = new Scanner(System.in);

        String userContinue;
        int userInput;

        do {

        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view all movies in the animated category");
        System.out.println("3 - view all movies in the drama category");
        System.out.println("4 - view all movies in the horror category");
        System.out.println("5 - view all movies in the sci-fi category");

            userInput = scanner.nextInt();

            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (userInput == 0) {
                    break;
                } else if (userInput == 1) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                } else if (userInput == 2) {
                    movie.setCategory("animated");
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                } else if (userInput == 3) {
                    movie.setCategory("drama");
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                } else if (userInput == 4) {
                    movie.setCategory("horror");
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                } else if (userInput == 5) {
                    movie.setCategory("scifi");
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                } else {
                    System.out.println("That is not a valid response. Please try again.");
                }
            }

            System.out.println("Would you like to continue? ");
            userContinue = scanner.next();

        } while (userContinue.equalsIgnoreCase("y") || userContinue.equalsIgnoreCase("yes"));
    }
}
