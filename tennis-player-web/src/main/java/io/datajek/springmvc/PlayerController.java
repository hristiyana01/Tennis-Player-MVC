package io.datajek.springmvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PlayerController {

    @Autowired
            PlayerService playerService;
    PlayerService service = new PlayerService();
    @RequestMapping("/showPlayerForm")
    public String ShowForm() {
        return "search-player-form";
    }

    @RequestMapping("/processPlayerForm")
    public String processForm() {
        return "player-detail";
    }
    @RequestMapping("/processPlayerForm")
    public String processForm(@RequestParam(value = "playerName", defaultValue = "xyz") String pName, Model model) {
        String theName = pName.toUpperCase();
       // Player player = service.getPlayerByName(pName);
        model.addAttribute("name", theName);
//        model.addAttribute("country", player.getNationality());
//        model.addAttribute("dob", player.getDateOfBirth());
//        model.addAttribute("", player.getTitles());
        return "player-detail";
    }
}
