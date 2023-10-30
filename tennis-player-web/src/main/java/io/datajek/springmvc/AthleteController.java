package io.datajek.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/player")
public class AthleteController {

    @RequestMapping("/showPlayerForm")
    public String showForm(Model model) {
        model.addAttribute("athlete", new Athlete());
        return "add-player-form";
    }

    @RequestMapping("/processPlayerForm")
    public String processPlayer(Model model) {
        model.addAttribute("athlete", new Athlete());
        return "add-player-form";
    }
    //method to handle /processPlayerForm
    @RequestMapping("/processPlayerForm")
    public static String processForm(@Valid @ModelAttribute("athlete") Athlete myAthlete,
                                     BindingResult result){
        if(result.hasErrors())
            return "add-player-form";
        else
        return "player-confirmation";
    }
}
