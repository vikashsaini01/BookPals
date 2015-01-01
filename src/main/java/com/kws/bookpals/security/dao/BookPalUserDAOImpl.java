package com.kws.bookpals.security.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.UserPassword;

@Repository
public class BookPalUserDAOImpl implements BookPalUserDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(BookPalUserDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addBookPalUser(BookPalUserE p) {
		Session session = this.sessionFactory.getCurrentSession();
		//p.encodePass();
		session.persist(p);
		logger.info("BookPalUser saved successfully, User Details=" + p);
	}

	@Override
	public void updateBookPalUser(BookPalUserE p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("BookPalUser updated successfully, BookPalUser Details="
				+ p);
	}

	@Override
	public BookPalUserE getBookPalUserByUserName(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		BookPalUserE p = (BookPalUserE) session.get(BookPalUserE.class,
				new String(username));
		logger.info("BookPalUser loaded successfully, BookPalUser details=" + p);
		return p;
	}

	@Override
	public void removeBookPalUser(String username) {
		logger.info("BookPalUser remove not implemented. Contact Admin.");

	}

	
	@Override
	public void updateBookPalUserPassword(UserPassword userPassword) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(userPassword);
		logger.info("BookPalUser userPassword updated successfully");
	}
}