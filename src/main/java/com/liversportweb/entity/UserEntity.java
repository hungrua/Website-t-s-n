package com.liversportweb.entity;

import java.util.ArrayList;
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
	private String phone;
	
	@Column 
	private String district;
	
	@Column 
	private String city;
	
	@Column
	private String image;
	


	@ManyToOne
	@JoinColumn(name="role_code")
	private RoleEntity role ;
	
	@OneToMany(mappedBy="user")
	private List<BookingEntity> bookingList;
	
<<<<<<< HEAD
	@OneToMany(mappedBy = "user")
<<<<<<< HEAD
	private List<CommentEntity> commentList;
	
	@OneToOne
	@JoinColumn(name="mySportField")
	private SportFieldEntity mySportFieldEntity;
	
	
	
=======
	private List<CommentEntity> comments = new ArrayList<>();
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
	
=======
>>>>>>> parent of 97e4850 (new)
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
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
