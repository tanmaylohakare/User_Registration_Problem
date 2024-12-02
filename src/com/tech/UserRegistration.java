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
		
		
	}

	private static boolean isValidEmail(String email) {
		return email.matches("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$");
	}

	private static boolean isValidLastName(String Lastname) {
		
		return Lastname.matches("[A-Z][a-z]{2,}");
	}

	private static boolean isValidFirstName(String name) {
		
        return name.matches("[A-Z][a-z]{2,}");
	}

}
