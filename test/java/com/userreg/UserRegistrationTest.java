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
}
