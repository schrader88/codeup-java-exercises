package movieWarmup;

import movies.Movie;

public class MovieWarmupTest {
    public static void main(String[] args) {
        MovieWarmup mw = new MovieWarmup("The Wolf of Wall Street", "Martin Scorsese");
        Comedy comedy = new Comedy("Test Name", "Test Director", true);

        System.out.println(mw.getDirector());
        System.out.println(mw.getName());

        System.out.println(comedy.isFunny());
    }
}
