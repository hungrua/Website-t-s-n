package com.liversportweb.converter;

import java.sql.Date;
import java.sql.Time;

import org.springframework.stereotype.Component;

import com.liversportweb.DTO.BookingDTO;
import com.liversportweb.entity.BookingEntity;

@Component
public class BookingConverter {
	public BookingDTO toDTO(BookingEntity entity) {
		BookingDTO result = new BookingDTO();
		result.setId(entity.getId());
		result.setBookingTime(TimeToString(entity.getBookingTime()));
		result.setBookingDate(DateToString(entity.getBookingDate()));
		result.setPrice(entity.getSport_field_id().getPrice());
		result.setSportFieldName(entity.getSport_field_id().getName());
		result.setUserName(entity.getUser().getUserName());
		result.setUserId(entity.getUser().getId());
		result.setSportFieldId(entity.getSport_field_id().getId());
		return result;
	}
	
	public BookingEntity toEntity(BookingDTO dto) {
		BookingEntity entity = new BookingEntity();
		entity.setId(dto.getId());
		entity.setBookingDate(StringToDate(dto.getBookingDate()));
		entity.setBookingTime(StringToTime(dto.getBookingTime()));
		return entity;
	}
	public BookingEntity toEntity(BookingDTO dto,BookingEntity entity) {
		entity.setId(dto.getId());
		entity.setBookingDate(StringToDate(dto.getBookingDate()));
		entity.setBookingTime(StringToTime(dto.getBookingTime()));
		return entity;
	}
	
	private String DateToString(Date x) {
		return x.toString() ;
	}
	private String TimeToString(Time x) {
		return x.toString();
	}
	private Date StringToDate(String x)   {
		return Date.valueOf(x) ;
	}
	private Time StringToTime(String x)   {
		return Time.valueOf(x) ;
	}
	
}
