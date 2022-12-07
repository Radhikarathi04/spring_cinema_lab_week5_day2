package com.example.cinema_lab.services;

import com.example.cinema_lab.models.Movie;
import com.example.cinema_lab.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Service class does not hold any data but it has functionality
// It has methods to fetch and process movies
// Contains business logic

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;


    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(int id) {
        return movieRepository.findById(id);
    }

    public Movie saveMovie(Movie movie){
        movieRepository.save(movie);
        return movie;
    }
}
