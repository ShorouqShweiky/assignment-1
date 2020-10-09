package edu.cs.birzeit.moviesstore.model;

import java.util.List;

public interface IMovieData {
    List<Movie> getMovies(String cat);

    String[] getGenre();
}
