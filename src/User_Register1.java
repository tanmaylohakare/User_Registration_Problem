package com.lcwd.test;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem");

        // Define lambda expressions for validation
        Predicate<String> isValidFirstName = name -> name.matches("^[A-Z][a-z]{2,}$");
        Predicate<String> isValidLastName = lastName -> lastName.matches("^[A-Z][a-z]{2,}$");
        Predicate<String> isValidEmail = email -> email.matches("^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+$");
        Predicate<String> isValidPhoneNumber = phone -> phone.matches("^(\\d{2})?\\s?\\d{10}$");
        Predicate<String> isValidPassword = password -> password.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");

        Scanner sc = new Scanner(System.in);

        // Input for First Name
        System.out.println("Enter your First Name:");
        String firstName = sc.nextLine();
        if (!isValidFirstName.test(firstName)) {
            System.out.println("Invalid First Name");
            return;
        }

        // Input for Last Name
        System.out.println("Enter your Last Name:");
        String lastName = sc.nextLine();
        if (!isValidLastName.test(lastName)) {
            System.out.println("Invalid Last Name");
            return;
        }

        // Input for Phone Number
        System.out.println("Enter your Phone Number:");
        String phone = sc.nextLine();
        if (!isValidPhoneNumber.test(phone)) {
            System.out.println("Invalid Phone Number");
            return;
        }

        // Input for Email Address
        System.out.println("Enter your Email Address:");
        String email = sc.nextLine();
        if (!isValidEmail.test(email)) {
            System.out.println("Invalid Email Address");
            return;
        }

        // Input for Password
        System.out.println("Enter your Password:");
        String password = sc.nextLine();
        if (!isValidPassword.test(password)) {
            System.out.println("Invalid Password");
            return;
        }

        System.out.println("User registration successful!");
    }
}
