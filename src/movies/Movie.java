package movies;

import util.Input;

public class Movie {

    private String name;
    private String category;

    public Movie() {
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public Movie findMovie(String name, Movie[] movies) {
        for (Movie movie : movies) {
            if (movie.getName().equalsIgnoreCase(name)) {
                return movie;
            }
        }
        return null;
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
}