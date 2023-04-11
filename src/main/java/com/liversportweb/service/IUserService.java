package com.liversportweb.service;

import com.liversportweb.DTO.UserDTO;

public interface IUserService {
	UserDTO save(UserDTO userDTO);
	UserDTO getUser(String userName);
}
