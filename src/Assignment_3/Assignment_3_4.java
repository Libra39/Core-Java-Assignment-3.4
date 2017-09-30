package Assignment_3;																						// Package declared
/**
 * The Program is divided into 3 parts.
 * Part1 - Create a class Student which has some private data like name, phone number, roll number,
 * class, use getter and setters to access this private data.
 * 
 * Part2- Create a method result which accepts marks in three subjects along with the student roll number 
 * and return the result of that student as pass or fails. 
 * 
 * Part3- Create another class StudentResultProcesing and extend this class from the student class 
 * and it will print the result of a student. 
 *  
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_3_4 {																				// Class Declared
	public static void main(String[] args) {																// Main Method starts
        Student Student = new Student();																	// constructor of student class created
        Student.getStudentName();																			// Student object called the method Student.getStudentName() from Student Class
        Student.getStudentClass();																			// Student object called the method Student.getStudentClass() from Student Class
        Student.getPhoneNumber();																			// Student object called the method Student.getStudentNumber() from Student Class
        Student.result();																					// Student object called the method Student.result() from Student Class
        StudentResultProcesing StudentResult = new StudentResultProcesing();								// constructor of StudentResultProcesing class created
        Student.setStudentName();																			// Student object called the method setStudentName() from Student Class
        Student.setStudentClass();																			// Student object called the method setStudentClass() from Student Class
        Student.setPhoneNumber();																			// Student object called the method setPhoneNumber()from Student Class
        Student.setRollNumber();																			// Student object called the method setRollNumber()from Student Class
        StudentResult.grade();																				// StudentResult object called the method grade() from StudentResultProcesing Class
    }																										// Main Method Closed
}																											// Assignment_3_4 class closed
