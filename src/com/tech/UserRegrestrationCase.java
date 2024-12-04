package com.tech;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class UserRegrestrationCase {

    @Test
    void testValidFirstName_HappyCase() {
        assertTrue(UserRegistration.isValidFirstName("Tanmay"));
    }

    @Test
    void testValidFirstName_SadCase() {
        assertFalse(UserRegistration.isValidFirstName("tanmay"));
       
    }

    private void assertFalse(boolean validFirstName) {
		// TODO Auto-generated method stub
		
	}

	@Test
    void testValidLastName_HappyCase() {
		assertTrue(UserRegistration.isValidLastName("Lohakare"));
    }

    @Test
    void testValidLastName_SadCase() {
        assertFalse(UserRegistration.isValidLastName("lohakare"));
        assertFalse(UserRegistration.isValidLastName("L"));
    }

    
    
    
    @Test
    void testValidEmail_HappyCase() {
        assertFalse(UserRegistration.isValidEmail("abc@yahoo.com"));
        assertFalse(UserRegistration.isValidEmail("abc.100@abc.com"));
    }

    @Test
    void testValidEmail_SadCase() {
        assertFalse(UserRegistration.isValidEmail("abc@.com"));
        assertFalse(UserRegistration.isValidEmail("abc123@.com.com"));
        assertFalse(UserRegistration.isValidEmail(".abc@abc.com"));
    }

    @Test
    void testValidMobileNumber_HappyCase() {
        assertFalse(UserRegistration.isValidMobileNumber("91 7499254226"));
    }

    @Test
    void testValidMobileNumber_SadCase() {
        assertFalse(UserRegistration.isValidMobileNumber("9919819801"));
        assertFalse(UserRegistration.isValidMobileNumber("91 99198"));
    }

    @Test
    void testValidPassword_HappyCase() {
        assertFalse(UserRegistration.isValidPassword("Abc@1234"));
    }

    @Test
    void testValidPassword_SadCase() {
        assertFalse(UserRegistration.isValidPassword("abc1234"));
        assertFalse(UserRegistration.isValidPassword("Abc1234"));
        assertFalse(UserRegistration.isValidPassword("Ab@1"));
    }
    
    
    
}
