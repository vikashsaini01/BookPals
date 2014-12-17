package com.kws.bookpals.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;

@Entity
@Table(name = "book_users")
@Embeddable
public class UserPassword {

	@Id
	private String username;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String password;
	@Transient
	@SuppressWarnings("deprecation")
	private PasswordEncoder encoder = new Md5PasswordEncoder();

	@SuppressWarnings("deprecation")
	@Transient
	public void encodePass() {
		this.password = encoder.encodePassword(this.password, null);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
