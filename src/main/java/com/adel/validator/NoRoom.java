package com.adel.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NoRoomValidator.class)
public @interface NoRoom {

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String message() default "NoRoom should be between 1 - 5";

	int lower() default 1;

	int upper() default 5;

}
