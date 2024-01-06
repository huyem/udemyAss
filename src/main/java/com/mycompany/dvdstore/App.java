package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello!Please enter the title ó the movie: " );
        Scanner scanner = new Scanner(System.in);
        String titleSc = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(titleSc);
        MovieService movieService = new MovieService();
        movieService.registerMovie(movie);
    }
}
