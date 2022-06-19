package com.adel.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NoRoomValidator implements ConstraintValidator<NoRoom, Integer> {

	int lower;
	int upper;

	@Override
	public void initialize(NoRoom noRoom) {

		this.lower = noRoom.lower();
		this.upper = noRoom.upper();
	}

	@Override
	public boolean isValid(Integer noOfRooms, ConstraintValidatorContext context) {

		if (noOfRooms == null) {
			return false; // fail
		} else if (noOfRooms < lower || noOfRooms > upper) {
			return false;// fail
		}

		return true; // pass
	}

}
