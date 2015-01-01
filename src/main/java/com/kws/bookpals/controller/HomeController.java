package com.kws.bookpals.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kws.bookpals.entity.request.BookPalUserRO;
import com.kws.bookpals.entity.request.LoginProps;
import com.kws.bookpals.service.CityService;
import com.kws.bookpals.utils.C;
import com.kws.bookpals.utils.FormFiller;

@Controller
public class HomeController {


	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	
	
	@Autowired
	private CityService cityService;

	
	
	

	@Autowired
	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}

	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    sdf.setLenient(true);
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	

	@RequestMapping(value = { "/home", "/" }, method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpSession session) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return C.VIEW_HOME;
	}


	
	
	
	@RequestMapping(value = "/login/get/{userid}")
	public ModelAndView loginGet(@PathVariable("userid") String userid) {
		logger.info(" login");
		ModelAndView modelAndView = new ModelAndView(C.VIEW_LOGIN);
		modelAndView.addObject(C.BOOKPALUSER, new BookPalUserRO());
		modelAndView.addObject(C.LOGIN_PROPS, new LoginProps(userid));
		FormFiller.fillCityDropDowns(cityService, modelAndView);
		FormFiller.fillBirthYearDropDown(modelAndView);
		return modelAndView; 
	}

	
	
	
	@RequestMapping(value = "/login")
	public ModelAndView login() {
		logger.info(" login");
		ModelAndView modelAndView = new ModelAndView(C.VIEW_LOGIN);
		modelAndView.addObject(C.BOOKPALUSER, new BookPalUserRO());
		modelAndView.addObject(C.LOGIN_PROPS, new LoginProps());
		FormFiller.fillCityDropDowns(cityService, modelAndView);
		FormFiller.fillBirthYearDropDown(modelAndView);
		return modelAndView;
	}

	
	
	
	@RequestMapping(value = "/logout")
	public String logout() {
		logger.info(" logout");
		return C.VIEW_LOGOUT;
	}

	
	
	
	@RequestMapping(value = "/emp/session")
	public String session(HttpServletRequest request, Model model) {
		logger.info(" usersession");
		return "usersession";
	}

	
	
	
	@RequestMapping(value = "/denied")	
	public String denied() {
		logger.info(" denied");
		return "denied";
	}
	
}