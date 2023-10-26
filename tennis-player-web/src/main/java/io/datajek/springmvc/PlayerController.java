package io.datajek.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayerController {

    @RequestMapping("/showPlayerForm")
    public String ShowForm() {
        return "search-player-form";
    }

    @RequestMapping("/processPlayerForm")
    public String processForm() {
        return "player-detail";
    }
}
