package com.nuno.phonenumbers.model;

import java.util.regex.Pattern;


public class Customer {

	private long id;
	private String name;
	private String phone;
	private String countryCode;
	private String country;
	private String state;
	
	public Customer() {
		
	}
	
	public Customer(long id,String name, String phone) {	
		this.id = id;
		this.name = name;
		setState(phone);
		String [] splittedPhone = phone.split(" ");
		this.phone = splittedPhone[1];
		setCountryCode("+" + splittedPhone[0].replaceAll("[^a-zA-Z0-9]", ""));
		setCountry(this.countryCode);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String countryCode) {
		switch(countryCode) {
			case "+237": this.country = "Cameroon"; break;
			case "+251": this.country = "Ethiopia"; break;
			case "+212": this.country = "Morocco"; break;
			case "+258": this.country = "Mozambique"; break;
			case "+256": this.country = "Uganda"; break;
			default: this.country = "No Match";
		}
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String phone) {
		this.state = "Not";
		if(Pattern.matches("\\(237\\)\\ ?[2368]\\d{7,8}$", phone)) {
			this.state = "Valid";
		}
		if(Pattern.matches("\\(251\\)\\ ?[1-59]\\d{8}$", phone)) {
			this.state = "Valid";
		}
		if(Pattern.matches("\\(212\\)\\ ?[5-9]\\d{8}$", phone)) {
			this.state = "Valid";
		}
		if(Pattern.matches("\\(258\\)\\ ?[28]\\d{7,8}$", phone)) {
			this.state = "Valid";
		}
		if(Pattern.matches("\\(256\\)\\ ?\\d{9}$", phone)) {
			this.state = "Valid";
		}		
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", countryCode=" + countryCode
				+ ", country=" + country + ", state=" + state + "]";
	}
	
}
