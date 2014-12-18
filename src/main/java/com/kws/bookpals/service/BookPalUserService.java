package com.kws.bookpals.service;

import com.kws.bookpals.entity.BookPalUser;
import com.kws.bookpals.entity.UserPassword;

public interface BookPalUserService {
	public void addBookPalUser(BookPalUser p);

	public void updateBookPalUser(BookPalUser p);

	public BookPalUser getBookPalUserByUserName(String username);

	public void removeBookPalUser(BookPalUser p);

	/** Update password for book pal user */
	public void updateBookPalUserPassword(UserPassword userPassword);
}
