package com.theresa.ninjaGold;


import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Date; 

@Controller
public class NinjaGold {
	@RequestMapping("/")
	public String home(HttpSession session) {
		if (session.getAttribute("totalCount") == null) {
			session.setAttribute("totalCount", 0);
		}

		System.out.println("\n\nRouting to index");
		return "index.jsp";
	}
	
	@RequestMapping("/submit")
	public String farm(HttpSession session, @RequestParam(value="building") String building, Model model) {
		int currentCount = (int) session.getAttribute("totalCount");
		Date date = new Date();
		@SuppressWarnings("unchecked")
		ArrayList<String> currentStatus =  (ArrayList<String>) session.getAttribute("status");
		
		if (building.equals("farm")) {
			Random r = new Random();
			int winnings = r.nextInt(20-10)+10;
			int points = currentCount + winnings;
			session.setAttribute("totalCount", points);
			currentStatus.add("You ventured to the farm and found " + winnings + " gold on " + date + "!");
			System.out.println("Gold won from farming: " + winnings);
		} else if (building.equals("cave")) {
			Random r = new Random();
			int winnings = r.nextInt(10-5)+10;
			int points = currentCount + winnings;
			session.setAttribute("totalCount", points);
			currentStatus.add("You ventured to the cave and found " + winnings + " gold on " + date + "!");
			System.out.println("Gold won from the cave: " + winnings);
		} else if(building.equals("house")) {
			Random r = new Random();
			int winnings = r.nextInt(5-2)+2;
			int points = currentCount + winnings;
			session.setAttribute("totalCount", points);
			currentStatus.add("You ventured to the house and found " + winnings + " gold on " + date + "!");
			System.out.println("Gold won from the house: " + winnings);
		} else if (building.equals("casino")) {
			Random r = new Random();
			int winnings = r.nextInt(50 + 1 - 0) - 50;
			int points = currentCount + winnings;
			session.setAttribute("totalCount", points);
			currentStatus.add("You ventured to the casino and found " + winnings + " gold on " + date + "!");
			System.out.println("Points won from the casino: " + winnings);
		} else {
			System.out.println("Resubmit your form please.");
		}
		session.setAttribute("currentStatus", currentStatus);
		return "redirect:/";
	}
}