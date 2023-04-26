package com.liversportweb.converter;

import org.springframework.stereotype.Component;

<<<<<<< HEAD
import com.liversportweb.DTO.CommentDTO;
=======
import com.liversportweb.DTO.CommentDto;
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
import com.liversportweb.entity.CommentEntity;

@Component
public class CommentConverter {

<<<<<<< HEAD
	public CommentEntity toEntity(CommentDTO dto) {
=======
	public CommentEntity toEntity(CommentDto dto) {
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
		CommentEntity entity = new CommentEntity();
		entity.setContent(dto.getContent());
		return entity;
	}
	
<<<<<<< HEAD
	public CommentDTO toDto(CommentEntity entity) {
		
		CommentDTO dto = new CommentDTO();
		dto.setId(entity.getId());
=======
	public CommentDto toDto(CommentEntity entity) {
		CommentDto dto = new CommentDto();
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
		dto.setAvatar(entity.getUser().getImage());
		dto.setContent(entity.getContent());
		dto.setCreateDate(entity.getCreateDate());
		dto.setUserName(entity.getUser().getUserName());
		return dto;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
