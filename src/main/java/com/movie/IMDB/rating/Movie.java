package com.movie.IMDB.rating;


public class Movie {
    private Integer id;
    private String movieName;
    private String movieDescription;

//----------constructor------------------
//Constructor has the same name as the class name
    public Movie(String movieName, String movieDescription, int id){
        //'this' keywords represents current context of java class
        this.id = id;
        this.movieName = movieName;
        this.movieDescription = movieDescription;
    }

//----------getters-----------------------
//Getters are used to get the values of the local variables of the class
    public Integer getId(){
        return id;
    }
    public String getMovieName(){
        return movieName;
    }
    public String getMovieDescription(){
        return movieDescription;
    }

//-----------setters-----------------------
//Setters are used to assign value to the local variables of the class
    public void setId(Integer id) {
        this.id = id;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }
}
