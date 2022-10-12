package org.example.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieRecommenderSystem {
    @Autowired
    private Filter filter;

    public List<String> RecommendedMovieByFilter(){

        return filter.getRecommendedMovie();
    }

    public MovieRecommenderSystem(Filter filter) {
        super();
        this.filter = filter;
    }
}

