package com.liversportweb.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.FetchType;
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class CommentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
<<<<<<< HEAD
	@Column(name = "content", columnDefinition = "LONGTEXT")
=======
	@Column(name = "content", columnDefinition = "text")
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
	private String content;
	
	@Column(name = "create_date")
	private Date createDate;
	
<<<<<<< HEAD
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@ManyToOne
=======
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	@ManyToOne(fetch = FetchType.LAZY)
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
	@JoinColumn(name = "sport_field_id")
	private SportFieldEntity sportField;


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getId() {
		return id;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public SportFieldEntity getSportField() {
		return sportField;
	}

	public void setSportField(SportFieldEntity sportField) {
		this.sportField = sportField;
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 56914b6e1a73aae1a48292180d0540c59fca59a1
