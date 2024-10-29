/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.accountcreator;

import javax.swing.JOptionPane;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
   
    /**
     * Test of taskStatus method, of class Task.
     */
    @Test
    public void testTaskStatus() {
        System.out.println("taskStatus");
        
        // Define the expected result when the task status is set to "To Do"
        String expResult = "To Do";
        
       // Call the taskStatus method to get the actual result
        String result = Task.taskStatus();
        
        // Check if the actual result matches the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testTaskStatus_2() {
        System.out.println("taskStatus");
        
        // Define the expected result when the task status is set to "Doing"
        String expResult = "Doing";
        
        // Call the taskStatus method to get the actual result
        String result = Task.taskStatus();
        
        // Check if the actual result matches the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testTaskStatus_3() {
        System.out.println("taskStatus");
        
        // Define the expected result when the task status is set to "Doing"
        String expResult = "Done";
        
        // Call the taskStatus method to get the actual result
        String result = Task.taskStatus();
        
         // Check if the actual result matches the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        
        // Define a valid task description with fewer than 50 characters
        String description = "Create login to authenticate users";
        
        // Define the expected result as 'true' since the description is valid
        boolean expResult = true;
        
        //Call the checkTaskDescription method to validate the task description length
        boolean result = Task.checkTaskDescription(description);
        
        // Assert that the method's actual output matches the expected result
        assertEquals(expResult, result);
        
        // Print a confirmation message if the description is correctly validated
        System.out.print("Task succesfully captured");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckTaskDescription_Invalid() {
        System.out.println("checkTaskDescription");
        
        // Define an invalid task description that exceeds 50 characters
        String description = "Create login to authenticate users in the login classs ";
        
        // Define the expected result as 'false' since the description is too long
        boolean expResult =false;
        
        // Call the checkTaskDescription method to validate the task description length
        boolean result = Task.checkTaskDescription(description);
        
        // Assert that the method's actual output matches the expected result
        assertEquals(expResult, result);
        
        // Print a message if the description fails validation due to excessive length
        System.out.print("Please enter a task description of less than 50 characters");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        
        // Define the task name for generating a task ID
        String taskName = "Login Feature";
        
         // Define the developer's name to include in the task ID
        String developerDetails = "Robyn Harrison";
        
         // Set the task number as part of the task ID
        int taskNumber = 0;
        
     // Define the expected result, where the task ID format is assumed to be:
    // the first two letters of the task name, the task number, and
    // the last three letters of the developer's last name
        String expResult = "LO:0:SON";
        
    // Call the createTaskID method with the specified inputs to generate the task ID
        String result = Task.createTaskID(taskName, developerDetails, taskNumber);
        
     // Assert that the actual task ID matches the expected result
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    @Test
    public void testCreateTaskID_2() {
        System.out.println("createTaskID");
        String taskName = "Add Task Feature";
        String developerDetails = "Mike Smith";
        int taskNumber = 0;
        String expResult = "AD:0:ITH";
        String result = Task.createTaskID(taskName, developerDetails, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   
    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours_1() {
        System.out.println("returnTotalHours");
        float expResult = 10F;
        float result = Task.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testReturnTotalHours_2() {
        System.out.println("returnTotalHours");
        float expResult = 12F;
        float result = Task.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
    @Test
    public void testReturnTotalHours_3() {
        System.out.println("returnTotalHours");
        float expResult = 55F;
        float result = Task.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
    
    @Test
    public void testReturnTotalHours_4() {
        System.out.println("returnTotalHours");
        float expResult = 11F;
        float result = Task.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testReturnTotalHours_5() {
        System.out.println("returnTotalHours");
        float expResult = 1F;
        float result = Task.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
     @Test
    public void testReturnTotalHours_totalhours() {
        System.out.println("returnTotalHours");
        float expResult = 89F;
        float result = Task.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
}
