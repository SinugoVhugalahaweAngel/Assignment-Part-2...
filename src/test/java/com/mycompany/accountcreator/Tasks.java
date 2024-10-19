/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountcreator;
//import java option pane
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Tasks {
    
    private static String[] taskName;
    private static int[] taskNumber;
    private static String[] taskDescription;
    private static String[] developerDetails;
    private static float[] taskDuration;
    private static String[] taskID;
    private static String[] menu;
    public static float totalHours = 0;
    public static int tasks = 0;
    
     public static void addTasks() {
        // Ask how many tasks to enter using JOptionPane
        tasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks would you like to enter?"));

        taskDescription = new String[tasks];
        taskID = new String[tasks];
        menu = new String[tasks];
        taskName = new String[tasks];
        developerDetails = new String[tasks];
        taskNumber = new int[tasks];
        taskDuration = new float[tasks];
        
        for (int i = 0; i < tasks; i++) {
            // Input task name using JOptionPane
            taskName[i] = JOptionPane.showInputDialog(null, "Enter Task Name:");

            // Input task description with validation
             while (true) {
            String description = JOptionPane.showInputDialog("Enter Task Description (max 50 characters):");
            if (checkTaskDescription(description)) {
                taskDescription[i] = description;
                // Show success message when description is valid
                JOptionPane.showMessageDialog(null, "Task description is successful.");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid task description. Please try again.");
            }
        }
          // Input developer details using JOptionPane
            developerDetails[i] = JOptionPane.showInputDialog(null, "Enter Developer Details (First and Last Name):");

            // Input task duration using JOptionPane
            taskDuration[i] = returnTotalHours();
            totalHours += taskDuration[i];

            // Assign a unique task number and generate task ID
            taskNumber[i] = i + 1;
            taskID[i] = createTaskID(taskName[i], developerDetails[i], taskNumber[i]);

            // Get task status
            menu[i] = taskStatus();

            // Display task details
            JOptionPane.showMessageDialog(null, "Task Details:\n" + printTaskDetails(i, taskID[i]));
        }
    }
     
     /**
 * Prompts the user to select a task status and returns the selected status.
 * Valid options are "To Do", "Doing", and "Done".
 */
        public static String taskStatus() {
        String status = "";
        boolean validInput = false;

        while (!validInput) {
            String statusInput = JOptionPane.showInputDialog(null, "Select Task Status:\n1. To Do\n2. Doing\n3. Done");

            int statusChoice = Integer.parseInt(statusInput);
            switch (statusChoice) {
                case 1:
                    status = "To Do";
                    validInput = true;
                    break;
                case 2:
                    status = "Doing";
                    validInput = true;
                    break;
                case 3:
                    status = "Done";
                    validInput = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please enter 1, 2, or 3.");
            }
        }

        return status;
    }
}
     }