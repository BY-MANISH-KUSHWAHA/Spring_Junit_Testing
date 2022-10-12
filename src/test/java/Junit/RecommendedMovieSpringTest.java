package Junit;

import org.example.Main;
import org.example.movie.MovieRecommenderSystem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Main.class)
public class RecommendedMovieSpringTest {

    @Autowired
    MovieRecommenderSystem recommenderSystem;

    @Test
    public void TestRecommendedMovie(){
        List<String> movies = new ArrayList<>();
        movies.add("Iron Man");
        movies.add("Iron Man 2");
        movies.add("Iron Man 3");

        List<String> resultMovies = recommenderSystem.RecommendedMovieByFilter();
        System.out.println(resultMovies);
        assertArrayEquals(new List[]{movies},new List[]{resultMovies});

    }

}
