/**
 * 
 */
package Assignment_3;																									// Package Declared
/**
 * Part1 and Part2 is coded in Student Class 
 * 
 * Part1 - Create a class Student which has some private data like name, phone number, roll number,
 * class, use getter and setters to access this private data.
 * 
 * Part2- Create a method result which accepts marks in three subjects along with the student roll number 
 * and return the result of that student as pass or fails. 
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
import java.util.InputMismatchException;																			  	// Import java utility to handle InputMismatchException 
import java.util.Scanner;																							  	// Import java utility to for user input	
import java.util.regex.Matcher;																						  	// Import java utility to handle Regular Expression		
import java.util.regex.Pattern;																						  	// Import java utility to handle Regular Expression
public class Student {																								  	// Student Class declared
	private String studentName;																						  	// Private Variable String initialized
    private long phoneNumber;																						  	// Private Variable long initialized
    private long rollNumber;																						  	// Private Variable long initialized
    private int studentClass;																						  	// Private Variable Integer initialized
    static float average;																							  	// static Variable float initialized
    
    public String getStudentName() {																				  	// getter method initialized
        Scanner scanner = new Scanner(System.in);																			  	// Initialize the scanner to get input from User
        System.out.print("Enter the Student Name    : ");															  	// This will print the argument at the end of the line
        try{																										  	// Try Block Started
            studentName= scanner.nextLine();																				  	// Read String input from the User
        }catch (InputMismatchException e) {																			  	// Try block closed and catch statement started for InputMismatchException
            System.out.println("Invalid Format - Please enter the Student Name again");}							  	// This will print the argument at the end of the line
        return studentName;}																						  	// If the condition is true then return studentName
    public void setStudentName() {																					 	// setter method initialized
        System.out.println("Name Of The Student : "+studentName);}													  	// This will print the argument in the next line
    
    public long getPhoneNumber() {																					  	// getter method initialized				  
        Scanner scanner = new Scanner(System.in);																			  	// Initialize the scanner to get input from User
        System.out.print("Enter Phone Number        : ");															    // This will print the argument at the end of the line
        phoneNumber = scanner.nextLong();																						// Read long input from the User
        String inputPhoneNumber = Long.toString(phoneNumber);										                    // convert Long to string.
        Pattern pattern = Pattern.compile("\\d{10}");											                        // The Pattern class represents a compiled regular expression.
        Matcher matcher = pattern.matcher(inputPhoneNumber );													        // The resulting Pattern object is used to obtain a Matcher instance.
        if (matcher.matches());																                            // if loop ..to check input from the User
          else {																										// else loop started
           System.out.println("Invalid Phone Number - Please enter the Phone number again");}		                	// This will print the argument at the end of the line	
        return phoneNumber;}																							// If the condition is true then return phoneNumber
    public void setPhoneNumber() {																						// setter method initialized
        System.out.println("Phone Number        : "+phoneNumber);}														// This will print the argument in the next line
    
    public long getRollNumber() {																						// getter method initialized													
        Scanner scanner = new Scanner(System.in);																				// Initialize the scanner to get input from User
        System.out.print("Enter 7 Digit Roll Number : ");																// This will print the argument at the end of the line
        rollNumber = scanner.nextLong();																						// Read long input from the Use
        String inputRollNumber = Long.toString(rollNumber);										                        // convert Integer to string.
        Pattern pattern = Pattern.compile("\\d{7}");											                        // The Pattern class represents a compiled regular expression.
        Matcher matcher = pattern.matcher(inputRollNumber );													        // The resulting Pattern object is used to obtain a Matcher instance.
        if (matcher.matches());																                            // if loop ..to match input from the User
        else {																											// else loop started
            System.out.println("Invalid Roll Number - Please enter the Phone number again");}                           // This will print the argument at the end of the line
        return rollNumber; }																							// If the condition is true then return rollNumber
    public void setRollNumber() {																						// setter method initialized
        System.out.println("Roll Number         : "+rollNumber);}														// This will print the argument in the next line
   
    public int getStudentClass() {																						// getter method initialized
        Scanner scanner = new Scanner(System.in);																				// Initialize the scanner to get input from User
        System.out.print("Enter Class               : ");																// This will print the argument at the end of the line
        studentClass = scanner.nextInt();																						// Read Integer input from the Use
        String inputStudentClass = Integer.toString(studentClass);										                // convert Integer to string.
        Pattern pattern = Pattern.compile("[0-1]{1}[0-9]{1}");											        		// The Pattern class represents a compiled regular expression.
        Matcher matcher = pattern.matcher(inputStudentClass );													        // The resulting Pattern object is used to obtain a Matcher instance.
        if (matcher.matches());																                            // if  loop ..to check match input from the User
        else {																											// else loop started
            System.out.println("Invalid Class - Please enter the Class again"); }                           			// if the binaryNum1 from the User is not 0 or 1 then it will print "Try again by entering binary number 0 or 1"
        return studentClass;  }																							// If the condition is true then return studentClass
    public void setStudentClass() {																						// setter method initialized
        System.out.println("Class               : " +studentClass); }													// This will print the argument in the next line
    
    public  void result(){																								// Result Method initialized
        this.getRollNumber();																							// getRollNumber() method called inside the result() method
        float sum;                                                                                               		// float (Variable) sum and average Declared
        Scanner scanner = new Scanner(System.in);																				// Initialize the scanner to get input from User
        System.out.print("Enter Physics Marks       : ");                                                               // This will print out the argument and ends the line
        float Physics = scanner.nextFloat();                                                                                  // Read float input Physics from the User
        System.out.print("Enter Chemistry Marks     : ");                                                               // This will print out the argument and ends the line
        float Chemistry = scanner.nextFloat();                                                                                // Read float input Chemistry from the User
        System.out.print("Enter Math Marks          : ");                                                                // This will print out the argument and ends the line
        float Maths = scanner.nextFloat();                                                                                    // Read float input Math from the User
        sum = Physics + Chemistry + Maths;                                                                              // Adding the value of Physics,Chemistry and Math floating variables and stored them in float variable sum
        average = sum / 3;	}																							// average is calculated of 3 subjects

    public void grade() {																								// grade Method initialized												
        System.out.print("Average Marks of a Student is "+ average+" and ");											// This will print out the argument and ends the line
        if(average>81)																									// if loop expression, to check the condition
        {System.out.print("Grade is A : Pass");}																		// then print GRADE A
        else if(average>=61 && average<=80)													    						// nested else if loop expression, to check the condition
        {System.out.print("Grade is B : Pass");}																		// then print GRADE B
        else if (average>41 && average<=60)															    				// nested else if loop expression, to check the condition
        {System.out.print("Grade is C : Pass");}																		// then print GRADE C
        else if (average>21 && average <=40)																			// nested else if loop expression, to check the condition
        {System.out.println("Grade is D : Fail"); }																		// then print GRADE D
        else if (average<20)																							// nested else if loop expression, to check the condition
        {System.out.println("Fail"); }	}																				// then print FAIL
}																														// Student Class ended
