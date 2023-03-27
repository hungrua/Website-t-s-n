package com.liversportweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liversportweb.DTO.UserDTO;
import com.liversportweb.converter.UserConverter;
import com.liversportweb.entity.RoleEntity;
import com.liversportweb.entity.UserEntity;
import com.liversportweb.repository.RoleRepository;
import com.liversportweb.repository.UserRepository;
import com.liversportweb.service.IUserService;
@Service
public class UserService implements IUserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired 
	private RoleRepository roleRepository;
	@Autowired
	private UserConverter userConverter;
	
	public UserDTO save(UserDTO userDTO) {
		UserEntity entity = new UserEntity();
		if(userDTO.getId()!=null) {
			UserEntity oldEntity = userRepository.findOne(userDTO.getId());
			entity = userConverter.toEntity(userDTO,oldEntity);
		}
		else {
			entity = userConverter.toEntity(userDTO);
		}
		RoleEntity roleEntity = roleRepository.findOneById(userDTO.getRoleId());
		entity.setRole(roleEntity);
		entity = userRepository.save(entity);
		return userConverter.toDTO(entity);
	}
	
}
