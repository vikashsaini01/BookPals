package com.kws.bookpals.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class CityE {
	String code;
	@Id
	String city;

	public CityE() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public CityE(String code, String city) {
		this.code = code;
		this.city = city;
	}
}
