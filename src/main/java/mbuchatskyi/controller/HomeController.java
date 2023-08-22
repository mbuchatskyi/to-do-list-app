package mbuchatskyi.controller;

import mbuchatskyi.model.User;
import mbuchatskyi.repository.UserRepository;
import mbuchatskyi.service.UserService;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
    private final UserService userService;
    
    @Autowired
    private UserRepository userRepository;
    
    public HomeController(UserService userService) {
        this.userService = userService;
    }
    
    @ModelAttribute
    private void userDetails(Model m, Principal p) {
    	String name = p.getName();
    	User user = userRepository.findByEmail(name);
    	
    	m.addAttribute("user", user);
    }

    @GetMapping({"/", "home"})
    public String home(Model model) {
        model.addAttribute("users", userService.getAll());
        return "home";
    }
}
