package com.com3g.myPm.domaine.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.com3g.myPm.domaine.validator.impl.PhoneValidator;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PhoneValidator.class)
public @interface Phone {
	String message() default "{com.bull.grh.business.validator.Phone}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
