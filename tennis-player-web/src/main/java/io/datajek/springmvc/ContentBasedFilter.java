package io.datajek.springmvc;

import org.springframework.stereotype.Component;


import java.util.logging.LogRecord;

@Component
public class ContentBasedFilter implements JUnit.Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
