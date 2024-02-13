/* Author: Aaron Capron
   Instructor: TA Ali Nouri
   CS 1101
   This program prints out a user-interactive Certificate of Training
   Last modified: 1/29/2024
*/
import java.util.Scanner;
public class certificate {
	public static void main(String[] args) {
			
		// This piece of the code has the user input all variables.
		Scanner input = new Scanner (System.in);
		String firstName = " ";
		String lastName = " ";
		int courseNumber = 1111;
		int month = 1;
		int day = 1;
		int year = 1;
		String instructorName = " ";
		System.out.print("Please enter a first name: ");
		firstName = input.next();
		System.out.print("Please enter a last name: ");
		lastName = input.next();
		System.out.print("Please enter a course number: ");
		courseNumber = input.nextInt();
			// This code restricts course numbers under 1000 and over 9999.
			if (courseNumber > 9999) {
				System.out.print("Please enter a VALID course number: ");
			}
				if (courseNumber < 1000) {
				System.out.print("Please enter a VALID course number ");
			}
			System.out.print("Please enter a month: ");
		month = input.nextInt();
		// This set of code restricts month values under 0 and over 12.
			if (month <= 0) {
				System.out.print("Please enter a VALID month: ");
			}if (month > 12) {
				System.out.print("Please enter a VALID month: ");
			}
		System.out.print("Please enter a day: ");
		day = input.nextInt();
		System.out.print("Please enter a year: ");
		year = input.nextInt();
		if (year >= 2100) {
			System.out.print("Please enter a VALID year: ");
		}System.out.print("Please enter an instructor's name: ");
		instructorName = input.next();
		char slash = '/';
		// This piece of code actually writes out the certificate.
		System.out.print("\t\t\t  Certificate of Training:");
		System.out.print("\n---------------------------------------------------------------------------\n");
		System.out.print("\n\t\t    This is to certify that ");
		System.out.print(firstName + " " + lastName + " ");
		System.out.print("\n\t\thas successfully completed training in CS " +courseNumber);
		System.out.println("\n\t\t\t      Date: "+ month + slash + day + slash + year);
		System.out.println("\t\t\t      Signature: " + instructorName);
		System.out.print("\n---------------------------------------------------------------------------");
	}
}
