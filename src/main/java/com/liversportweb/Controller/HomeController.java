package com.liversportweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	@GetMapping("/")
    public String home() {
        return "index.html";  
    }
	@GetMapping("/login")
	public String login() {
       return "/HTML/login.html";  
    }
	@GetMapping("/booking")
    public String booking() {
        return "/HTML/booking.html";  
    }
	@GetMapping("/sport_field")
    public String sport_field() {
        return "/HTML/sport_field.html";  
    }
}
