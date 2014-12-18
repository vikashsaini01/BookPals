package com.kws.bookpals.security.dao;

import com.kws.bookpals.entity.BookPalUser;
import com.kws.bookpals.entity.UserPassword;

public interface BookPalUserDAO {
	public void addBookPalUser(BookPalUser p);

	public void updateBookPalUser(BookPalUser p);

	public BookPalUser getBookPalUserByUserName(String username);

	public void removeBookPalUser(String username);

	/** Update password for book pal user */
	public void updateBookPalUserPassword(UserPassword userPassword);
}