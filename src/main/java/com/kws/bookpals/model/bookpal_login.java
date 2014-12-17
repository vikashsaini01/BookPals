package com.kws.bookpals.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bookpal_login")
public class bookpal_login {
	
	@Id
	private String username;
	
	private String password;
	
	private String role;
	
	@OneToOne  
	private BookPalUser bookPalUser;
	
	private Date insertdate;
	
	private Date updatedate;
	
	public BookPalUser getBookPalUser() {
		return bookPalUser;
	}

	public void setBookPalUser(BookPalUser bookPalUser) {
		this.bookPalUser = bookPalUser;
	}

		
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getInsertdate() {
		return insertdate;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}	
	
	/* Constructors */

	public bookpal_login() {
	
	}
	public bookpal_login(String username) {
		this();
		this.username = username;
	}
	public bookpal_login(String username, String role) {
		this(username);
		this.role = role;
	}

}