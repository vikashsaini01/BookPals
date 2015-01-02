package com.kws.bookpals.security.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.service.BookPalUserService;

@Repository
public class AppUserDetailsServiceDAO implements UserDetailsService,
		ApplicationContextAware {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired(required = true)
	private BookPalUserService bookPalUserService;
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired(required = true)
	public void setBookPalUserService(BookPalUserService bookPalUserService) {
		this.bookPalUserService = bookPalUserService;
	}

	@Override
	public UserDetails loadUserByUsername(final String username)
			throws UsernameNotFoundException {
		UserDetails userDetails = null;
		try {
			BookPalUserE bookPalUser = this.bookPalUserService
					.findById(username);
			userDetails = new AppUserDetail(bookPalUser);
		} catch (Exception exception) {

		}
		return userDetails;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.applicationContext = arg0;

	}

}