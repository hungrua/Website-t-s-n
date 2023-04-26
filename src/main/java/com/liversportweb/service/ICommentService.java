package com.liversportweb.service;

import java.util.List;

<<<<<<< HEAD
import com.liversportweb.DTO.CommentDTO;

public interface ICommentService {
	CommentDTO saveOrUpdate(CommentDTO comment, Long id);
	void delete(Long id);
	List<CommentDTO> findAllCommentBySportField(Long id);
=======
import com.liversportweb.DTO.CommentDto;

public interface ICommentService {
	CommentDto saveOrUpdate(CommentDto comment, Long id);
	void delete(Long id);
	List<CommentDto> findAll();
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
}
