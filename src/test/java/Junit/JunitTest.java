package Junit;

import org.example.movie.ContentFiltering;
import org.example.movie.MovieRecommenderSystem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class JunitTest {

    @Test
    public void testMovieRecommenderSystem(){
        List<String> movies = new ArrayList<>();
        movies.add("Iron Man");
        movies.add("Iron Man 2");
        movies.add("Iron Man 3");

        MovieRecommenderSystem recommenderSystem = new MovieRecommenderSystem(new ContentFiltering());
        List<String> resultMovies = recommenderSystem.RecommendedMovieByFilter();
        System.out.println(resultMovies);
        assertArrayEquals(new List[]{movies},new List[]{resultMovies});
    }



}
