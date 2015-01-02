package com.kws.bookpals.security.dao;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.UserPassword;
import com.kws.bookpalsfwk.dao.BasicCRUDImpl;

@Repository
public class BookPalUserDAOImpl extends BasicCRUDImpl<BookPalUserE, String> implements BookPalUserDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(BookPalUserDAOImpl.class);

	
	@Override
	public void updateBookPalUserPassword(UserPassword userPassword) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(userPassword);
		logger.info("BookPalUser userPassword updated successfully");
	}
	
/*	@Override
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
*/

}