/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.accountcreator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "Kyl_1";
       // Login instance = null;
       Login instance = new Login();
       instance.setUserName(username);
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // Print the result for manual verification
        System.out.println("Result for '" + username + "': " + result);

      
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
   @Test
       public void testCheckUserName_Invalid() {
        System.out.println("checkUserName");
        String username = "Kyle!!!!!!";
       // Login instance = null;
       Login instance = new Login();
       instance.setUserName(username);
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        
        // Print the result for manual verification
        System.out.println("username is not correctly formatted,Please ensure that your username contains underscore and is no more than 5 characters  in length");

        

      
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
       
       /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        
        //valid password ( meet complexity requirements)
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        instance.setPassword(password);
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        
         // Assert that the result matches the expected result
        assertEquals(expResult, result);
        // Print a message: "Password successfully captured
        System.out.println("Password successfully captured");
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckPasswordComplexity_Invalid() {
        System.out.println("checkPasswordComplexity");
        
        //Invalid password (does not meet complexity requirements)
        String password = "password";
        Login instance = new Login();
        instance.setPassword(password);
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        
        // Assert that the result matches the expected result
        assertEquals(expResult, result);
        
        /* Print: "Password is not correctly formatted,Password is not correctly formatted, please ensure the password
        contains at least 8 characters, a capital letter, a number, and a special character."
        */
        System.out.println("password is not correctly formatted ,Please ensure that the password contains atleast 8 characters ,a capital letter,a number and a special character");
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "Kyl_1";//valid username (with underscore)
        String password = "Ch&&sec@ke99!";// Valid password
        String firstName ="";
        String lastName = "";
        Login instance = new Login();
        //instance.registerUser(password,username,firstName,lastName);

        String expResult = "User successfully registered.";
        String result = instance.registerUser(username, password,firstName,lastName);
        
        // Assert that the result matches the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testRegisterUser_InvalidUsername() {
        System.out.println("registerUser with invalid username");
        String username = "Kyle!!!!!!";  // Invalid username (no underscore)
        String password = "Ch&&sec@ke99!";  // Valid password
         String firstName ="";
        String lastName = "";
        Login instance = new Login();
        instance.registerUser(password,username,firstName,lastName);
        String expResult = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        String result = instance.registerUser(username, password,firstName,lastName);
        // Assert that the result matches the expected result
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRegisterUser_InvalidPassword() {
        System.out.println("registerUser with invalid password");

        // Set test data
        String username = "Kyl_1";  // Valid username
        String password = "password";  // Invalid password (no capital letter, no number, no special character)
        String firstName ="";
        String lastName = "";
        // Create an instance of the login system
        Login instance = new Login( );
        instance.registerUser(password,username,firstName,lastName);
        // Expected result for invalid password
        String expResult = "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";

        // Perform the test
        String result = instance.registerUser(username, password,lastName,firstName);

        // Assert that the result matches the expected result
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String userName = "Kyl_1";
        String password = "Ch&&sec@ke99!";
         // Create an instance of the login system
        Login instance = new Login( );
        instance.setUserName(userName);
        instance.setPassword(password);
        boolean expResult = true;
        boolean result = instance.loginUser(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testLoginUserInvalid() {
        System.out.println("loginUser with invalid credentials");

        // Set up test data
        String username = "Kyl_1";  //registered username
        String password = "password";  // Incorrect password

        // Create an instance of the login system and register a user
        Login instance = new Login(  );
        //instance.registerUser("username"," password");  // Registered with valid credentials
        instance.setUserName(username);
        instance.setPassword("Ch&&sec@ke99!");

        // Expected result 
        boolean expResult = false;

       
        boolean result = instance.loginUser(username, password);

        // Assert that the result matches the expected output
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testReturnLoginStatus_Invalid() {
        System.out.println("returnLoginStatus");
        boolean loginSuccess = false;
        String firstName = "Angel";
        String lastName = "Sinugo";
        Login instance = new Login( );
        String expResult = "Username or password incorrect, please try again.";
        String result = instance.returnLoginStatus(loginSuccess,firstName,lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
   
    @Test
    public void testReturnLoginStatus_Valid() {
        System.out.println("returnLoginStatus");
        boolean loginSuccess = true;
        Login instance = new Login();
        String firstName = "Angel";
        String lastName = "Sinugo";
        String expResult = "Welcome " + firstName + " " + lastName + ", it is great to see you again.";
        String result = instance.returnLoginStatus(loginSuccess,firstName,lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
    
    
