package springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class PostalCodeConstraintValidator implements ConstraintValidator<PostalCode, String> {

    private String postalCodePrefix;
    @Override
    public void initialize(PostalCode thePostalCode) {
        postalCodePrefix = thePostalCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if(theCode != null)
        result = theCode.startsWith(postalCodePrefix);
        else
            result=false;
        return result;
    }
}
