package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {
    public static long id=0L;
    MovieRepository movieRepository = new MovieRepository();
    public void registerMovie(Movie movie){
        movie.setIdMovie(String.valueOf(++id));
        movieRepository.add(movie);

    }
}
