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
       Login instance = new Login(  username,  "Anything");
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
       Login instance = new Login(  username,  "Anything");
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
        Login instance = new Login(  password,  "Anything");
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        
         // Assert that the result matches the expected result
        assertEquals(expResult, result);
        // Print a message: "Password successfully captured
        System.out.println("Password successfully captured");
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
}