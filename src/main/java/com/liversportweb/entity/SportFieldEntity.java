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
@Table(name="sport_field")
public class SportFieldEntity {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column(name="information")
	private String info;
	
	@Column
	private Long price;
	
	@Column
	private int status;
	
	@Column
	private String address;
	
	@Column
	private String district;
	
	@Column
	private String city;
	
	@Column
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity category;
	
	@OneToMany(mappedBy="sport_field_id"	)
	private List<BookingEntity> booking;
	
<<<<<<< HEAD
<<<<<<< HEAD
	@OneToMany(mappedBy = "sportField")
	private List<CommentEntity> commentList;
	
	@OneToOne(mappedBy="mySportFieldEntity")
	private UserEntity owner;
	
=======
	@OneToMany(mappedBy = "spottField")
	private List<CommentEntity> comments = new ArrayList<>();
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
=======
>>>>>>> parent of 97e4850 (new)
	
	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public List<BookingEntity> getBooking() {
		return booking;
	}

	public void setBooking(List<BookingEntity> booking) {
		this.booking = booking;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
<<<<<<< HEAD

<<<<<<< HEAD
	public UserEntity getOwner() {
		return owner;
	}

	public void setOwner(UserEntity owner) {
		this.owner = owner;
	}
=======
>>>>>>> parent of 97e4850 (new)
	
=======
	public List<CommentEntity> getComments() {
		return comments;
	}

	public void setComments(List<CommentEntity> comments) {
		this.comments = comments;
	}
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
	
}
