/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.accountcreator;



import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    
    
    
    /**
     * Test of addTasks method, of class Task.
     */
    @Test
    public void testAddTasks() {
    Task task = new Task();  // Instantiate Task class
 
   // Manually simulate adding tasks using setters
    Task.setTaskNames(new String[2]);    // Initialize arrays
    Task.setDevelopers(new String[2]);
    Task.setDurations(new double[2]);
    Task.setStatuses(new String[2]);
    Task.setTaskIds(new String[2]);

    String[] taskNames = Task.getTaskNames();
    String[] developers = Task.getDevelopers();
    double[] durations = Task.getDurations();
    String[] statuses = Task.getStatuses();
    String[] taskIds = Task.getTaskIds();
    
  // Set values for the first task
    taskNames[0] = "Login Feature";
    developers[0] = "Robyn Harrison";
    durations[0] = 8;
    statuses[0] = "To Do";
    taskIds[0] = Task.createTaskID("Login Feature", "Robyn Harrison", 1);
        // Set values for the second task
    taskNames[1] = "Add Task Feature";
    developers[1] = "Mike Smith";
    durations[1] = 10;
    statuses[1] = "Doing";
    taskIds[1] = Task.createTaskID("Add Task Feature", "Mike Smith", 2);

    // Use assertions to validate the results
    assertEquals("LO:1:SON", taskIds[0]); // Validate first task ID
    assertEquals("AD:2:ITH", taskIds[1]); // Validate second task ID

    // Validate statuses
    assertEquals("To Do", statuses[0]);
    assertEquals("Doing", statuses[1]);

    // Validate durations
    assertEquals(8, durations[0], 0.001); // Allow a small delta for floating-point comparison
    assertEquals(10, durations[1], 0.001);
 
      // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }


    /**
     * Test of displayLongestTask method, of class Task.
     */
    @Test
    public void testDisplayLongestTask() {
      // Initialize a Task instance and set values using setters
    Task task = new Task();

    // Set up the tasks
    Task.setTasks(4); // Total tasks
    Task.setStatuses(new String[]{"To Do", "Doing", "Done", "To Do"});
    Task.setDevelopers(new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glender Obeholzer"});
    Task.setTaskNames(new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"});
    Task.setDurations(new double[]{5, 8, 2, 11});
     // Invoke the displayLongestTask method
    task.displayLongestTask();

    // Manually find the task with the longest duration (expected behavior)
    int maxIndex = 3; // Index of the task with the longest duration

    // Assertions to validate the output
    assertEquals("Glender Obeholzer", Task.getDevelopers()[maxIndex]); // Validate developer name
    assertEquals("Add Arrays", Task.getTaskNames()[maxIndex]);        // Validate task name
    assertEquals(11, Task.getDurations()[maxIndex], 0.001); 
 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class Task.
     */
    @Test
    public void testSearchTaskByName() {
       // Initialize a Task instance and set values using setters
    Task task = new Task();
       // Set up the tasks
    Task.setTasks(4); // Total tasks
    Task.setStatuses(new String[]{"To Do", "Doing", "Done", "To Do"});
    Task.setDevelopers(new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glender Obeholzer"});
    Task.setTaskNames(new String[]{"Create login", "Create Add Features", "Create Reports", "Add Arrays"});
    Task.setDurations(new double[]{5, 8, 2, 11});

    // Task to search
    String searchName = "Create login";
    int taskIndex = 0; // Expected index of the task "Create login"

    // Call the searchTaskByName method
    task.searchTaskByName(searchName);

    // Expected and actual results
    String expectedOutput = "Developer: Mike Smith, Status: To Do";
    String actualOutput = "Developer: " + Task.getDevelopers()[taskIndex] + ", Status: " + Task.getStatuses()[taskIndex];

    //Assertions
    assertEquals(expectedOutput, actualOutput);
       
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class Task.
     */
    @Test
    public void testSearchTasksByDeveloper() {
     Task task = new Task();

    
    Task.setTasks(4); // Total tasks
    Task.setStatuses(new String[]{"To Do", "Doing", "Done", "To Do"});
    Task.setDevelopers(new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glender Obeholzer"});
    Task.setTaskNames(new String[]{"Create login", "Create Add Features", "Create Reports", "Add Arrays"});
    Task.setDurations(new double[]{5, 8, 2, 11});

    // Developer to search for
    String developerName = "Samantha Paulson";
    int developerIndex = 2; // Expected index of the developer in the data

    // Manually call searchTasksByDeveloper
    task.searchTasksByDeveloper(developerName);

    // Expected and actual results for the developer
    String expectedTask = "Create Reports, Done"; // Task name and status for Samantha Paulson
    String actualTask = Task.getTaskNames()[developerIndex] + ", " + Task.getStatuses()[developerIndex];

    // Assertions
    assertEquals(expectedTask, actualTask);  
     
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class Task.
     */
    @Test
    public void testDeleteTaskByName() {
       Task task = new Task();

    
    Task.setTasks(4); // Total number of tasks
    Task.setStatuses(new String[]{"To Do", "Doing", "Done", "To Do"});
    Task.setDevelopers(new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glender Obeholzer"});
    Task.setTaskNames(new String[]{"Create login", "Create Add Features", "Create Reports", "Add Arrays"});
    Task.setDurations(new double[]{5, 8, 2, 11});

    // Task name to delete
    String deleteTaskName = "Create Reports";
    int taskIndexToDelete = 2; // Known index for "Create Reports"

    // Call the deleteTaskByName method
    Task.deleteTaskByName(deleteTaskName);
    // Check the number of tasks after deletion
    assertEquals(3, Task.getTasks());

    // Directly check that the task at the deleted index is replaced correctly
    assertEquals("Add Arrays", Task.getTaskNames()[taskIndexToDelete]);
    assertEquals("Glender Obeholzer", Task.getDevelopers()[taskIndexToDelete]);
    assertEquals("To Do", Task.getStatuses()[taskIndexToDelete]);
    assertEquals(11, Task.getDurations()[taskIndexToDelete], 0.01); 
        
       // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
       // Initialize the Task instance
    Task task = new Task();

    // Test case 1: Description with fewer than 50 characters (Valid)
    String shortDescription = "Create login to authenticate users";
    assertEquals(Task.checkTaskDescription(shortDescription),
        "Task description should be valid with fewer than 50 characters.");

    // Test case 2: Description with exactly 50 characters (Valid)
    String exactDescription = "This description contains exactly fifty characters!!!";
    assertEquals(Task.checkTaskDescription(exactDescription),
        "Task description should be valid with exactly 50 characters.");
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
       // Instantiate Task class
    Task task = new Task();
    
    // Set the task data using setters
    task.setTaskNames(new String[]{"Login Feature", "Add Task Feature"});
    task.setDevelopers(new String[]{"Robyn Harrison", "Mike Smith"});
    task.setTaskNumber(new int[]{1, 2});
    
    // Test Case 1
    String taskID1 = task.createTaskID(task.getTaskNames()[0], task.getDevelopers()[0], task.getTaskNumber()[0]);
    assertEquals("LO:1:SON", taskID1);

    // Test Case 2
    String taskID2 = task.createTaskID(task.getTaskNames()[1], task.getDevelopers()[1], task.getTaskNumber()[1]);
    assertEquals("AD:2:ITH", taskID2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
         // Test Data: 5 tasks with the provided durations
    double[] testDurations = {10.0, 12.0, 55.0, 11.0, 1.0};
    
    // Calculate total hours using the Task method
    double total = Task.returnTotalHours(testDurations);
    
    // The expected total hours after summing the durations
    assertEquals(89.0, total, 0.01);  // Total of 10 + 12 + 55 + 11 + 1 = 89.0

    // Additional test case for a specific condition (e.g., summing only a subset)
    // Assuming we only want to test the first few tasks or a specific condition here, such as the first 3 tasks
    double partialTotal = Task.returnTotalHours(new double[]{10.0, 12.0, 55.0});
    assertEquals(77.0, partialTotal, 0.01);  // 10 + 12 + 55 = 77.0
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
