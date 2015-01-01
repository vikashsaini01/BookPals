package com.kws.bookpals.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.kws.bookpals.entity.request.BookPalUserRO;
import com.kws.bookpals.utils.Gender;

@Entity
@Table(name = "bookPalUser")
public class BookPalUserE {
	
	@ManyToOne
	@JoinColumn(name="city")
	private City city;
	private String completeaddress;
	private String country;
	private String role;
	private String password;
	private String countrycode;
	private Date deletedate;
	private String dayofbirth;
	private String monthofbirth;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private Date insertdate;
	private String landmark;
	private String mobileno;
	private String occupationid;
	private String state;
	private Date updatedate;
	@Id
	@Column(name="username") 
	private String username;
	private String yearofbirth;
	private String zipcode;
	private String firstname;
	private String lastname;

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public City getCity() {
		return this.city;
	}

	public String getCompleteaddress() {
		return this.completeaddress;
	}

	public String getCountry() {
		return this.country;
	}

	public String getCountrycode() {
		return this.countrycode;
	}

	public Date getDeletedate() {
		return this.deletedate;
	}

	public Date getDob() {
		return null;
	}

	public Gender getGender() {
		return this.gender;
	}

	public Date getInsertdate() {
		return this.insertdate;
	}

	public String getLandmark() {
		return this.landmark;
	}

	public String getMobileno() {
		return this.mobileno;
	}

	public String getOccupationid() {
		return this.occupationid;
	}

	public String getState() {
		return this.state;
	}

	public Date getUpdatedate() {
		return this.updatedate;
	}

	public String getUsername() {
		return this.username;
	}

	public String getYearofbirth() {
		return this.yearofbirth;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void setCompleteaddress(String completeaddress) {
		this.completeaddress = completeaddress;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public void setDeletedate(Date deletedate) {
		this.deletedate = deletedate;
	}

	public void setDob(Date dob) {
		// this.dob = dob;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public void setOccupationid(String occupationid) {
		this.occupationid = occupationid;
	}
	public void setState(String state) {
		this.state = state;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setYearofbirth(String yearofbirth) {
		this.yearofbirth = yearofbirth;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getDayofbirth() {
		return dayofbirth;
	}

	public void setDayofbirth(String dayofbirth) {
		this.dayofbirth = dayofbirth;
	}

	public String getMonthofbirth() {
		return monthofbirth;
	}

	public void setMonthofbirth(String monthofbirth) {
		this.monthofbirth = monthofbirth;
	}

	public BookPalUserE() {
	
	}
	public BookPalUserE(String username, String role) {
		this.role = role;
		this.username = username;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public String getRole()
	{
		return this.role;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public void setRole(String role)
	{
		this.role = role;
	}

	public BookPalUserRO getBookPalUserRO()
	{
		BookPalUserRO bookPalUserRO = new BookPalUserRO();
		bookPalUserRO.setBookPalUserRO(this);
		return bookPalUserRO;
	}

}