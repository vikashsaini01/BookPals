package com.kws.bookpals.controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.kws.bookpals.entity.BookPalUserE;
import com.kws.bookpals.entity.request.BookPalUserRO;
import com.kws.bookpals.security.dao.AppUserDetail;
import com.kws.bookpals.service.BookPalUserService;
import com.kws.bookpals.service.CityService;
import com.kws.bookpals.utils.C;
import com.kws.bookpals.utils.FormFiller;

@Controller
public class BookPalUserController {
	private static final Logger logger = LoggerFactory
			.getLogger(BookPalUserController.class);

	private BookPalUserService bookPalUserService;
	private CityService cityService;

	
	
	@Autowired
	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}

	
	
	@Autowired(required = true)
	public void setBookPalUserService(BookPalUserService bookPalUserService) {
		this.bookPalUserService = bookPalUserService;
	}

	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
	
	

	@RequestMapping(value = "/bookuser/add" , method = RequestMethod.POST)
	public String addBookPalUser(@ModelAttribute(C.BOOKPALUSER) BookPalUserRO p,
			Model model) {
		
		try{
			this.bookPalUserService.insert(p.getBookPalUser(null));
			return "redirect:/login/get/" + p.getUsername();
		}
		catch(Exception exception)
		{}
		return "redirect:/login";
	}

	
	
	@RequestMapping(value = "/bookuser/update", method = RequestMethod.POST)
	public String updateBookPalUser(
			@ModelAttribute(C.BOOKPALUSER) BookPalUserRO p,
			SessionStatus sessionStatus) {
		try {
			this.bookPalUserService.update(p.getBookPalUser());
		} catch (Exception ex) {
		}
		return C.VIEW_HOME;
	}
	
	
	
	
	@RequestMapping(value = "/bookuser/edit")
	public String editBookPalUser(Principal principal, Model model,
			HttpSession session) {
		BookPalUserRO myUser = ((AppUserDetail) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal())
				.getBookPalUser().getBookPalUserRO();
		model.addAttribute(C.BOOKPALUSER, myUser);
		FormFiller.fillCityDropDowns(cityService, model);
		FormFiller.fillDOBDropDowns(model);
		return C.VIEW_EDIT_USER;
	}

	
	
	
	
	@RequestMapping("bookuser/remove")
	public String removePerson(@ModelAttribute(C.BOOKPALUSER) BookPalUserE p) {
		try{
		this.bookPalUserService.delete(p);
		}
		catch(Exception exception){
			
		}
		return "userdelete";
	}
}