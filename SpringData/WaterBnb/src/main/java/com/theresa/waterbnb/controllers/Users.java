package com.theresa.waterbnb.controllers;


import java.util.List;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.theresa.waterbnb.models.Listing;
import com.theresa.waterbnb.models.User;
import com.theresa.waterbnb.services.ListingService;
import com.theresa.waterbnb.services.UserService;
import com.theresa.waterbnb.validator.UserValidator;


// imports removed for brevity
@Controller
public class Users {
	private final UserService userService;
    private final UserValidator userValidator;
    private final ListingService listingService;

    public Users(UserService userService, UserValidator userValidator, ListingService listingService) {
        this.userService = userService;
        this.userValidator = userValidator;
        this.listingService = listingService;
    }
    
    @RequestMapping("/")
    public String index() {
        return "user/index.jsp";
    }
    
    @RequestMapping("/login")
    public String login(@ModelAttribute("user") User user) {
        return "loginReg/loginReg.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	// if result has errors, return the registration page (don't worry about validations just now)
    	userValidator.validate(user, result);
    	if (result.hasErrors()) {
    		return "loginReg/loginReg.jsp";
    	} else {
    		// else, save the user in the database, save the user id in session, and redirect them to the /home route
    		User newUser = userService.registerUser(user);
    		String userAcctType = newUser.getAcctType();
			System.out.println("New user account type: " + userAcctType);
    		session.setAttribute("userId", newUser.getId());
    		if (userAcctType.equals("host")) {
    			System.out.println("User registered as a host.");
    			return "redirect:/host"; // Redirect all hosts to the host dashboard.
    		} else {
    			System.out.println("User registered as a guest.");
    			return "redirect:/search"; // Redirect all guests to the listing. 
    		}
    	}
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
    	if (userService.authenticateUser(email, password)) {
    		User user = userService.findByEmail(email);
    		String userAcctType = user.getAcctType();
    		session.setAttribute("userId", user.getId());
    		System.out.println("The user logged in!");
    		if (userAcctType.equals("host")) {
    			System.out.println("User logged in as a host.");
    			return "redirect:/host";
    		} else {
    			System.out.println("User logged in as a guest");
    			return "redirect:/search"; // Redirect all guest to the listing page. 
    		}
    	} else {
    		// else, add error messages and return the login page
    		return "loginReg/loginReg.jsp";
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
        return "redirect:/";
    }
    
    // Users that are guests directed here upon registration or login. 
    @GetMapping("/search")
    public String search(Model model) {
    	List<Listing> allListings = listingService.allListings();
    	model.addAttribute("allListings", allListings);
    	return "listings/search.jsp";
    }
    
    // Redirect all hosts to the dashboard where they can create listings
    @GetMapping("/host")
    public String showDashboard(@Valid @ModelAttribute("listing") Listing listing, Model model, HttpSession session) {
    	Long userId = (Long) session.getAttribute("userId");
    	User user = userService.findUser(userId);
    	List<Listing> userListings = user.getListings();
    	model.addAttribute("user", user);
    	model.addAttribute("userListings", userListings);
    	return "user/hostDash.jsp";
    }
    
    // Host creates a new listing
    @PostMapping("/host")
    public String addListing(@Valid @ModelAttribute("listing") Listing listing, @RequestParam("userId") Long userId) {
    	// create the listing
    	Listing newListing = listingService.createListing(listing);
      	// get the user obj by id
    	User user = userService.findUserById(userId);
    	newListing.setHost(user);
    	// add the user as the "host" of the new listing 
    	System.out.println("THE HOST: " + newListing.getHost());
    	listingService.createListing(listing);
    	// save!
    	return "redirect:/host";
    }
}