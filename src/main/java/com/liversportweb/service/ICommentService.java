package com.liversportweb.service;

import java.util.List;

import com.liversportweb.DTO.CommentDto;

public interface ICommentService {
	CommentDto saveOrUpdate(CommentDto comment, Long id);
	void delete(Long id);
	List<CommentDto> findAll();
}
