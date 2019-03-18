package com.com3g.myPm.domaine.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.com3g.myPm.domaine.validator.Name;

public class NameValidator implements ConstraintValidator<Name, String> {
	private final String NAME_REGEXP = "([a-zA-ZàáâäãåèéêëìíîïòóôöõøùúûüÿýñçčšžÀÁÂÄÃÅÈÉÊËÌÍÎÏÒÓÔÖÕØÙÚÛÜŸÝÑßÇŒÆČŠŽ∂ð]|-|\\s){2,20}+";

	public void initialize(Name constraintAnnotation) { }

	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null || value.trim().equals("")) return true;
		return value.matches(NAME_REGEXP);
	}
}
