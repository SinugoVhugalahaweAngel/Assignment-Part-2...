/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountcreator;
//import Scanner
import java.util.Scanner;
//import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class AccountCreator {
    
    // List to store tasks
//private static ArrayList<Task> tasks = new ArrayList<>();

// Scanner object for user input
//private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        //Object for task
       Task tasks = new Task();
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.println("Enter FirstName:");
        String firstName = sc.nextLine();  

        // Prompt the user to enter their last name
        System.out.println("Enter LastName:");
        String lastName = sc.nextLine();
        
        
         //Create login object
        Login login = new Login(); 
        login.setFirstName(firstName);
        login.setLastName(lastName);
        
        //Prompt the user to enter a username that meet  requirements
         System.out.println("Enter Your Username containing an underscore(_) and no more than 5 characters:");
         String userName = sc.nextLine();

         //Prompt the user to enter a password that meets complexity requirements
        System.out.println("Enter Your Password containing a capital letter, number, special character and at least 8 characters long:");
        String password = sc.nextLine();
        
         // Register the user using the provided username and password
        String registrationMessage = login.registerUser(userName, password,lastName,firstName);
        System.out.println(registrationMessage);
        
        
    //  If registration is successful, proceed to login
        if (registrationMessage.equals("User successfully registered.")) {
            
       // Prompt the user to enter their username for login
         System.out.println("Enter your Username to login:");
         String loginUserName = sc.nextLine();
         
         // Prompt the user to enter their password for login
         System.out.println("Enter your Password to login:");
         String loginPassword = sc.nextLine();
    
         boolean loginSuccess = login.loginUser(loginUserName, loginPassword);
         
           String loginMessage = login.returnLoginStatus(loginSuccess,firstName,lastName);
           System.out.println(loginMessage);
           
            JDialog dialog = new JDialog();
           dialog.setAlwaysOnTop(true);

         if (login.loginUser(loginUserName, loginPassword)) {
                JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanban");
   }
         boolean quit = false;
                while (!quit) {
                    String statusInput = JOptionPane.showInputDialog(dialog, "1. Add Tasks\n2. Show Report\n3. Exit");

                    int statusChoice = Integer.parseInt(statusInput);
                    switch (statusChoice) {
                        case 1: // Add tasks
                            tasks.addTasks(); // Assuming addTasks() uses JOptionPane for input/output
                            break;

                        case 2: // Show report
                            JOptionPane.showMessageDialog(dialog, "Coming Soon");
                            break;

                        case 3: // Quit
                            quit = true;
                            JOptionPane.showMessageDialog(dialog, "Exiting EasyKanban.");
                            break;

                        default:
                            JOptionPane.showMessageDialog(dialog, "Invalid option. Please try again.");
                    }
                }
    }
        }
}



