package edu.cs.birzeit.moviesstore.model;
public class Movie {
    private String title;
    private int year;
    private String genre;
    private String category;


    public Movie(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGener(String genre) {
        this.genre = genre;
    }



    }
