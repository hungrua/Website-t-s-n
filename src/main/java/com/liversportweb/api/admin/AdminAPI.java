package com.liversportweb.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liversportweb.DTO.UserDTO;
import com.liversportweb.service.IUserService;

@RestController
public class AdminAPI {
	@Autowired
	private IUserService userSerivce;
	
//	@PostMapping(value="/admin")
//	public UserDTO doPost(@RequestBody UserDTO model) {
//		return userSerivce.save(model);
//	}
	
}
