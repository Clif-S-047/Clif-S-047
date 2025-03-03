/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci_2350.i.studentgrademanagementsystem;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author icema
 */
//Phase 1
public class StudentGradeManagementSystem {
    private static final int MAX_STUDENTS = 100;
    private static final int SUBJECTS = 3;
    private static final String[] studentName = new String[MAX_STUDENTS];
    private static final int [][] studentGrades = new int[MAX_STUDENTS] [SUBJECTS];
    private static int studentCount = 0;
    
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = false; 
            //Create while loop for display and user input
            while (!exit) {
                System.out.println("Choose an option:");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. View Average Grades");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                switch (choice){
                    case 1 -> addStudent(scanner);
                    case 2 -> viewStudents();
                    case 3 -> viewAverageGrades();
                    case 4 -> exit = true;
                    default -> System.out.println("Invalid choice. Please try again");
                }
            }
        }
        }
    //Create method to add students
    //Enter student's name and grades for 3 subjects
    //Store information in variables (studentName, grade1, grade2, grade3)
    private static void addStudent(Scanner scanner) { 
        if (studentCount >= 100) {
            System.out.println("cannot add more students. Maximum limit reached.");
            return;
        }
        System.out.print("Enter student name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        studentName[studentCount] = name;
        
        System.out.println("Enter grades for subject 1: ");
        System.out.println("Enter grades for subject 2: ");
        System.out.println("Enter grades for subject 3: ");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "Subject:");
            studentGrades[studentCount] [i] = scanner.nextInt();        
        }
        studentCount++;
        System.out.println("Student added successfully.");
    }
    //Create functionality to view the details of recently added students
    //Display the student's name and their grades for the three subjects
    private static void viewStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }
        
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student Name: " + studentName[i]);
            System.out.println("Grade: ");
            for (int j = 0; j < 3; j++){
                System.out.println("Subject :" + (j + 1) + ":" + studentGrades[i][j]);
            }
            System.out.println();
        }
    }
//Create functionality to calculate and display the average grade of the recently added students
//Compute the average of grade1, grade2, grade3
//Display the average grade with appropriate formating
    private static void viewAverageGrades() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
                    return;
        }
        
        for(int i = 0; i < studentCount; i++) {
            int sum = 0;
            for (int j = 0; j < SUBJECTS; j++) {
                sum += studentGrades[i][j];
            }
            double average = (double) sum / SUBJECTS;
            System.out.println("Student; " + studentName[i] + ", Average Grade: " + average);
    }
}
}
