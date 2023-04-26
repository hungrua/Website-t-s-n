package com.liversportweb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.liversportweb.DTO.BookingDTO;
import com.liversportweb.DTO.SportFieldDTO;
import com.liversportweb.DTO.UserDTO;
import com.liversportweb.service.IBookingService;
import com.liversportweb.service.ISportFieldService;
import com.liversportweb.service.IUserService;

@Controller
public class AdminController {
	@Autowired
	IBookingService bookingService;
	@Autowired
	IUserService userService;
	@Autowired
	ISportFieldService sportFieldService;
	
	@GetMapping("/admin/match")
	public String getMatch(Model model) {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		String username = loggedInUser.getName();
		UserDTO user = userService.getUser(username);
		List<BookingDTO> matches = new ArrayList<BookingDTO>();
		matches = bookingService.getAllMatchBySportField(user.getMySportField());
		SportFieldDTO sportField = sportFieldService.findOneById(user.getMySportField());
		model.addAttribute("matches",matches);
		model.addAttribute("sportField",sportField);
		return "list-match-admin";
	}
	@GetMapping("/admin/first-login")
	public String firstLogin(Model model) {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		String username = loggedInUser.getName();
		UserDTO user = userService.getUser(username);
		SportFieldDTO sportField = new SportFieldDTO();
		if(user.isFirstLogin()==0) {
			sportField = sportFieldService.findOneById(user.getMySportField());
		}
		model.addAttribute("sportField",sportField);
		return "adminInfo";
	}	
	@PostMapping(value ="/admin/field")
	public String save( Model model, SportFieldDTO dto) {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		String username = loggedInUser.getName();
		UserDTO user = userService.getUser(username);
		SportFieldDTO sportField = sportFieldService.save(dto);
		user.setMySportField(sportField.getId());
		userService.edit(user, user.getId());
		return "redirect:admin/match";
	}
}
