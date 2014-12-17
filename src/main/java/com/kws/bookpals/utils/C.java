package com.kws.bookpals.utils;

/**
 * 
 * @author hp1 Class keeps constants used in application
 */
public final class C {

	/**
	 * Value = cityList Variable name on forms for city drop down
	 */
	public static final String CITYLIST = "cityList";

	/**
	 * Value = bookPalUser bookPalUser for spring model Model holds instance of
	 * BookPalUser class
	 */
	public static final String BOOKPALUSER = "bookPalUser";

	/**
	 * Value = bookPalUser_NoPassword bookPalUser for spring model with no
	 * access to user password Model holds instance of class
	 * BookPalUser_NoPassword
	 */
	public static final String BOOKPALUSER_NO_PASSWORD = "bookPalUser_NoPassword";

	/**
	 * Value = loginProps loginProps for spring model Model holds instance of
	 * loginProps
	 */
	public static final String LOGIN_PROPS = "loginProps";

	/**
	 * Value = ROLE_USER ROLE_USER , Having access to all pages except
	 * administrator functions
	 */
	public static final String ROLE_USER = "ROLE_USER";

	/** value = yearlist */
	public static final String BIRTH_YEAR_LIST = "yearlist";

	/** value = monthlist */
	public static final String MONTH_LIST = "monthlist";

	/** value = daylist */
	public static final String DAY_LIST = "daylist";

	/* View Names Start */

	/** Value = login */
	public static final String VIEW_LOGIN = "login";
	/** Value = home */
	public static final String VIEW_HOME = "home";
	/** Value = editprofile */
	public static final String VIEW_EDIT_USER = "editprofile";
	/** Value = logout */
	public static final String VIEW_LOGOUT = "logout";

	/* View Names End */

	/** Empty String */
	public static final String EMPTY_STRING = "";

	private C() throws Exception {
		throw new Exception(
				"Constants can't be initialized. It is only having constants");
	}
}