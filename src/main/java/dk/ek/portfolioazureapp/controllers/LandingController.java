package dk.ek.portfolioazureapp.controllers;

import dk.ek.portfolioazureapp.models.User;
import dk.ek.portfolioazureapp.repositories.LandingRepository;
import dk.ek.portfolioazureapp.services.LandingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class LandingController {
    private LandingService service = new LandingService();

    @GetMapping("/")
    public ModelAndView landing() {
        ModelAndView mav = new ModelAndView("index");
        Map<Integer, User> users = service.getAllUsers();
        mav.addObject("users", users);
        return mav;
    }
}