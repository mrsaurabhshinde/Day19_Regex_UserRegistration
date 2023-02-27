package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationRegistration {
Scanner sc = new Scanner(System.in);
    public void firstNameValidation(){
        System.out.print("Enter a first name: ");
        String firstname = sc.nextLine();
      if(Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstname)){
        System.out.println("The first name is valid");
      }else{
          System.out.println("The first name is invalid");
      }
    }

    public void lastNameValidation(){
        System.out.print("Enter a Last name: ");
        String lastname = sc.nextLine();
        if(Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastname)){
            System.out.println("The Last name is valid");
        }else{
            System.out.println("The Last name is invalid");
        }
    }

    public void emailValidation(){
        System.out.print("Enter your Email Id: ");
        String email=sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.][0-9a-zA-Z]+)*@[a-zA-Z]+.[a-z]{2,3}([.][a-z]{2,3})*$");
        Matcher matcher = pattern.matcher(email);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("The email id is valid");
        }else {
            System.out.println("The email id is invalid");
            emailValidation();
        }
    }

    public void mobileValidation(){
        System.out.print("Enter you mobile number: ");
        String mobileno =  sc.nextLine();
        Pattern pattern = Pattern.compile("^[1-9]{2}\\s[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobileno);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("Mobile number is valid");
        }else {
            System.out.println("Mobile number is invalid");
             mobileValidation();
        }
    }

    public void passwordValidationRule1(){
        System.out.print("Enter a password: ");
        String password =  sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-z1-9]{8,}$");
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("your password is valid");
        }else {
            System.out.println("your password is invalid, pls give correct format");
            passwordValidationRule1();
        }
    }

    public void passwordValidationRule2(){
        System.out.print("Enter a password: ");
        String password =  sc.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z]{1,}[a-zA-z1-9]{7,}$");
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.find();
        if(matches){
            System.out.println("your password is valid");
        }else {
            System.out.println("your password is invalid, pls give correct format");
            passwordValidationRule2();
        }
    }

}

 class UserRegistrationMain{
     public static void main(String[] args) {
    ValidationRegistration validate = new ValidationRegistration();
    validate.firstNameValidation();
    validate.lastNameValidation();
    validate.emailValidation();
    validate.mobileValidation();
    validate.passwordValidationRule1();
    validate.passwordValidationRule2();

     }
    }

