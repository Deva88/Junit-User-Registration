package com.userreg;

import java.util.regex.Pattern;

public class UserRegistration {


    // UC1 - First name starts with Cap and has minimum 3 characters
    public boolean firstName(String fN) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true);

    }
}