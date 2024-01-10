package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieRepositoryInterface{
    List<Movie> movies = new ArrayList<>();
    MovieRepositoryInterface movieRepositoryInterface;

    public MovieRepositoryInterface getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
