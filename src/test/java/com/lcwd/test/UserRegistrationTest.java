package com.lcwd.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidFirstName_HappyCase() {
        assertTrue(UserRegistration.isValidFirstName("Tanmay"));
    }

    @Test
    void testValidFirstName_SadCase() {
        assertFalse(UserRegistration.isValidFirstName("tanmay"));
    }

    @Test
    void testValidLastName_HappyCase() {
        assertTrue(UserRegistration.isValidLastName("Lohakare"));
    }

    @Test
    void testInvalidLastName_SadCase() {
        assertFalse(UserRegistration.isValidLastName("lohakare"));
        assertFalse(UserRegistration.isValidLastName("L"));
    }

    @Test
    void testValidEmail_HappyCase() {
        assertTrue(userRegistration.isValidEmail("abc@yahoo.com"));
        assertTrue(userRegistration.isValidEmail("abc.100@abc.com"));
    }

    @Test
    void testInValidEmail_SadCase() {
        assertFalse(userRegistration.isValidEmail("abc@.com"));
        userRegistration.isValidEmail("abc123@.com.com");
        userRegistration.isValidEmail(".abc@abc.com");
    }

    @Test
    void testValidMobileNumber_HappyCase() {
        assertTrue(UserRegistration.isValidMobileNumber("91 7499254226"));
    }

    @Test
    void testInvalidMobileNumber_SadCase() {
        assertFalse(UserRegistration.isValidMobileNumber("99 19819801"));
        assertFalse(UserRegistration.isValidMobileNumber("91 99198"));
    }

    @Test
    void testValidPassword_HappyCase() {
        assertTrue(UserRegistration.isValidPassword("Abc@1234"));
    }

    @Test
    void testInvalidPassword_SadCase() {
        assertFalse(UserRegistration.isValidPassword("abc1234"));
        assertFalse(UserRegistration.isValidPassword("Abc1234"));
        assertFalse(UserRegistration.isValidPassword("Ab@1"));
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "Abc+100@gmail.com"
    })
    public void testValidEmails(String email) {
        assertTrue("email should be valid " + email, userRegistration.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com.my",
            "abc123@gmail.a",
            "abc123@.com",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@%*.com",
            "abc..2002@gmail.com",
            "abc.@gmail.com",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a"
    })
    void testInvalidEmails(String email) {
        assertFalse("email should be valid " + email, userRegistration.isValidEmail(email));
    }

}
