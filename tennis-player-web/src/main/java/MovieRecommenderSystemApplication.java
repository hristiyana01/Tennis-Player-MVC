//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//import java.util.Arrays;
//
//@SpringBootApplication
//public class MovieRecommenderSystemApplication {
//
//    public static void main(String[] args) {
//
//        //ApplicationContext manages the beans and dependencies
//        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//
//        //use ApplicationContext to find which filter is being used
//        io.datajek.springmvc.RecommenderImplementation recommender = appContext.getBean(io.datajek.springmvc.RecommenderImplementation.class);
//
//        //call method to get recommendations
//        String[] result = recommender.recommendMovies("Finding Dory");
//
//        //display results
//        System.out.println(Arrays.toString(result));
//
//    }
//
//}
