package com.kws.bookpals.entity.request;

public class LoginPropsRO {
	private String i_username;
	private String i_password;

	public LoginPropsRO(String i_username) {
		super();
		this.i_username = i_username;
	}

	public LoginPropsRO() {
		super();
	}

	public String getI_username() {
		return i_username;
	}

	public void setI_username(String i_username) {
		this.i_username = i_username;
	}

	public String getI_password() {
		return i_password;
	}

	public void setI_password(String i_password) {
		this.i_password = i_password;
	}

}
