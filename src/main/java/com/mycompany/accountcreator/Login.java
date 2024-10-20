/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountcreator;
//Import Scanner
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
    //Creating object for a scanner
    private Scanner input = new Scanner(System.in);

    private String userName;
    private String firstName;
    private String lastName;
    private String password; 
    
    
    // Constructor to initialize username and password
    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    // Getters and Setters for userName
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    // Getters and Setters for FirstName
     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    // Getters and Setters for LastName
     public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    //Getters and Setters for Password
     public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    // This Method ensures that any username contains an under score(_) and length is no more than 5
    public  boolean checkUserName(String username) {
        // Ensure the username contains an underscore and is no more than 5 characters
        return username.length() <= 5 && username.contains("_");
    }
    
     
    // This method ensures that password meet the following password complexity rules ,the password must be:Atleast 8 characters long ,Contains capital letter,Contains a number,Contains special character 
    
    public boolean checkPasswordComplexity(String password) {
        
        // Flags for password complexity checks
        boolean hasCapital = false;
        boolean hasSpecialCharacter = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);// Get character at index i

            if (Character.isUpperCase(c)) {
                hasCapital = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialCharacter = true;// Check for special character
            }
        }

        // At least 8 characters, a capital letter, a number, and a special character
        return password.length() >= 8 && hasCapital && hasSpecialCharacter && hasDigit;
    }
    
     /* This method returns the necessary registreation messading indicating if the username is incorrectly formatted,The password does not meet complexity requrements
    The two abvve conditions have been and user has been registered successfully
    */
    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        } else {
            this.userName = username;
            this.password = password;
            return "User successfully registered.";
        }
    }
    
    // This  Method Verifies that login details entered matches the login details stored when the userregistered
    public boolean loginUser(String userName, String password) {
        return this.userName.equals(userName) && this.password.equals(password);
    }
    
    // This method returns the necessary messaging for :A successful log in ,A Failed log in 
    public String returnLoginStatus(boolean loginSuccess) {
        if (loginSuccess) {
            return "Welcome " + this.firstName + " " + this.lastName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
