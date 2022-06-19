package com.adel.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.adel.model.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {
    
	@Override
	public String print(Phone object, Locale locale) {
		return null;
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		Phone phone = new Phone();

		// Split the String received from user
		String[] phoneNumber = completePhoneNumber.split("-");
		// Weather the number consists of -
		int index = completePhoneNumber.indexOf('-');

		// if the string does not have '-' or start '-' add +375
		if (index == -1 || completePhoneNumber.startsWith("-")) {

			// if the '-' is not found, then add +375
			phone.setCountryCode("+375");
			if (completePhoneNumber.startsWith("-")) {

				phone.setUerNumber(phoneNumber[1]);
			} else {
				phone.setUerNumber(phoneNumber[0]);
			}
		}else {
			   
			 //extract the countryCode and set it to the phone class countryCode
			 phone.setCountryCode(phoneNumber[0]);
			 phone.setUerNumber(phoneNumber[1]);
		}    
		return phone; 
	}
}
