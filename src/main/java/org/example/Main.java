package org.example;


import org.example.movie.MovieRecommenderSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = SpringApplication.run(Main.class,args);

        MovieRecommenderSystem recommenderSystem = context.getBean(MovieRecommenderSystem.class);

        List<String> movies = recommenderSystem.RecommendedMovieByFilter();

        System.out.println(movies);
    }
}