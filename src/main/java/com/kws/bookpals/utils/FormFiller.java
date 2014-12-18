package com.kws.bookpals.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.kws.bookpals.entity.City;
import com.kws.bookpals.service.CityService;

public final class FormFiller {

	private static List<Integer> yearList = null;
	private static Map<Integer, String> monthMap = null;
	private static List<Integer> dayList = null;

	public static void fillCityDropDowns(CityService cityService,
			ModelAndView modelAndView) {
		modelAndView.addObject(C.CITYLIST, fillCityDropDowns(cityService));
	}

	public static void fillCityDropDowns(CityService cityService, Model model) {
		model.addAttribute(C.CITYLIST, fillCityDropDowns(cityService));
	}

	private static List<City> fillCityDropDowns(CityService cityService) {
		return cityService.getAllCities();
	}

	public static void fillDOBDropDowns(ModelAndView modelAndView) {
		modelAndView.addObject(C.BIRTH_YEAR_LIST, yearList);
		modelAndView.addObject(C.MONTH_LIST, monthMap);
		modelAndView.addObject(C.DAY_LIST, dayList);
	}

	public static void fillBirthYearDropDown(ModelAndView modelAndView) {
		modelAndView.addObject(C.BIRTH_YEAR_LIST, yearList);
	}

	public static void fillDOBDropDowns(Model model) {
		model.addAttribute(C.BIRTH_YEAR_LIST, yearList);
		model.addAttribute(C.MONTH_LIST, monthMap);
		model.addAttribute(C.DAY_LIST, dayList);
	}

	static {
		yearList = new ArrayList<Integer>();
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		for (int i = 0; i < 100; i++) {
			yearList.add(currentYear);
			currentYear--;
		}

		monthMap = new HashMap<Integer, String>();
		monthMap.put(1, "Jan");
		monthMap.put(2, "Feb");
		monthMap.put(3, "Mar");
		monthMap.put(4, "Apr");
		monthMap.put(5, "May");
		monthMap.put(6, "Jun");
		monthMap.put(7, "Jul");
		monthMap.put(8, "Aug");
		monthMap.put(9, "Sep");
		monthMap.put(10, "Oct");
		monthMap.put(11, "Nov");
		monthMap.put(12, "Dec");

		dayList = new ArrayList<Integer>();
		for (int i = 1; i <= 31; i++){
			dayList.add(i);
		}
	}

	private FormFiller() throws Exception {
		throw new Exception(
				"FormFiller can't be initialized. It has only static supporting functions");
	}
}
