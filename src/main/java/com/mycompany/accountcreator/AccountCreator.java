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
        
    }
}
