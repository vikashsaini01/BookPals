package com.kws.bookpals.service;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.UserPassword;
import com.kws.bookpalsfwk.service.BasicService;

public interface BookPalUserService extends BasicService<BookPalUserE, String> {
	/** Update password for book pal user */
	public void updateBookPalUserPassword(UserPassword userPassword);
}
