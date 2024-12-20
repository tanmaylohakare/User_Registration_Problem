package com.lcwd.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    void testValidFirstName_HappyCase() {
        assertDoesNotThrow(() -> userRegistration.isValidFirstName("Tanmay")); // Should not throw an exception
    }

    @Test
    void testInvalidFirstName_SadCase() {
        assertThrows(InvalidFirstNameException.class, () -> userRegistration.isValidFirstName("tanmay"));
    }

    @Test
    void testValidLastName_HappyCase() {
        assertDoesNotThrow(() -> userRegistration.isValidLastName("Lohakare")); // Should not throw an exception
    }

    @Test
    void testInvalidLastName_SadCase() {
        assertThrows(InvalidLastNameException.class, () -> userRegistration.isValidLastName("lohakare"));
        assertThrows(InvalidLastNameException.class, () -> userRegistration.isValidLastName("L"));
    }

    @Test
    void testValidEmail_HappyCase() {
        assertDoesNotThrow(() -> userRegistration.isValidEmail("abc@yahoo.com")); // Should not throw an exception
        assertDoesNotThrow(() -> userRegistration.isValidEmail("abc.100@abc.com"));
    }

    @Test
    void testInvalidEmail_SadCase() {
        assertThrows(InvalidEmailException.class, () -> userRegistration.isValidEmail("abc@.com"));
        assertThrows(InvalidEmailException.class, () -> userRegistration.isValidEmail("abc123@.com.com"));
        assertThrows(InvalidEmailException.class, () -> userRegistration.isValidEmail(".abc@abc.com"));
    }

    @Test
    void testValidMobileNumber_HappyCase() {
        assertDoesNotThrow(() -> userRegistration.isValidMobileNumber("91 7499254226")); // Should not throw an exception
    }

    @Test
    void testInvalidMobileNumber_SadCase() {
        assertThrows(InvalidMobileNumberException.class, () -> userRegistration.isValidMobileNumber("99 19819801"));
        assertThrows(InvalidMobileNumberException.class, () -> userRegistration.isValidMobileNumber("91 99198"));
    }

    @Test
    void testValidPassword_HappyCase() {
        assertDoesNotThrow(() -> userRegistration.isValidPassword("Abc@1234")); // Should not throw an exception
    }

    @Test
    void testInvalidPassword_SadCase() {
        assertThrows(InvalidPasswordException.class, () -> userRegistration.isValidPassword("abc1234"));
        assertThrows(InvalidPasswordException.class, () -> userRegistration.isValidPassword("Abc1234"));
        assertThrows(InvalidPasswordException.class, () -> userRegistration.isValidPassword("Ab@1"));
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
    void testValidEmails(String email) {
        assertDoesNotThrow(() -> userRegistration.isValidEmail(email)); // No exception should be thrown for valid emails
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
        assertThrows(InvalidEmailException.class, () -> userRegistration.isValidEmail(email)); // Should throw InvalidEmailException for invalid emails
    }
}
