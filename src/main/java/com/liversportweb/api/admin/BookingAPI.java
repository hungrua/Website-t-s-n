package com.liversportweb.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liversportweb.DTO.BookingDTO;
import com.liversportweb.service.IBookingService;

@RestController(value="admin-booking")
public class BookingAPI {
	
	@Autowired
	private IBookingService bookingService;
	
	@PutMapping(value="/bookings/{id}")
	public BookingDTO update(@RequestBody BookingDTO model, @PathVariable("id") long id)  {
		model.setId(id);
		return bookingService.save(model);
	}
	
	@DeleteMapping(value="/bookings")
	public void delete(@RequestBody Long [] ids) {
		bookingService.delete(ids);
	}
	
}
