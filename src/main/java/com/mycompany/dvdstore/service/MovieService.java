package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface{
    public static long id=0L;
//    MovieRepository movieRepository = new MovieRepository();
//    public void registerMovie(Movie movie){
//        movie.setIdMovie(String.valueOf(++id));
//        movieRepository.add(movie);
//
//    }
private MovieRepositoryInterface goLiveMovieRepository;


    public MovieRepositoryInterface getGoLiveMovieRepository() {
        return goLiveMovieRepository;
    }

    public void setGoLiveMovieRepository(MovieRepositoryInterface goLiveMovieRepository) {
        this.goLiveMovieRepository = goLiveMovieRepository;
    }

    public void registerMovie(Movie movie){

        goLiveMovieRepository.add(movie);

    }
}
