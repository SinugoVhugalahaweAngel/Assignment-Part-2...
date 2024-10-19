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
}
