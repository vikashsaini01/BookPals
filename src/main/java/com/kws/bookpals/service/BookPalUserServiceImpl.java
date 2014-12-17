package com.kws.bookpals.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kws.bookpals.model.BookPalUser;
import com.kws.bookpals.model.BookPalUser_NoPassword;
import com.kws.bookpals.model.UserPassword;
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
	public void addBookPalUser(BookPalUser p) {
		this.bookPalUserDAO.addBookPalUser(p);

	}

	@Override
	@Transactional
	public void updateBookPalUser(BookPalUser p) {
		this.bookPalUserDAO.updateBookPalUser(p);
	}

	@Override
	@Transactional
	public BookPalUser getBookPalUserByUserName(String username) {
		logger.info("getBokPalUserByUserName()");
		return this.bookPalUserDAO.getBookPalUserByUserName(username);
	}

	@Override
	@Transactional
	public void removeBookPalUser(BookPalUser p) {
		// User is just marked deleted
		p.setDeletedate(new Date());
		this.bookPalUserDAO.updateBookPalUser(p);
	}

	@Override
	@Transactional
	public void updateBookPalUser_NoPassword(BookPalUser_NoPassword p) {
		this.bookPalUserDAO.updateBookPalUser_NoPassword(p);
	}

	@Override
	@Transactional
	public BookPalUser_NoPassword getBookPalUser_NoPasswordByUserName(
			String username) {
		return this.getBookPalUser_NoPasswordByUserName(username);
	}

	@Override
	@Transactional
	public void updateBookPalUserPassword(UserPassword userPassword) {
		this.bookPalUserDAO.updateBookPalUserPassword(userPassword);
	}
}
