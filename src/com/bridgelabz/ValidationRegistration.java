package com.bridgelabz;

import java.util.Scanner;
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
}

 class UserRegistrationMain{
     public static void main(String[] args) {
    ValidationRegistration validate = new ValidationRegistration();
    validate.firstNameValidation();
     }
    }
