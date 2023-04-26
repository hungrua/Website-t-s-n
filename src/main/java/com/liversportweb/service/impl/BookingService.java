package com.liversportweb.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liversportweb.DTO.BookingDTO;
import com.liversportweb.converter.BookingConverter;
import com.liversportweb.entity.BookingEntity;
import com.liversportweb.repository.BookingRepository;
import com.liversportweb.repository.SportFieldRepository;
import com.liversportweb.repository.UserRepository;
import com.liversportweb.service.IBookingService;
@Service
public class BookingService implements IBookingService {
	
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SportFieldRepository sportFieldRepository;
	
	@Autowired
	BookingConverter bookingConverter;
	
	@Override
	public BookingDTO save(BookingDTO dto)  {
		BookingEntity book = bookingRepository.findByBookingTimeAndBookingDate(dto.getBookingTime(),dto.getBookingDate());
		if(book != null) {
			return new BookingDTO();
		}
		else {
			BookingEntity entity = new BookingEntity();
			if(dto.getId()!=null) {
				BookingEntity oldEntity= bookingRepository.findOne(dto.getId());
				entity = bookingConverter.toEntity(dto, oldEntity);
			}
			else entity = bookingConverter.toEntity(dto);
			entity.setUser(userRepository.findOne(dto.getUserId()));
			entity.setSport_field_id(sportFieldRepository.findOne(dto.getSportFieldId()));
			entity = bookingRepository.save(entity);
			return bookingConverter.toDTO(entity);
		}
	}

	@Override
	public void delete(Long id) {
			bookingRepository.delete(id);
	}

	@Override
	public List<BookingDTO> getAllByUserName(String userName) {
		List<BookingDTO> matches = new ArrayList<BookingDTO>();
		List<BookingEntity> entities = new ArrayList<BookingEntity>();
		entities = bookingRepository.findAllByUser(userRepository.findOneByUserName(userName));
		for(BookingEntity x : entities) {
			matches.add(bookingConverter.toDTO(x));
		}
		Collections.sort(matches);
		return matches;
	}

	@Override
	public List<BookingDTO> getAllByCategory(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BookingDTO> getAllMatchBySportField( Long id) {
		List<BookingDTO> result = new ArrayList<BookingDTO>();
		List<BookingEntity> matches = bookingRepository.findAllByMySportField(id);
		for(BookingEntity x : matches) {
			result.add(bookingConverter.toDTO(x));
		}
		Collections.sort(result);
		return result;
	}


}
