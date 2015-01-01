package com.kws.bookpals.security.dao;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.kws.bookpals.entity.BookPalUserE;

public class AppUserDetail implements UserDetails {

	private static final long serialVersionUID = 1111111000002L;

	private String password;

	private String username;

	private Collection<SimpleGrantedAuthority> authorities;

	private BookPalUserE bookPalUser;

	public AppUserDetail(BookPalUserE bookPalUser) {
		this.username = bookPalUser.getUsername();
		this.password = bookPalUser.getPassword();
		this.authorities = new java.util.ArrayList<SimpleGrantedAuthority>();
		this.authorities.add(new SimpleGrantedAuthority(bookPalUser.getRole()));
		this.bookPalUser = bookPalUser;
	}

	public BookPalUserE getBookPalUser() {
		return bookPalUser;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String toString() {
		return "AppUserDetail [password=" + password + ", username=" + username
				+ "]";
	}

}
