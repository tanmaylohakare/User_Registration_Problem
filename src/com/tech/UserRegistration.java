package com.tech;

import java.util.Scanner;

import javax.naming.Name;

public class UserRegistration {
	public static void main(String[] args) {
		
		System.out.println("WelCome To User Registration Problem ");
		
		Scanner sc=new Scanner(System.in);
		
		//Input for First Name
		System.out.println("Enter your First Name :- ");
		String firstname=sc.nextLine();
		
		//Input For Last Name
		System.out.println("Enter your Last Name :- ");
		String lastname=sc.nextLine();
		
		//Input for email
		System.out.println("Enter the Email Id");
		String email=sc.nextLine();
		
		//Input for Phone Number
		System.out.println("Enter the phone Number :- ");
		String phone=sc.nextLine();
		
		System.out.println("Enter your Password :- ");
        String password = sc.nextLine();
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		// First Name Of User
		if(isValidFirstName(firstname))
		{
			System.out.println("Vailid first name! ");
		}
		else
		{
			System.out.println("Invalid first name. Please ensure it starts  with a capital letter and has at least 3 characters.");
		}
		
		//Last Name Of User
		if(isValidLastName(lastname)) {
			System.out.println("Valid Last Name");
		}
		else
		{
			System.out.println("Inavlid LastName. Please ensure it starts with a capital letter and has at least 3 characters.");
		}
			
		//Email Id Of User
        if(isValidEmail(email))
        {
        	System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid email address. Please ensure it follows the format :- abc.xyz@bl.co");

        }
        //Phone Number of User
        if(isValidMobileNumber(phone))
        {
        	System.out.println("Valid Phone Number");
        }
        else
        {
            System.out.println("Invalid mobile number. Please ensure it follows the format: 91 9919819801");
        }
        //  Vadilate Password
        if (isValidPassword(password)) {
            System.out.println("Valid Password!");
        } else {
            System.out.println("Invalid Password. Ensure it has at least 8 characters,Atlest One Upper Case"
            		+ "");
        }
        
       
    }
	
	
	
	

		// Method for Password
	static boolean isValidPassword(String password) {
		
        return password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");
	}
	
	//Method for Mobilenumber
	static boolean isValidMobileNumber(String mobileNumber) 
	{
        return mobileNumber.matches("^(\\d{2})?\\s?\\d{10}$");
    }
	
	//Method for Email
	static boolean isValidEmail(String email)
	{
	    return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
	}
	
	// Method for LastName
	static boolean isValidLastName(String Lastname) {
		
		return Lastname.matches("^[A-Z][a-z]{2,}$");
	}

	//Method for FirstName
	static boolean isValidFirstName(String name) {
		
        return name.matches("^[A-Z][a-z]{2,}$");
	}
	
	
	
}
