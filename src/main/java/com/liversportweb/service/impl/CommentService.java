package com.liversportweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
<<<<<<< HEAD
import org.springframework.stereotype.Service;

import com.liversportweb.DTO.CommentDTO;
=======

import com.liversportweb.DTO.CommentDto;
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
import com.liversportweb.converter.CommentConverter;
import com.liversportweb.entity.CommentEntity;
import com.liversportweb.entity.SportFieldEntity;
import com.liversportweb.entity.UserEntity;
import com.liversportweb.repository.CommentRepository;
import com.liversportweb.repository.SportFieldRepository;
import com.liversportweb.repository.UserRepository;
import com.liversportweb.service.ICommentService;

<<<<<<< HEAD
@Service
public class CommentService implements ICommentService {
=======
public class CommentService implements ICommentService{

>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SportFieldRepository sportFieldRepository;
	
	@Autowired
	private CommentConverter commentConverter;
	
<<<<<<< HEAD
	public CommentDTO saveOrUpdate(CommentDTO comment, Long id) {
=======
	@Override
	public CommentDto saveOrUpdate(CommentDto comment, Long id) {
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
		CommentEntity commentEntity = new CommentEntity();
		// thêm comment mơi
		if(comment.getId() == null) {
			commentEntity = save(comment, id);
		}
		// TH chinh su comment
		else {
<<<<<<< HEAD
			commentEntity = update(comment,id);
			
		}
		commentRepository.save(commentEntity);
=======
			commentEntity = update(comment);
		}
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
		return commentConverter.toDto(commentEntity);
	}
	
	// add comment
<<<<<<< HEAD
	private CommentEntity save(CommentDTO comment, Long id) {
=======
	private CommentEntity save(CommentDto comment, Long id) {
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
		// get user
		UserEntity user = gettUser();
		SportFieldEntity sportField = sportFieldRepository.findOne(id);
		CommentEntity entity = commentConverter.toEntity(comment);
		entity.setSportField(sportField);
		entity.setCreateDate(new java.sql.Date(System.currentTimeMillis()));
		entity.setUser(user);
<<<<<<< HEAD
=======
		entity = commentRepository.save(entity);
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
		return entity;
	}
	
	// update comment
<<<<<<< HEAD
	private CommentEntity update(CommentDTO comment, Long id) {
=======
	private CommentEntity update(CommentDto comment) {
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
		CommentEntity newComment = commentRepository.findOne(comment.getId());
		newComment.setContent(comment.getContent());
		newComment.setCreateDate(new java.sql.Date(System.currentTimeMillis()));
		return newComment;
	}

	// xóa comment
<<<<<<< HEAD
=======
	@Override
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
	public void delete(Long id) {
		commentRepository.delete(id);
	}
	
	private UserEntity gettUser() {
		Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		String userName = loggedInUser.getName();
		UserEntity user = userRepository.findOneByUserName(userName);
		return user;
	}

<<<<<<< HEAD
	public List<CommentDTO> findAll() {
		List<CommentEntity> listEntity = commentRepository.findAll();
		List<CommentDTO> listResult = new ArrayList<>();
		for(CommentEntity entity : listEntity) {
			CommentDTO dto = commentConverter.toDto(entity);
=======
	@Override
	public List<CommentDto> findAll() {
		List<CommentEntity> listEntity = commentRepository.findAll();
		List<CommentDto> listResult = new ArrayList<>();
		for(CommentEntity entity : listEntity) {
			CommentDto dto = commentConverter.toDto(entity);
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
			listResult.add(dto);
		}
		return listResult;
	}

<<<<<<< HEAD
	@Override
	public List<CommentDTO> findAllCommentBySportField(Long id) {
		List<CommentEntity> entities = commentRepository.findAllBySportFieldId(id); 
		List<CommentDTO> listResult = new ArrayList<>();
		for(CommentEntity entity : entities) {
			CommentDTO dto = commentConverter.toDto(entity);
			listResult.add(dto);
		}
		return listResult;
	}
=======
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
}
