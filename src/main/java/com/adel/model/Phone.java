package com.adel.model;

public class Phone {

	private String countryCode ;
	private String uerNumber   ;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getUerNumber() {
		return uerNumber;
	}
	public void setUerNumber(String uerNumber) {
		this.uerNumber = uerNumber;
	}
	@Override
	public String toString() {
		return  getCountryCode()  + "-" + getUerNumber();
	}
}
