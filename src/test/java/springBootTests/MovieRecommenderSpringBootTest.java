package springBootTests;

import org.example.Main;
import org.example.singletonScope.ContentFiltering;
import org.example.singletonScope.MovieRecommenderSystem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = Main.class)
public class MovieRecommenderSpringBootTest {


    @Autowired
    private MovieRecommenderSystem recommenderSystem ;



    @Test
    public void TestRecommender(){
        List<String> movies = new ArrayList<>();
        movies.add("Iron Man");
        movies.add("Iron Man 2");
        movies.add("Iron Man 3");

        List<String> resultMovies = recommenderSystem.RecommendedMovieByFilter();
        System.out.println(resultMovies);
        assertArrayEquals(new List[]{movies},new List[]{resultMovies});
    }

}
