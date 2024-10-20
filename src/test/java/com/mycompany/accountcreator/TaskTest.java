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
public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addTasks method, of class Task.
     */
    @Test
    public void testAddTasks() {
       // System.out.println("addTasks");
       //task tasks = new Task();
        /*//Task.addTasks();
        Task.taskName[0]="Login Feature";
        Task.taskDescription[0] = "Create login to authenticate users";
        Task.developerDetails[0] = "Robyn Harrison";
        task.taskDuration[0] = 8;
        task.taskStatus[0] = "To Do";
        task.taskID[0] = task.createTaskID(task.taskName[0], 1, task.developerDetails[0]);
*/
        
        Task.taskName = new String[1];  // Assuming you want to add only one task
        Task.taskDescription = new String[1];
        Task.developerDetails = new String[1];
        Task.taskDuration = new float[1];
        Task.menu = new String[1];
        Task.taskID = new String[1];  // Assuming you forgot to initialize this

// Assign values to the arrays
         Task.taskName[0] = "Login Feature";
         Task.taskDescription[0] = "Create login to authenticate users";
         Task.developerDetails[0] = "Robyn Harrison";
         Task.taskDuration[0] = 8;
         Task.menu[0] = "To Do";
        
         // Correct the method call to createTaskID
Task.taskID[0] = Task.createTaskID(Task.taskName[0], Task.developerDetails[0], 1);

// Print the details to verify
System.out.println("Task Name: " + Task.taskName[0]);
System.out.println("Task Description: " + Task.taskDescription[0]);
System.out.println("Developer Details: " + Task.developerDetails[0]);
System.out.println("Task Duration: " + Task.taskDuration[0] + " hours");
System.out.println("Task Status: " + Task.menu[0]);
System.out.println("Task ID: " + Task.taskID[0]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of taskStatus method, of class Task.
     */
    @Test
    public void testTaskStatus() {
        System.out.println("taskStatus");
        String expResult = "";
        String result = Task.taskStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String description = "";
        boolean expResult = false;
        boolean result = Task.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "";
        String developerDetails = "";
        int taskNumber = 0;
        String expResult = "";
        String result = Task.createTaskID(taskName, developerDetails, taskNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        int index = 0;
        String taskID = "";
        String expResult = "";
        String result = Task.printTaskDetails(index, taskID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        float expResult = 0.0F;
        float result = Task.returnTotalHours();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
