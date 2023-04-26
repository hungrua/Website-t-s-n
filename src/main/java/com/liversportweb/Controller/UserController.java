package com.liversportweb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.liversportweb.service.IUserService;

@Controller
public class UserController {
	@Autowired
	IUserService userService;
}
