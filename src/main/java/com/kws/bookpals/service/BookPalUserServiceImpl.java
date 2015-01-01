package com.kws.bookpals.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.UserPassword;
import com.kws.bookpals.security.dao.BookPalUserDAO;

@Service
public class BookPalUserServiceImpl implements BookPalUserService {
	private static final Logger logger = LoggerFactory
			.getLogger(BookPalUserServiceImpl.class);

	@Autowired
	private BookPalUserDAO bookPalUserDAO;

	@Autowired
	public void setBookPalUserDAO(BookPalUserDAO bookPalUserDAO) {
		this.bookPalUserDAO = bookPalUserDAO;
	}

	@Override
	@Transactional
	public void addBookPalUser(BookPalUserE p) {
		this.bookPalUserDAO.addBookPalUser(p);

	}

	@Override
	@Transactional
	public void updateBookPalUser(BookPalUserE p) {
		this.bookPalUserDAO.updateBookPalUser(p);
	}

	@Override
	@Transactional
	public BookPalUserE getBookPalUserByUserName(String username) {
		logger.info("getBokPalUserByUserName()");
		return this.bookPalUserDAO.getBookPalUserByUserName(username);
	}

	@Override
	@Transactional
	public void removeBookPalUser(BookPalUserE p) {
		// User is just marked deleted
		p.setDeletedate(new Date());
		this.bookPalUserDAO.updateBookPalUser(p);
	}

	
	@Override
	@Transactional
	public void updateBookPalUserPassword(UserPassword userPassword) {
		this.bookPalUserDAO.updateBookPalUserPassword(userPassword);
	}
}
