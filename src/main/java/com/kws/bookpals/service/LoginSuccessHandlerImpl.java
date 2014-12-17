package com.kws.bookpals.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

@Service
public class LoginSuccessHandlerImpl extends
		SavedRequestAwareAuthenticationSuccessHandler {

	@Autowired
	private BookPalUserService bookPalUserService;

	@Autowired
	public void setBookPalUserService(BookPalUserService bookPalUserService) {
		this.bookPalUserService = bookPalUserService;
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		// httpServletRequest.getSession().setAttribute(Constants.CURRENT_USER_PROFILE,
		// bookPalUserService.getBookPalUserByUserName(authentication.getName()));
		super.onAuthenticationSuccess(httpServletRequest, response,
				authentication);

	}

}
