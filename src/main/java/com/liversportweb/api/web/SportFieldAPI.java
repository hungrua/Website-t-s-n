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

import com.liversportweb.DTO.SportFieldDTO;
import com.liversportweb.service.ISportFieldService;

@RestController(value="user-sport-field")
public class SportFieldAPI {
	
	@Autowired
	private ISportFieldService sportFieldService;
	
	@GetMapping(value="/field-user/{id}")
	public SportFieldDTO findOne(@PathVariable("id") String id) {
		return sportFieldService.findOneById(Long.parseLong(id));
	}
	@PostMapping(value="/field-user")
	public List<SportFieldDTO> get(@RequestBody SportFieldDTO dto){
		List<SportFieldDTO> list = sportFieldService.getByCondition( dto);
		return list;
	}
	
//	@PostMapping(value ="/field-user")
//	public SportFieldDTO save( @RequestBody SportFieldDTO dto) {
//		return sportFieldService.save(dto);
//	}
	@PutMapping(value="/field-user/{id}")
	public SportFieldDTO update(@RequestBody SportFieldDTO model, @PathVariable("id") long id ) {
		model.setId(id);
		return sportFieldService.save(model);
	}
	
	@DeleteMapping(value="/field-user")
	public void delete(@RequestBody Long []ids) {
		sportFieldService.delete(ids);
	}
}
