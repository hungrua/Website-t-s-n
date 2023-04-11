package com.liversportweb.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liversportweb.DTO.UserDTO;
import com.liversportweb.service.IUserService;

@RestController
public class UserAPI {
	@Autowired
	private IUserService userSerivce;
	
	@PostMapping(value="/user")
	public UserDTO doPost(@RequestBody UserDTO model) {
		return userSerivce.save(model);
	}
}
