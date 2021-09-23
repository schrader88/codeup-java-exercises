package movies;

import util.Input;

import java.util.Scanner;

public class Movie {

    private String name;
    private String category;
    private String director;

    public Movie() {
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Movie(String name, String category, String director) throws IllegalArgumentException {
        if (name == null || name.isBlank() || category == null || category.isBlank() || director == null || director.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
            this.category = category;
            this.director = director;
        }
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void runMovieApplication() {

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
            System.out.println("6 - view all movies in the musical category");

            System.out.println("Enter response here: ");
            userInput = scanner.nextInt();

            for (Movie movies : MoviesArray.findAll()) {
                if (userInput == 0) {
                    break;
                } else if (userInput == 1) {
                    System.out.println(movies.getName() + " -- " + movies.getCategory());
                } else if (userInput == 2) {
                    if (movies.getCategory().equals("animated")) {
                        System.out.println(movies.getName() + " -- " + movies.getCategory());
                    }
                } else if (userInput == 3) {
                    if (movies.getCategory().equals("drama")) {
                        System.out.println(movies.getName() + " -- " + movies.getCategory());
                    }
                } else if (userInput == 4) {
                    if (movies.getCategory().equals("horror"))
                        System.out.println(movies.getName() + " -- " + movies.getCategory());
                } else if (userInput == 5) {
                    if (movies.getCategory().equals("scifi")) {
                        System.out.println(movies.getName() + " -- " + movies.getCategory());
                    }
                } else if (userInput == 6) {
                    if (movies.getCategory().equals("musical")) {
                        System.out.println(movies.getName() + " -- " + movies.getCategory());
                    }
                }
            }

            System.out.println("Would you like to continue? ");
            userContinue = scanner.next();

        } while (userContinue.equalsIgnoreCase("y") || userContinue.equalsIgnoreCase("yes"));
    }
}