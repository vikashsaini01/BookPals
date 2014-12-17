package com.kws.bookpals.service;

import com.kws.bookpals.model.BookPalUser;
import com.kws.bookpals.model.BookPalUser_NoPassword;
import com.kws.bookpals.model.UserPassword;

public interface BookPalUserService {
	public void addBookPalUser(BookPalUser p);

	public void updateBookPalUser(BookPalUser p);

	public BookPalUser getBookPalUserByUserName(String username);

	public void removeBookPalUser(BookPalUser p);

	/** Update book pal user profile without password */
	public void updateBookPalUser_NoPassword(BookPalUser_NoPassword p);

	/** Get Book pal user profile without loading password */
	public BookPalUser_NoPassword getBookPalUser_NoPasswordByUserName(
			String username);

	/** Update password for book pal user */
	public void updateBookPalUserPassword(UserPassword userPassword);
}
