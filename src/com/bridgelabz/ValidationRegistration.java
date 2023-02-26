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
        System.out.println("Enter your Email Id: ");
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


}

 class UserRegistrationMain{
     public static void main(String[] args) {
    ValidationRegistration validate = new ValidationRegistration();
    validate.firstNameValidation();
    validate.lastNameValidation();
    validate.emailValidation();
     }
    }
