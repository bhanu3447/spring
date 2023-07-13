package org.bhanu.ums.dto;

import java.io.Serializable;

public class RegisterDto implements Serializable
{
   private String firstName;
   
   private String contactNumber;
   
   private String country;
  
   private String email;
   
   private String password;

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getContactNumber() {
	return contactNumber;
}

public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "RegisterDto [firstName=" + firstName + ", contactNumber=" + contactNumber + ", country=" + country
			+ ", email=" + email + ", password=" + password + "]";
}
   
  
}
