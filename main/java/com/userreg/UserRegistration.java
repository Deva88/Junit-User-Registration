package com.userreg;

import java.util.regex.Pattern;

public class UserRegistration {

    /*UC1 - First name starts with Cap and has minimum 3 characters

     * @Description- class checks the First Name for a user registration
     * a name is valid or not
     */
    public boolean firstName(String fN) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true);

    }
}