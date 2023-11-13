import io.datajek.springmvc.CollaborativeFilter;
import io.datajek.springmvc.ContentBasedFilter;
import io.datajek.springmvc.RecommenderImplementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RecommenderImplementationUnitTest {
    @Test
    void testRecommendMovies() {
        //1. Initialize the object
        RecommenderImplementation recommenderImpl = new RecommenderImplementation(new CollaborativeFilter());
        //2. Call method on the bean
        String[] actualResult = recommenderImpl.recommendMovies("Finding Dory");
        //3. Check if the result is as expected
    }
    @Test
    void testRecommendMovies_withCollaborativeFilter() {
        RecommenderImplementation recommenderImpl = new RecommenderImplementation(
                new CollaborativeFilter());
        String[] actualResult = recommenderImpl.recommendMovies("Finding Dory");
        assertArrayEquals(new String[] {"Finding Nemo", "Ice Age", "Toy Story"}, actualResult);
    }
    @Test
    void testRecommendMovies_withContentBasedFilter() {
        RecommenderImplementation recommenderImpl = new RecommenderImplementation(
                new ContentBasedFilter());
        assertArrayEquals(new String[] {"Happy Feet", "Ice Age", "Shark Tale"},
                recommenderImpl.recommendMovies("Finding Dory"));
    }
}
