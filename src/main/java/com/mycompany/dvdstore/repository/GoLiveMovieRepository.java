package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository implements MovieRepositoryInterface{
    MovieRepositoryInterface movieRepositoryInterface;

    public MovieRepositoryInterface getMovieRepositoryInterface() {
        return movieRepositoryInterface;
    }

    public void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        this.movieRepositoryInterface = movieRepositoryInterface;
    }

    public void add(Movie movie){

        FileWriter writer;

        try{

            writer=new FileWriter("F:\\temp\\movies.txt",true);

            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");

            writer.close();

        }

        catch (IOException e){

            e.printStackTrace();

        }

        System.out.println("The movie "+movie.getTitle()+" has been added.");

    }


}
