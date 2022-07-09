package es.dcarvajal7.tools.validator;

import java.util.regex.Pattern;

public class PersonalData {
    public static boolean isValidEmail(String email){
        final String REGEX = "^(?:[^.\\s])\\S*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        return Pattern.compile(REGEX)
                .matcher(email)
                .matches();
    }
}
