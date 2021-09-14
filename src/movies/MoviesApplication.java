package movies;

//import util.Input;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        // Refactor to use Input class instead of creating a new Scanner

//        Input input = new Input();

        Movie movie = new Movie();

        movie.runMovieApplication();
    }
}
