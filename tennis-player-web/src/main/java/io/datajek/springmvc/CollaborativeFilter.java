package io.datajek.springmvc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.logging.LogRecord;

@Component
@Primary
public class CollaborativeFilter implements JUnit.Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
