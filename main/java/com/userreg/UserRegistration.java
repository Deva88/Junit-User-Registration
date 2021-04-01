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
    //UC2 -Last Name Starts with cap and has minimum 3 characters
    /*@description- last name of user
     * @return string:- return the last name*/
    public boolean lastName(String lN) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true);
    }
}