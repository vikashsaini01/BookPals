package com.kws.bookpals.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.kws.bookpals.utils.Gender;

@Entity
@Table(name = "bookPalUser")
public class BookPalUser {
	
	@OneToOne
	@PrimaryKeyJoinColumn
	@Cascade(value=CascadeType.ALL)
	private BookPalLogin bookPalLogin;
	@ManyToOne
	@JoinColumn(name="city")
	private City city;
	private String completeaddress;
	private String country;
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
	@GeneratedValue(generator="gen")
    @GenericGenerator(name="gen", strategy="foreign", parameters={@Parameter(name="property", value="bookPalLogin")})
	private String username;
	private String yearofbirth;
	private String zipcode;
	private String firstname;
	private String lastname;

	public BookPalLogin getBookpalLogin() {
		return bookPalLogin;
	}

	public void setBookpalLogin(BookPalLogin bookpal_login) {
		this.bookPalLogin = bookpal_login;
	}

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

	public BookPalUser() {
	
	}
	public BookPalUser(String username, String role) {
		this.bookPalLogin = new BookPalLogin(username, role);
		this.username = username;
	}
	
	public String getPassword()
	{
		return this.getBookpalLogin().getPassword();
	}
	
	public String getRole()
	{
		return this.getBookpalLogin().getRole();
	}
	
	public void setPassword(String password)
	{
		this.getBookpalLogin().setPassword(password);
	}
	
	public void setRole(String role)
	{
		this.getBookpalLogin().setRole(role);
	}


}