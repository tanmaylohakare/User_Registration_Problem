package com.lcwd.test;

import java.util.Scanner;
public class UserRegistration
{

    public static void main( String[] args )
    {
System.out.println("WelCome To User Registration Problem ");

        UserRegistration userRegistration = new UserRegistration();

    Scanner sc=new Scanner(System.in);


    //Input for First Name
		System.out.println("Enter your First Name :- ");
    String firstname=sc.nextLine();

    //Input For Last Name
		System.out.println("Enter your Last Name :- ");
    String lastname=sc.nextLine();

    //Input for Phone Number
		System.out.println("Enter the phone Number :- ");
    String phone=sc.nextLine();

        System.out.println("Enter the Email Address:- ");
        String email=sc.nextLine();

		System.out.println("Enter your Password :- ");
    String password = sc.nextLine();

}
    private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$";;
    private static final String MOBILE_REGEX = "^[0-9]{1,3} [0-9]{10}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";



// Method for Password
public void isValidPassword(String password) throws InvalidMobileNumberException {
    if (!password.matches(PASSWORD_REGEX));
    throw new InvalidMobileNumberException("Invalid Mobile Number ");

}
//Method for Mobilenumber
public void isValidMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
    if (!mobileNumber.matches(MOBILE_REGEX));
    throw new InvalidMobileNumberException("Invalid Mobile Number ");
}

//Method for Email
public void  isValidEmail(String email) throws InvalidEmailException {
        if(!(email.matches(EMAIL_REGEX)))
                throw new InvalidEmailException("Inavlid Email");
}
// Method for LastName
    public  void isValidLastName(String Lastname) throws InvalidLastNameException
{   if(!Lastname.matches(NAME_REGEX))
    throw new InvalidLastNameException("In valid Last Name");
}
//Method for FirstName
    public  void isValidFirstName(String name) throws InvalidFirstNameException {
    if( !name.matches(NAME_REGEX)){
        throw new InvalidFirstNameException("Invalid first Name");
    }
}
    Validator<String> validateFirstName = firstName -> firstName.matches(NAME_REGEX);
    Validator<String> validateLastName = LastName -> LastName.matches(NAME_REGEX);
    Validator<String> validateEmail = email -> email.matches(EMAIL_REGEX);
    Validator<String> validatePassword = password-> password.matches(PASSWORD_REGEX);
    Validator<String> validateMobileNumber = mobileNumber -> mobileNumber.matches(MOBILE_REGEX);


    // Method to validate all user details
    public void validateUserDetails(String firstName, String lastName, String email, String mobile, String password) throws InvalidFirstNameException, InvalidLastNameException, InvalidEmailException, InvalidMobileNumberException, InvalidPasswordException {
        if (!validateFirstName.Validator(firstName)) {
            throw new InvalidFirstNameException("Invalid First Name.");
        }
        if (!validateLastName.Validator(lastName)) {
            throw new InvalidLastNameException("Invalid Last Name.");
        }
        if (!validateEmail.Validator(email)) {
            throw new InvalidEmailException("Invalid Email.");
        }
        if (!validateMobileNumber.Validator(mobile)) {
            throw new InvalidMobileNumberException("Invalid Mobile Number.");
        }
        if (!validatePassword.Validator(password)) {
            throw new InvalidPasswordException("Invalid Password.");
        }
        System.out.println("All user details are valid.");
    }
}
