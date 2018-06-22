package com.theresa.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.theresa.authentication.models.User;
import com.theresa.authentication.services.UserService;
import com.theresa.authentication.validator.UserValidator;


// imports removed for brevity
@Controller
public class Users {
	private final UserService userService;
    private final UserValidator userValidator;

    public Users(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
    	System.out.println("User has been logged out.");
        return "/";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	// if result has errors, return the registration page (don't worry about validations just now)
    	userValidator.validate(user, result);
    	if (result.hasErrors()) {
    		return "registrationPage.jsp";
    	} else {
    		// else, save the user in the database, save the user id in session, and redirect them to the /home route
    		User newUser = userService.registerUser(user);
    		session.setAttribute("userId", newUser.getId());
    		return "redirect:/home";
    	}
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
    	if (userService.authenticateUser(email, password)) {
    		User user = userService.findByEmail(email);
    		session.setAttribute("userId", user.getId());
    		if
    		return "redirect:/home";
    	} else {
    		// else, add error messages and return the login page
    		return "/loginPage.jsp";
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        Long userId = (Long) session.getAttribute("userId"); // get the ID from session
        User user = userService.findUserById(userId); // find the user based on ID 
        model.addAttribute("user", user); // pass user object to JSP file
        return "homePage.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}