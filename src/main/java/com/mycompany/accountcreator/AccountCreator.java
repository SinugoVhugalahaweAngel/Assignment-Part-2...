/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountcreator;
//import Scanner
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class AccountCreator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.println("Enter FirstName:");
        String firstName = sc.nextLine();  

        // Prompt the user to enter their last name
        System.out.println("Enter LastName:");
        String lastName = sc.nextLine();
        
        
         //Create login object
        Login login = new Login(firstName, lastName); 
        login.setFirstName(firstName);
        login.setLastName(lastName);
        
        //Prompt the user to enter a username that meet  requirements
         System.out.println("Enter Your Username containing an underscore(_) and no more than 5 characters:");
         String userName = sc.nextLine();

         //Prompt the user to enter a password that meets complexity requirements
        System.out.println("Enter Your Password containing a capital letter, number, special character and at least 8 characters long:");
        String password = sc.nextLine();
        
    }
}
