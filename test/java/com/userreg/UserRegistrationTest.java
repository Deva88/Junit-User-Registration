package com.userreg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {
    UserRegistration ur= new UserRegistration();
    private Assertions Assert;


    @Test
    //create method fNValidation()
    public void fNValidation() {
        Assert.assertTrue(ur.firstName("Devendra"));
    }

    @Test
    //create method lNValidation()
    public void lNValidation()        {
        Assert.assertTrue(ur.lastName("Kumar"));
    }

    @Test
    //create method emailValidation()
    public void emailValidation() {
        Assert.assertTrue(ur.email("devendra.raj.sdm@gmail.com"));
    }
    @Test
    //create method mobileValidation()
    public void mobileValidation() {
        Assert.assertTrue(ur.mobile("91 8123273639"));
    }
    @Test
    //create method passwordValidation()
    public void passwordValidation() {
        Assert.assertTrue(ur.password("devendrapassword"));
    }
    @Test
    //create method passwordValidationRule2()
    public void passwordValidationRule2() {
        Assert.assertTrue(ur.passwordRule2("devendraPassword"));
    }

    @Test
    //create method passwordValidationRule3()
    public void passwordValidationRule3() {
        Assert.assertTrue(ur.passwordRule3("devendra5Password"));
    }

    @Test
    //create method passwordValidationRule4()
    public void passwordValidationRule4() {
        Assert.assertTrue(ur.passwordRule4("devendra5@Password"));
    }
}
