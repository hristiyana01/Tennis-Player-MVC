package io.datajek.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TennisController {

    @RequestMapping(value = "/")
    public String welcome() {
        return "Welcome to the Tennis Player database from Spring MVC!";
    }
}
