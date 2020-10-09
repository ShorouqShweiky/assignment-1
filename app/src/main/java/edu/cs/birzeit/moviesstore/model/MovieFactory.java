package edu.cs.birzeit.moviesstore.model;


public class MovieFactory {


    public IMovieData getModel(){

        return new MovieData();
    }
}
