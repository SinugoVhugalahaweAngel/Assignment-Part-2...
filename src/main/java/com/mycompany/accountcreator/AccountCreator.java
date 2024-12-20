/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountcreator;
//import Scanner
import java.util.Scanner;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class AccountCreator {
    
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
         String optionInput = JOptionPane.showInputDialog(dialog,
                            "1. Add Tasks\n" +
                            "2. Show Report\n" +
                            "3. Display Tasks with Status 'Done'\n" +
                            "4. Display Task with Longest Duration\n" +
                            "5. Search Task by Name\n" +
                            "6. Search Tasks by Developer\n" +
                            "7. Delete Task by Name\n" +
                            "8. Exit");  
         
         
                    int option = Integer.parseInt(optionInput);
                    switch (option) {
                        case 1: // Add tasks
                            tasks.addTasks(); // Add tasks using JOptionPane for input/output
                            break;

                        case 2: // Show report
                            tasks.displayReport(); // Display full report
                            break;

                        case 3: // Display tasks with status 'done'
                            tasks.displayDoneTasks();
                            break;

                        case 4: // Display task with the longest duration
                            tasks.displayLongestTask();
                            break;
                            
                             case 5: // Search for a task by name
                            String searchName = JOptionPane.showInputDialog(dialog, "Enter the task name to search:");
                            tasks.searchTaskByName(searchName);
                            break;

                        case 6: // Search for tasks assigned to a developer
                            String developerName = JOptionPane.showInputDialog(dialog, "Enter the developer's name to search:");
                            tasks.searchTasksByDeveloper(developerName);
                            break;

                        case 7: // Delete a task by name
                            String deleteTaskName = JOptionPane.showInputDialog(dialog, "Enter the task name to delete:");
                            tasks.deleteTaskByName(deleteTaskName);
                            break;

                        case 8: // Quit
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







