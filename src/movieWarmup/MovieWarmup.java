package movieWarmup;

import movies.MoviesArray;

import java.util.Scanner;

public class MovieWarmup {

    private String name;
    private String director;

    public MovieWarmup() {
    }

    public MovieWarmup(String name, String director) throws IllegalArgumentException {
        if (name == null || name.isBlank() || director == null || director.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
            this.director = director;
        }
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

 }