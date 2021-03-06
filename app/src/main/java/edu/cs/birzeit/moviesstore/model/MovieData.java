package edu.cs.birzeit.moviesstore.model;

import java.util.ArrayList;
import java.util.List;

public class MovieData implements IMovieData {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieData(){
        movies.add(new Movie("King Kong", 2005,
                "Adventure"));
        movies.add(new Movie("Parasite", 2019,
                "Thriller / Comedy"));
        movies.add(new Movie("The Bridge on the River Kwai", 1957,
                "War / Drama"));
        movies.add(new Movie("Spider-Man", 2019,
                "action"));
    }

    public List<Movie> getMovies(String cat){

        ArrayList<Movie> data = new ArrayList<>();
        for(Movie b : movies){
            if(b.getGenre().equals(cat)){
                data.add(b);
            }
        }
        return data;
    }

    @Override
    public String[] getGenre() {
        String[] genre = new String[]{"By title or part of it", "by year", "by genre"};

        return genre;
    }

}
