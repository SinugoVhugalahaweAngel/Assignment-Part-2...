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
    
}
