/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personalinfo;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Registration {


   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        System.out.print("Phone number: ");
        String cellphone = scanner.nextLine();

 
        Login newUser  = new Login("Kyl_1", "Ch&&sec@ke99", "+27838968976");

  
        boolean isUsernameValid = newUser.checkUsername();
        boolean isPasswordValid = newUser.checkPasswordComplexity(password);
        String registrationResult = newUser.registerUser (isUsernameValid, isPasswordValid);

        
        if (!registrationResult.equals("REGISTRATION SUCCESSFUL")) {
            System.out.println(registrationResult); 
            return;
        }

        
        System.out.println("Login");
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();


        String loginResult = newUser .returnLoginStatus(newUser .loginUser (inputUsername, inputPassword));
        System.out.println(loginResult); 


    }
}

    

