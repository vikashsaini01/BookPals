package com.kws.bookpals.security.dao;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.kws.bookpals.entity.BookPalUser;

public class AppUserDetail implements UserDetails {

	private static final long serialVersionUID = 1111111000002L;

	private String password;

	private String username;

	private Collection<SimpleGrantedAuthority> authorities;

	private BookPalUser bookPalUser;

	public AppUserDetail(BookPalUser bookPalUser) {
		this.username = bookPalUser.getUsername();
		this.password = bookPalUser.getBookpalLogin().getPassword();
		this.authorities = new java.util.ArrayList<SimpleGrantedAuthority>();
		this.authorities.add(new SimpleGrantedAuthority(bookPalUser.getBookpalLogin().getRole()));
		this.bookPalUser = bookPalUser;
	}

	public BookPalUser getBookPalUser() {
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
