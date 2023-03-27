package com.liversportweb.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table (name="user")
public class UserEntity {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column
	private String password;
	
	@Column
	private String fullname;
	
	@Column 
	private String email;
	
	@Column 
	private String district;
	
	@Column 
	private String city;
	
	@ManyToOne
	@JoinColumn(name="role_code")
	private RoleEntity role ;
	
	@OneToMany(mappedBy="user")
	private List<BookingEntity> bookingList;
	
	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}
	
	public List<BookingEntity> getBookingList() {
		return bookingList;
	}

	public void setBookingList(List<BookingEntity> bookingList) {
		this.bookingList = bookingList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
