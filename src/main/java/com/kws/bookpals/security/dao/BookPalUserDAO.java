package com.kws.bookpals.security.dao;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.UserPassword;
import com.kws.bookpalsfwk.dao.BasicCRUD;

public interface BookPalUserDAO extends BasicCRUD<BookPalUserE, String> {
	
	public void removeBookPalUser(String username);

	public void updateBookPalUserPassword(UserPassword userPassword);
}