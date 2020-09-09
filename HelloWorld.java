import java.util.Scanner;

/**
 * This class serves as an introduction to Java
 * It covers:
 * print statements
 * primitive variables
 * math operations
 * casting 
 * declaring Java objects
 * use of the String and Scanner classes
 * if statements
 * conditional operators
 * @author Kathleen Malone
 *
 */
public class HelloWorld {
	
	public static void main(String[] args) {
		
		//Do this and run program
		System.out.println("Hello World");
		
		//Java variables
		//We have 2 types: primitive and objects
		int i = 1; //whole number
		double d = 2.5; //floating point number
		//need f at end to identify it as a float as opposed to double
		float f = 1.5f; 
		char c = 'y';
		boolean b = true;
		
		//Math operations on primitive variables
		int five = 5;
		int result = five + 5;
		result = result - 5;
		double dResult = result * 2;
		dResult = dResult / 2;
		//mod operator is the remainder 
		//in this case mod would be 1. (5 / 2 is 2 with a remainder of 1)
		int mod = five % 2; // mod is 1
		
		//casting primitives
		//must use cast 
		result = (int) dResult - 5; //dResult is double, result is int
		dResult = result + 1; //do not need to cast int to double
		
		//Declaring Java objects
		//Java object models a real world object with state and behavior
		//We can think about it as code already written for us to use
		String s = new String("Hello");
		//Objects have methods to do manipulations or change its state
		//Here we are changing the state of the String from "Hello" to "HelloWorld"
		s.concat("World");
		System.out.println(s);
		
		//Java gives us a shortcut to use with Strings
		String s1 = "Hello World";
		
		//The Java Scanner object and importing packages
		//Scanner reads input entered from the terminal or from a File
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		//Call the next method on scan to read input from the terminal
		String name = scan.next();
		System.out.println("Hello "+name);		
		
		//if statements
		System.out.println("Enter a number:");
		int input = scan.nextInt();
		if(input==1) {
			System.out.println("input = 1");
		} else {
			System.out.println("input does not equal 1");
		}
		
		//Conditional Operators
		// == > < >= <= && ||
		if (input >= 1) {
			System.out.println("input greater than or equal to 1");
		}
		
		if (input > 0 && input < 5) {
			System.out.println("input is between 1 and 4");
		}
		
		if(input < 0 || input > 5) {
			System.out.println("input is less than 0 or greater than 5");
		}
		
		//else if statement using a Java object
		System.out.println("Would you like to play again?");
		String inString = scan.nextLine();
		if (inString.equals("yes")) {
			System.out.println("Let's play again");
		} else if (inString.equals("no")) {
			System.out.println("Quit");
		} else {
			System.out.println("Please enter yes or no");
		}
	}
}
