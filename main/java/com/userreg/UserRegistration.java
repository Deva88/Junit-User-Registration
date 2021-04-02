package com.userreg;

import java.util.regex.Pattern;

public class UserRegistration {

    /*UC1 - First name starts with Cap and has minimum 3 characters
     * @Description- checks the First Name for registration
     * a name is valid or not
     */
    public boolean firstName(String fN) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", fN) == true);
    }
    /*UC2 -Last Name Starts with cap and has minimum 3 characters
     *@description- Check last name for registration a name is valid or not
     *@return string:- return the last name
     */
    public boolean lastName(String lN) {
        return (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lN) == true);
    }

    /*UC 3 - enter a valid email
     *@description-checking email is in correct form or not
     * @return string:- return the emil id for validation
     * E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co)
     */
    public boolean email(String emailId) {
        return (Pattern.matches("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", emailId) == true);
    }

    /* UC4 - Mobile Format
     *@description: class to checking user Phone Number by regular expression
     *check Phone Number is valid with country code using regular expression
     */
    public boolean mobile(String mobileNum) {
        return(Pattern.matches("(0|91)?\\s{1}[6-9][0-9]{9}", mobileNum) == true);
    }
}