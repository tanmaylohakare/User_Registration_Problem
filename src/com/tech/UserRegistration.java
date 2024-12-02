package com.tech;

import java.util.Scanner;

import javax.naming.Name;

public class UserRegistration {
	public static void main(String[] args) {
		
		System.out.println("WelCome To User Registration Problem ");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your First Name :- ");
		String firstname=sc.nextLine();
		
		if(isValidFirstName(firstname))
		{
			System.out.println("Vailid first name! ");
		}
		else
		{
			System.out.println("Invalid first name. Please ensure it starts  with a capital letter and has at least 3 characters.");
		}
		
		
	}

	private static boolean isValidFirstName(String name) {
		
        return name.matches("[A-Z][a-z]{2,}");
	}

}
