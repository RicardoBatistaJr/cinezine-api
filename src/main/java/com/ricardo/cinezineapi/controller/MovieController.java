package com.ricardo.cinezineapi.controller;

import model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @GetMapping("/getAllMovies")
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> getAllMovies(){
        Movie m = new Movie();
        List<Movie> lists = new ArrayList<>();
        lists.add(m);
        return lists;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Movie getMovieByName(@RequestParam("name") String name){
        return new Movie();
    }
}
