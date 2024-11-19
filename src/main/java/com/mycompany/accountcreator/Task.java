/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountcreator;

import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class Task {

    private static String[] taskName;
    private static int[] taskNumber;
    private static String[] taskDescription;
    private static String[] developerDetails;
    private static double[] taskDuration;
    private static String[] taskID;
    private static String[] menu;
    private static int tasks = 0;

       
    // Arrays to store specific information for easy access
    private static String[] developers; // Developers assigned to tasks
    private static String[] taskNames;  // Names of the tasks
    private static String[] taskIds;    // IDs of the tasks
    private static double[] durations;  // Durations of the tasks
    private static String[] statuses;   // Statuses of the tasks
    
    public Task() {
        // Initialize arrays when the object is created
        developers = new String[100];
        taskNames = new String[100];
        taskIds = new String[100];
        durations = new double[100];
        statuses = new String[100];
    }
    
    // Getters and setters that will assits in testing 
    public static String[] getTaskName() {
        return taskName;
    }

    public static void setTaskName(String[] taskName) {
        Task.taskName = taskName;
    }

    public static int[] getTaskNumber() {
        return taskNumber;
    }

    public static void setTaskNumber(int[] taskNumber) {
        Task.taskNumber = taskNumber;
    } 
    public static String[] getTaskDescription() {
        return taskDescription;
    }

    public static void setTaskDescription(String[] taskDescription) {
        Task.taskDescription = taskDescription;
    }

    public static String[] getDeveloperDetails() {
        return developerDetails;
    }

    public static void setDeveloperDetails(String[] developerDetails) {
        Task.developerDetails = developerDetails;
    }

    public static double[] getTaskDuration() {
        return taskDuration;
    }
    
    public static void setTaskDuration(double[] taskDuration) {
        Task.taskDuration = taskDuration;
    }

    public static String[] getTaskID() {
        return taskID;
    }

    public static void setTaskID(String[] taskID) {
        Task.taskID = taskID;
    }
 public static String[] getMenu() {
        return menu;
    }

    public static void setMenu(String[] menu) {
        Task.menu = menu;
    }

    public static int getTasks() {
        return tasks;
    }

    public static void setTasks(int tasks) {
        Task.tasks = tasks;
    }
     public static String[] getDevelopers() {
        return developers;
    }

    public static void setDevelopers(String[] developers) {
        Task.developers = developers;
    }

    public static String[] getTaskNames() {
        return taskNames;
    }

    public static void setTaskNames(String[] taskNames) {
        Task.taskNames = taskNames;
    }
    public static String[] getTaskIds() {
        return taskIds;
    }

    public static void setTaskIds(String[] taskIds) {
        Task.taskIds = taskIds;
    }

    public static double[] getDurations() {
        return durations;
    }
 public static void setDurations(double[] durations) {
        Task.durations = durations;
    }

    public static String[] getStatuses() {
        return statuses;
    }

    public static void setStatuses(String[] statuses) {
        Task.statuses = statuses;
    }
    
    public static void addTasks() {
        double totalHours=0;
        // Ask how many tasks to enter using JOptionPane
        tasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks would you like to enter?"));

        taskDescription = new String[tasks];
        taskID = new String[tasks];
        menu = new String[tasks];
        taskName = new String[tasks];
        developerDetails = new String[tasks];
        taskNumber = new int[tasks];
        taskDuration = new double[tasks];

        for (int i = 0; i < tasks; i++) {
            // Input task name using JOptionPane
            taskName[i] = JOptionPane.showInputDialog(null, "Enter Task Name:");
            taskNames[i] = taskName[i];
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
            developers[i] = developerDetails[i];
            
            // Input task duration using JOptionPane
            taskDuration[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the task in hours :"));
            durations[i] = taskDuration[i];
            totalHours =  returnTotalHours(taskDuration);

            // Assign a unique task number and generate task ID
            taskNumber[i] = i;
            taskID[i] = createTaskID(taskName[i], developerDetails[i], taskNumber[i]);
            taskIds[i] = taskID[i];
            // Get task status
            menu[i] = taskStatus();
            statuses[i] = menu[i];

            // Display task details
            JOptionPane.showMessageDialog(null, "Task Details:\n" + printTaskDetails(i, taskID[i]));
            JOptionPane.showMessageDialog(null, "TotalHours:\n" +totalHours);
        }
    }
    
     // This method displays all tasks with the status 'Done'.
    public static void displayDoneTasks() {
        JOptionPane.showMessageDialog(null,"\nTasks with status 'Done':" );
        for (int i = 0; i < tasks; i++) {
            if (statuses[i].equalsIgnoreCase("done")) {
             JOptionPane.showMessageDialog(null,"Developer: " + developers[i] + ", Task: " + taskNames[i] + ", Duration: " + durations[i] );
            }
        }
    }
    
    // This method displays the task with the longest duration.
    // If no tasks are available, it shows a message indicating that.
    
      public static void displayLongestTask() {
        if (tasks == 0) {
             JOptionPane.showMessageDialog(null,"No tasks available." );
            return;
        }

        int maxIndex = 0;
        for (int i = 1; i < tasks; i++) {
            if (durations[i] > durations[maxIndex]) {
                maxIndex = i;
            }
        }
      
        JOptionPane.showMessageDialog(null,"\nTask with the longest duration:" );
        JOptionPane.showMessageDialog(null,"Developer: " + developers[maxIndex] + ", Task: " + taskNames[maxIndex] + ", Duration: " + durations[maxIndex]);
    }
    
      public static void searchTaskByName(String searchName) {
        for (int i = 0; i < tasks; i++) {
            if (taskNames[i].equalsIgnoreCase(searchName)) {
                 JOptionPane.showMessageDialog(null, "\nTask '" + searchName + "' Details:");
                JOptionPane.showMessageDialog(null,"Developer: " + developers[i] + ", Status: " + statuses[i] );
                return;
            }
        }
    
         JOptionPane.showMessageDialog(null, "Task '" + searchName + "' not found.");
    }
      
      /**
      * This method searches for tasks assigned to a specific developer and displays the details.
      * It uses a loop to go through the list of tasks and checks if the developer's name matches
      * the input parameter. If tasks are found, they are displayed using a dialog box.
      * If no tasks are found for the specified developer, an appropriate message is shown.
      *  developerName The name of the developer for whom tasks are being searched.
       */
       public static void searchTasksByDeveloper(String developerName) {
       JOptionPane.showMessageDialog(null, "\nTasks assigned to " + developerName + ":");
        boolean found = false;
        for (int i = 0; i < tasks; i++) {
            if (developers[i].equalsIgnoreCase(developerName)) {
             JOptionPane.showMessageDialog(null,"Task: " + taskNames[i] + ", Status: " + statuses[i] );
             found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null,"No tasks found for this developer.");
        }
    }
      
    /**
    
     * This method deletes a task by its name from the task list.
     * It iterates through the list of tasks to find the specified task name.
     * If the task is found, it shifts the subsequent task details up by one index to remove the task.
     * The total number of tasks is then decremented.
     * If the task is not found, a message is displayed indicating that the task was not found.
  
 */
       
   public static void deleteTaskByName(String deleteTaskName) {
        for (int i = 0; i < tasks; i++) {
            if (taskNames[i].equalsIgnoreCase(deleteTaskName)) {
                for (int j = i; j < tasks - 1; j++) {
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIds[j] = taskIds[j + 1];
                    durations[j] = durations[j + 1];
                    statuses[j] = statuses[j + 1];
                }
                tasks--;
                JOptionPane.showMessageDialog(null,"Task '" + deleteTaskName + "' deleted successfully.");
                return;
            }
        }
       JOptionPane.showMessageDialog(null,"Task '" + deleteTaskName + "' not found.");
    }
   
   /**
     * This method displays a full report of all tasks currently in the system.
     * It checks if there are any tasks available; if none exist, it prints a message indicating this.
     * If tasks are present, it iterates through each task and displays the task details
     * including Task ID, Task Name, Developer, Duration, and Status using dialog boxes.
    */
    public static void displayReport() {
      
       // System.out.println("\nFull Task Report:");
       JOptionPane.showMessageDialog(null,"\nFull Task Report:");
        if (tasks == 0) {
             JOptionPane.showMessageDialog(null,"No tasks available.");
            return;
        }
        for (int i = 0; i < tasks; i++) {
       JOptionPane.showMessageDialog(null,"Task ID: " + taskIds[i] + ", Task Name: " + taskNames[i] +
                               ", Developer: " + developers[i] + ", Duration: " + durations[i] +
                               ", Status: " + statuses[i]);

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

    //This Method ensures that the task description is not more than 50 Characters
    public static boolean checkTaskDescription(String description) {
        return description.length() <= 50;
    }

    //This Method creates and returns the taskID
    public static String createTaskID(String taskName, String developerDetails, int taskNumber) {
        String taskInitials = taskName.length() >= 2 ? taskName.substring(0, 2).toUpperCase() : taskName.toUpperCase();
        String devSuffix = developerDetails.length() >= 3 ? developerDetails.substring(developerDetails.length() - 3).toUpperCase() : developerDetails.toUpperCase();
        return taskInitials + ":" + taskNumber + ":" + devSuffix;
    }

    //This method returns the task full tasks details of each task
    public static String printTaskDetails(int index, String taskID) {
        return "Task Status: " + menu[index] + "\n"
                + "Developer Details: " + developerDetails[index] + "\n"
                + "Task Number: " + taskNumber[index] + "\n"
                + "Task Name: " + taskName[index] + "\n"
                + "Task Description: " + taskDescription[index] + "\n"
                + "Task ID: " + taskID + "\n"
                + "Task Duration: " + taskDuration[index] + " hours";
    }

    //This Method returns the total combined hours of all entered task
    public static double returnTotalHours(double [] durations) {
        
        double hours = 0;

       for(double duration: durations){
           hours += duration;
       }
        return hours;
    }
}
