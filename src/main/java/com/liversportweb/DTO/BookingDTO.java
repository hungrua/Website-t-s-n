package com.liversportweb.DTO;

public class BookingDTO {
	private Long id, sportFieldId,userId;
	private String bookingDate, bookingTime;
	private Long price;
	private String sportFieldName;
	private String userName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getSportFieldName() {
		return sportFieldName;
	}
	public void setSportFieldName(String sportFieldName) {
		this.sportFieldName = sportFieldName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getSportFieldId() {
		return sportFieldId;
	}
	public void setSportFieldId(Long sportFieldId) {
		this.sportFieldId = sportFieldId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
}
