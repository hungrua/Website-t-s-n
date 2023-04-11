package com.liversportweb.converter;

import org.springframework.stereotype.Component;

import com.liversportweb.DTO.CommentDto;
import com.liversportweb.entity.CommentEntity;

@Component
public class CommentConverter {

	public CommentEntity toEntity(CommentDto dto) {
		CommentEntity entity = new CommentEntity();
		entity.setContent(dto.getContent());
		return entity;
	}
	
	public CommentDto toDto(CommentEntity entity) {
		CommentDto dto = new CommentDto();
		dto.setAvatar(entity.getUser().getImage());
		dto.setContent(entity.getContent());
		dto.setCreateDate(entity.getCreateDate());
		dto.setUserName(entity.getUser().getUserName());
		return dto;
	}
}
