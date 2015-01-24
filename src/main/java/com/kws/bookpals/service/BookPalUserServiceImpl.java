package com.kws.bookpals.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.UserPassword;
import com.kws.bookpals.security.dao.BookPalUserDAO;
import com.kws.bookpalsfwk.service.BasicServiceImpl;

@Service
@Transactional
public class BookPalUserServiceImpl extends BasicServiceImpl<BookPalUserE, String> implements BookPalUserService {
	private static final Logger logger = LoggerFactory
			.getLogger(BookPalUserServiceImpl.class);

	@Autowired
	private BookPalUserDAO bookPalUserDAO;
	
	
	@Override
	public void updateBookPalUserPassword(UserPassword userPassword) {
		this.bookPalUserDAO.updateBookPalUserPassword(userPassword);
	}
	
	
	@Override
	@PostConstruct
	public void setupService() {
		this.basicCRUD = bookPalUserDAO ;
		this.clazz = BookPalUserE.class;
		this.basicCRUD.setupEntityClass(BookPalUserE.class);
	}
	
	
	@Override
	public BookPalUserE insert(BookPalUserE object)  {
		return basicCRUD.insert(object);
	}
}
