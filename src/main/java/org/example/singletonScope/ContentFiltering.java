package org.example.singletonScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContentFiltering implements Filter{
    @Override
    public List<String> getRecommendedMovie() {
        List<String> movies = new ArrayList<>();
        movies.add("Iron Man");
        movies.add("Iron Man 2");
        movies.add("Iron Man 3");
        return movies;
    }

    @Override
    public String toString() {
        return "ContentFiltering-Singleton-{ hashCode:" +this.hashCode()+
                " }";
    }
}
