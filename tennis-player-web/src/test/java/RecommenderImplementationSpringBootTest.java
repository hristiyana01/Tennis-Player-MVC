import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class RecommenderImplementationSpringBootTest {

    //not working
    @Autowired
    private RecommenderImplementation recommenderImplementation;

    @Test
    void testRecommendMovies() {
        assertArrayEquals(new String[] {"Finding Nemo", "Ice Age", "Toy Story"},
                recommenderImplementation.recommendMovies("Finding Dory"));
    }
}