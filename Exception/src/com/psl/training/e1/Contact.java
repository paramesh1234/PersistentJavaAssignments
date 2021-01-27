package com.psl.training.e1;

import java.sql.Date;
import java.util.regex.Pattern;


public class Contact {
	private String firstName, middleName, lastName, gender, area, city, pincode, state, 
	country, telephoneNumber, mobileNumber, email, website; 
	private Date dateOfBirth, anniversary;
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(String firstName, String middleName, String lastName, String gender, String area, String city,
			String pincode, String state, String country, String telephoneNumber, String mobileNumber, String email,
			String website, Date dateOfBirth, Date anniversary) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.website = website;
		this.dateOfBirth = dateOfBirth;
		this.anniversary = anniversary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getAnniversary() {
		return anniversary;
	}
	public void setAnniversary(Date anniversary) {
		this.anniversary = anniversary;
	}
	public void validate(String firstName,String lastName,Date dateOfBirth,String email,
			String telephoneNumber,String mobileNumber ) throws Exception {
		if(firstName.trim()=="")
			throw new FirstNameException("First name should not be empty.");
		if(firstName.isBlank())
			throw new FirstNameException("First name should not be empty.");
		for (int i = 0; i < firstName.length(); i++) {
			if((firstName.charAt(i)>='a'&&firstName.charAt(i)<='z')||
					firstName.charAt(i)>='A'&&firstName.charAt(i)<='Z')
				continue;
			else
				throw new FirstNameException("Name should contain only alphabets.");
		}
		if(lastName.trim()=="")
			throw new FirstNameException("Last name should not be empty.");
		if(lastName.isBlank())
			throw new FirstNameException("First name should not be empty.");
		for (int i = 0; i < lastName.length(); i++) {
			if((lastName.charAt(i)>='a'&&lastName.charAt(i)<='z')||
					lastName.charAt(i)>='A'&&lastName.charAt(i)<='Z')
				continue;
			else
				throw new FirstNameException("Name should contain only alphabets.");
		}
		 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                 "[a-zA-Z0-9_+&*-]+)*@" + 
                 "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                 "A-Z]{2,7}$"; 
                   
		 Pattern pat = Pattern.compile(emailRegex); 
		 if (email == null) 
			 throw new NullPointerException("Email is empty");
		 if(pat.matcher(email).matches()==false)
			 throw new SyntaxWrong("Email is not in correct format");
		 if(telephoneNumber.isBlank() && mobileNumber.isBlank())
			 throw new NullPointerException("Atleast one number need to be provided");
	}
}
