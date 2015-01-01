package com.kws.bookpals.service;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.UserPassword;

public interface BookPalUserService {
	public void addBookPalUser(BookPalUserE p);

	public void updateBookPalUser(BookPalUserE p);

	public BookPalUserE getBookPalUserByUserName(String username);

	public void removeBookPalUser(BookPalUserE p);

	/** Update password for book pal user */
	public void updateBookPalUserPassword(UserPassword userPassword);
}
