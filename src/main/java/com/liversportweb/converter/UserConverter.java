package com.liversportweb.converter;

import org.springframework.stereotype.Component;

import com.liversportweb.DTO.UserDTO;
import com.liversportweb.entity.UserEntity;

@Component
public class UserConverter {
	public UserEntity toEntity(UserDTO model) {
		UserEntity result = new UserEntity();
		result.setId(model.getId());
		result.setUserName(model.getUserName());
		result.setPassword(model.getPassword());
		result.setEmail(model.getEmail());
		result.setFullname(model.getFullName());
		result.setDistrict(model.getDistrict());
		result.setCity(model.getCity());
		return result;
	}
	public UserDTO toDTO(UserEntity entity) {
		UserDTO result = new UserDTO();
		if(entity.getId()!=null) {
			result.setId(entity.getId());
		}
		result.setId(entity.getId());
		result.setUserName(entity.getUserName());
		result.setPassword(entity.getPassword());
		result.setRoleId(entity.getRole().getId());
		result.setEmail(entity.getEmail());
		result.setFullName(entity.getFullname());
		result.setDistrict(entity.getDistrict());
		result.setCity(entity.getCity());
		return result;
	}
	public UserEntity toEntity(UserDTO model, UserEntity entity) {
		entity.setUserName(model.getUserName());
		entity.setPassword(model.getPassword());
		entity.setEmail(model.getEmail());
		entity.setFullname(model.getFullName());
		entity.setDistrict(model.getDistrict());
		entity.setCity(model.getCity());
		return entity;
	}
}

