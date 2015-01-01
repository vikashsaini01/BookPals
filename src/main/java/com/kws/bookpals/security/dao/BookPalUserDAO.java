package com.kws.bookpals.security.dao;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.UserPassword;

public interface BookPalUserDAO {
	public void addBookPalUser(BookPalUserE p);

	public void updateBookPalUser(BookPalUserE p);

	public BookPalUserE getBookPalUserByUserName(String username);

	public void removeBookPalUser(String username);

	/** Update password for book pal user */
	public void updateBookPalUserPassword(UserPassword userPassword);
}