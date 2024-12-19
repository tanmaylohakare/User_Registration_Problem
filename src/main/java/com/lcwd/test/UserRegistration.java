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


// Method for Password
public void isValidPassword(String password) throws InvalidMobileNumberException {
    if (!password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$"));
    throw new InvalidMobileNumberException("Invalid Mobile Number ");

}
//Method for Mobilenumber
public void isValidMobileNumber(String mobileNumber) throws InvalidMobileNumberException {
    if (!mobileNumber.matches("^(\\d{2})?\\s?\\d{10}$"));
    throw new InvalidMobileNumberException("Invalid Mobile Number ");
}
//Method for Email
public void  isValidEmail(String email) throws InvalidEmailException {
        if(!(email.matches("^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$")))
        throw new InvalidEmailException("Inavlid Email");


}
// Method for LastName
    public  void isValidLastName(String Lastname) throws InvalidLastNameException
{   if(!Lastname.matches("^[A-Z][a-z]{2,}$"))
    throw new InvalidLastNameException("In valid Last Name");
}
//Method for FirstName
    public  void isValidFirstName(String name) throws InvalidFirstNameException {
    if( !name.matches("^[A-Z][a-z]{2,}$")){
        throw new InvalidFirstNameException("Invalid first Name");
    }
}
}
