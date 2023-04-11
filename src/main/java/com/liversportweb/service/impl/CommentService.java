package com.liversportweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.liversportweb.DTO.CommentDto;
import com.liversportweb.converter.CommentConverter;
import com.liversportweb.entity.CommentEntity;
import com.liversportweb.entity.SportFieldEntity;
import com.liversportweb.entity.UserEntity;
import com.liversportweb.repository.CommentRepository;
import com.liversportweb.repository.SportFieldRepository;
import com.liversportweb.repository.UserRepository;
import com.liversportweb.service.ICommentService;

public class CommentService implements ICommentService{

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SportFieldRepository sportFieldRepository;
	
	@Autowired
	private CommentConverter commentConverter;
	
	@Override
	public CommentDto saveOrUpdate(CommentDto comment, Long id) {
		CommentEntity commentEntity = new CommentEntity();
		// thêm comment mơi
		if(comment.getId() == null) {
			commentEntity = save(comment, id);
		}
		// TH chinh su comment
		else {
			commentEntity = update(comment);
		}
		return commentConverter.toDto(commentEntity);
	}
	
	// add comment
	private CommentEntity save(CommentDto comment, Long id) {
		// get user
		UserEntity user = gettUser();
		SportFieldEntity sportField = sportFieldRepository.findOne(id);
		CommentEntity entity = commentConverter.toEntity(comment);
		entity.setSportField(sportField);
		entity.setCreateDate(new java.sql.Date(System.currentTimeMillis()));
		entity.setUser(user);
		entity = commentRepository.save(entity);
		return entity;
	}
	
	// update comment
	private CommentEntity update(CommentDto comment) {
		CommentEntity newComment = commentRepository.findOne(comment.getId());
		newComment.setContent(comment.getContent());
		newComment.setCreateDate(new java.sql.Date(System.currentTimeMillis()));
		return newComment;
	}

	// xóa comment
	@Override
	public void delete(Long id) {
		commentRepository.delete(id);
	}
	
	private UserEntity gettUser() {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		String userName = loggedInUser.getName();
		UserEntity user = userRepository.findOneByUserName(userName);
		return user;
	}

	@Override
	public List<CommentDto> findAll() {
		List<CommentEntity> listEntity = commentRepository.findAll();
		List<CommentDto> listResult = new ArrayList<>();
		for(CommentEntity entity : listEntity) {
			CommentDto dto = commentConverter.toDto(entity);
			listResult.add(dto);
		}
		return listResult;
	}

}
