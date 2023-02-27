package com.movie.IMDB.rating.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id //representing as a Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto-generates values one by one for Id integer.
    private Integer id;
    private String movieName;
    private String movieDescription;

//----------constructor------------------
//Constructor has the same name as the class name

    @Override
    public String toString() { //JSON .. looks like an object but it's not an object .. coz "Moive{"
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                '}';
    }

    public Movie(){
        this.id = 0;
        this.movieName = "";
        this.movieDescription = "";
    }
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
