package com.com3g.myPm.domaine.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.com3g.myPm.domaine.validator.impl.PasswordValidator;

@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PasswordValidator.class)
public @interface Password {
	String message() default "{com.bull.grh.business.validator.Password}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
