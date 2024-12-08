/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecosystem.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class MovieDirectory {
    private ArrayList<Movie> movieList;

    public MovieDirectory() {
        movieList = new ArrayList<Movie>();
    }
    
    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }
    
    public Movie createMovie(String name) {
        Movie movie = new Movie(name);
        movieList.add(movie);
        return movie;
    }
    
    public void createMovie(Movie movie) {
        this.movieList.add(movie);
    }
    
    public void removeMovie(Movie moive) {
        this.movieList.remove(moive);
    }
}
