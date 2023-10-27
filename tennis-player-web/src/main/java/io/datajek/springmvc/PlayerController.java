package io.datajek.springmvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PlayerController {

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
    public String processForm(HttpServletRequest request, Model model) {
        String pName = request.getParameter("playerName");
        model.addAttribute("name", pName);
        return "player-detail";
    }
}
