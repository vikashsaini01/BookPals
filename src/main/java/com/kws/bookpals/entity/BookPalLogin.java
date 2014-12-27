package com.kws.bookpals.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "bookPalLogin")
public class BookPalLogin {
	
	@OneToOne(mappedBy="bookPalLogin")
	@Cascade(value=CascadeType.ALL)
	private BookPalUser bookPalUser;
	
	private Date insertdate;
	
	private String password;
	
	private String role;
	
	private Date updatedate;
	
	@Id
	@Column(name="username")
	private String username;
	
	public BookPalLogin() {
	
	}

	public BookPalLogin(String username) {
		this();
		this.username = username;
	}

		
	public BookPalLogin(String username, String role) {
		this(username);
		this.role = role;
	}

	public BookPalUser getBookPalUser() {
		return bookPalUser;
	}

	public Date getInsertdate() {
		return insertdate;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public String getUsername() {
		return username;
	}

	public void setBookPalUser(BookPalUser bookPalUser) {
		this.bookPalUser = bookPalUser;
	}
	
	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

	public void setPassword(String password) {
		this.password = password;
	}	

	public void setRole(String role) {
		this.role = role;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}