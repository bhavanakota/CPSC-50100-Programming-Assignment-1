/* CPSC 50100 - Programming Fundamentals 
 * Bhavana Kota
 * Summer II 2020
 * Programming Assignment 1
 */

import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		
		// Printing title 
		
		System.out.print("Programming Fundamentals\n"
					+ "Name: Bhavana Kota\n"
					+ "PROGRAMMING ASSIGNMENT 1\n");
	
		System.out.println("\n");

		// Creating variables 

		int FirstNumber,SecondNumber,ThirdNumber,FourthNumber,FifthNumber; 
		int Total;
		int key;

		Scanner scan = new Scanner(System.in);

		System.out.print("Welcome to the Cipher program.\n");

		System.out.println("Please enter 5 numbers between 0 and 19");

		/*	
		 * Printing out each variable with the if command. 
		 * This catches any number entered less than 0 or greater than 19.
		 * This will automatically exit the program and let the user try again. 
		 */

		System.out.print("1st number: ");

			FirstNumber = scan.nextInt();

			if (FirstNumber < 0 || FirstNumber > 19 ) {
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}

		System.out.print("2nd number: ");

			SecondNumber = scan.nextInt();

			if (SecondNumber  < 0 || SecondNumber  > 19) {
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}

		System.out.print("3rd number: ");

			ThirdNumber = scan.nextInt();	

			if (ThirdNumber < 0 || ThirdNumber > 19) {

				System.out.println("Please read directions and try again!");
				System.exit(0);
			}

		System.out.print("4th number: ");

			FourthNumber = scan.nextInt();

			if (FourthNumber < 0 || FourthNumber > 19) {
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}

		System.out.print("5th number: ");

			FifthNumber = scan.nextInt();

			if (FifthNumber < 0 || FifthNumber > 19) {
				System.out.println("Please read directions and try again!");
				System.exit(0);
			}
			
			System.out.println("\n");
			scan.close();
			
		// The Total variable adds up the values and converts to a string. 

		Total = FirstNumber + SecondNumber + ThirdNumber + FourthNumber + FifthNumber;

		String PlainText = String.valueOf(Total);

		System.out.println("Total = " + PlainText);
		
		// Created the variable Length to determine the length of the PlainText string

		int Length = PlainText.length();

		// Initializes the key to a random variable between 0 and 9

		Random rand = new Random();

		int upperbound = 10;
		key = rand.nextInt(upperbound);
		
		System.out.println("Your random key is " + key);	
		
		// Solving for the ciphered number
		
		// If the Length is equal to 1, then we add a 0 for the tens place and then solve for the encoded value. 

		if (Length == 1 ) 
		{
			String Length2 = "0" + PlainText;
			
			int FirstValueCiphered = ((0 + key) % 10);

			int SecondValue = Character.getNumericValue(Length2.charAt(1));
			int SecondValueCiphered = ((SecondValue + key) % 10);
			
			System.out.println("Your encoded number is " + FirstValueCiphered + SecondValueCiphered);
			
		} else {

			int FirstValue = Character.getNumericValue(PlainText.charAt(0));
			int FirstValueCiphered = ((FirstValue + key) % 10);

			int SecondValue = Character.getNumericValue(PlainText.charAt(1));
			int SecondValueCiphered = ((SecondValue + key) % 10);

			System.out.println("Your encoded number is " + FirstValueCiphered + SecondValueCiphered);
	           }
	}

}
