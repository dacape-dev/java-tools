package es.dcarvajal7.tools;

import org.apache.commons.validator.routines.EmailValidator;

public class UserValidator {

    /**
     * EmailValidator class to validate the email, which uses RFC 822 standards
     */
    public static boolean isValidEmail(String email){
        return EmailValidator.getInstance()
                .isValid(email);
    }
}
