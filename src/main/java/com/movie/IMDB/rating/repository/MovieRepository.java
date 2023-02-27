package com.movie.IMDB.rating.repository;

import com.movie.IMDB.rating.model.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    //CrudRepository is extended by the empty repo MovieRepository

    public List<Movie> findAll(); //general way to find all the movies
    public Movie findById(int id); //find the movies based on id

}
