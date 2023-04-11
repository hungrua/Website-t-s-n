package com.liversportweb.api.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liversportweb.DTO.CommentDto;
import com.liversportweb.service.ICommentService;

@RestController
public class CommentApi {

	@Autowired
	private ICommentService commentService;
	
	@PostMapping("/user/comment/{id}")
	public CommentDto postComment(@PathVariable("id") String id, @RequestBody CommentDto comment) {
		CommentDto res = commentService.saveOrUpdate(comment, Long.valueOf(id));
		return res;
	}	
	
	@PutMapping("/user/comment/{id}")
	public CommentDto putComment(@PathVariable("id") String id, @RequestBody CommentDto comment) {
		CommentDto res = commentService.saveOrUpdate(comment, Long.valueOf(id));
		return res;
	}	
	
	@GetMapping("/user/comment")
	public List<CommentDto> getList() {
		List<CommentDto> res = commentService.findAll();
		return res;
	}
	
	@DeleteMapping("/user/comment/{id}")
	public String deleteComment(@PathVariable("id") String id) {
		commentService.delete(Long.valueOf(id));
		return "success";
	}
}
	
