package JAVA.REAL.TIME.EXAMPLE;

import java.util.Random;

public class School {
	
	// Static variable (Shared by all students)
    static String schoolName = "Sunrise Public School";
    
    // Instance variables (Unique for each student)
    String studentName;
    int rollNumber;

    // Constructor to initialize instance variables
    School(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    // Method to simulate exam (Local variable: marks)
    void exam() {
        int marks = new Random().nextInt(100); // Local variable stored in stack memory
        System.out.println(studentName + " scored " + marks + " marks in the exam.");
    }

    // Method to simulate competition game (Local variable: points)
    void competitionGame() {
        int points = new Random().nextInt(20); // Local variable stored in stack memory
        System.out.println(studentName + " scored " + points + " points in the competition.");
    }

    public static void main(String[] args) {
        // Object creation (Stored in heap memory)
        School student1 = new School("Rahul", 101);
        School student2 = new School("Anjali", 102);
        School student3 = new School("Anji", 10);
        School student4 = new School("pari", 19);
        
        // Calling methods
        student1.exam();
        student1.competitionGame();
       
        
        student2.exam();
        student2.competitionGame();
        
        student3.exam();
        student3.competitionGame();
        
        student4.exam();
        student4.competitionGame();
    }
}

/*
 * Memory Management Breakdown:
 * Method Area: Stores class-level information  (e.g., static schoolName). 
 * Heap: Stores objects and their instance variables  (e.g., studentName, rollNumber).
 * Stack: Stores method calls and local variables (e.g., marks, points). 
 * PC Register: Tracks the current instruction
 * 
 */

/*
 * Execution from Source File to Output: 
 * Compilation: javac School.java → Compiles into School.class (bytecode). 
 * Class Loading: JVM loads the class into the method area.
 * Bytecode Verification: JVM verifies the bytecode for security. 
 * Execution: JVM runs the bytecode (Interpreter or JIT Compiler).
 * Output: Results are displayed on the console.
 */



