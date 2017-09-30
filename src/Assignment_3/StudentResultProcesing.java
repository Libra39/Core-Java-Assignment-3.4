/**
 * 
 */
package Assignment_3;																					// Package Declared

/**
 * Part3 is coded in StudentResultProcesing Class 
 * 
 * Part3- Create another class StudentResultProcesing and extend this class from the student class 
 * and it will print the result of a student. 
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class StudentResultProcesing extends Student{													// StudentResultProcesing Cat Declared which will inherit the properties of Student class
	public StudentResultProcesing() {																	// Class constructor created
        System.out.println("\n*********************************************************");				// This will print the argument at the end of the line
        System.out.println("                 Student Report Card                       ");				// This will print the argument at the end of the line
        System.out.println("*********************************************************");				// This will print the argument at the end of the line
    }																									// Class constructor Closed
    @Override																							// Method overriding Start 
    public void grade() {																				// Methods created
        super.grade();																					// super keyword is used to call all the arguments of grade() method in Student Class 	
    }																									// Method overriding closed
}																										// StudentResultProcesing class closed