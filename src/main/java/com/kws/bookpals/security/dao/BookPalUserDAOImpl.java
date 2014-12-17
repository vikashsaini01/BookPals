package com.kws.bookpals.security.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kws.bookpals.model.BookPalUser;
import com.kws.bookpals.model.BookPalUser_NoPassword;
import com.kws.bookpals.model.UserPassword;

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
	public void addBookPalUser(BookPalUser p) {
		Session session = this.sessionFactory.getCurrentSession();
		p.encodePass();
		session.persist(p);
		logger.info("BookPalUser saved successfully, User Details=" + p);
	}

	@Override
	public void updateBookPalUser(BookPalUser p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("BookPalUser updated successfully, BookPalUser Details="
				+ p);
	}

	@Override
	public BookPalUser getBookPalUserByUserName(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		BookPalUser p = (BookPalUser) session.get(BookPalUser.class,
				new String(username));
		logger.info("BookPalUser loaded successfully, BookPalUser details=" + p);
		return p;
	}

	@Override
	public void removeBookPalUser(String username) {
		logger.info("BookPalUser remove not implemented. Contact Admin.");

	}

	@Override
	public void updateBookPalUser_NoPassword(BookPalUser_NoPassword p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("BookPalUser_NoPassword updated successfully, BookPalUser_NoPassword Details="
				+ p);
	}

	@Override
	public BookPalUser_NoPassword getBookPalUser_NoPasswordByUserName(
			String username) {

		Session session = this.sessionFactory.getCurrentSession();
		BookPalUser_NoPassword p = (BookPalUser_NoPassword) session.get(
				BookPalUser_NoPassword.class, new String(username));
		logger.info("BookPalUser_NoPassword loaded successfully, BookPalUser details="
				+ p);
		return p;
	}

	@Override
	public void updateBookPalUserPassword(UserPassword userPassword) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(userPassword);
		logger.info("BookPalUser userPassword updated successfully");
	}
}